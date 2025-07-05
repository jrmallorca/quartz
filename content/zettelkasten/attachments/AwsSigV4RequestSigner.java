@UtilityClass
public final class AwsSigV4RequestSigner {
    private static final int BASE = 16;
    private static final int PAD_LIMIT = 32;
    private static final String AWS_SHA256_HEADER = "X-Amz-Content-Sha256";

    private static void signRequest(HttpRequest request, byte[] body, AwsCredentials credentials, Region region, String serviceName) {
        if (body.length == 0) {
            request.getHeaders().remove(HttpHeaders.CONTENT_LENGTH);
        }

        SdkHttpFullRequest signableRequest = createSignableRequest(request, body, credentials, region, serviceName);

        request.getHeaders().clear();
        request.getHeaders().add(AWS_SHA256_HEADER, toHexString(getSHA(new String(body, UTF_8))));
        request.getHeaders().pulAll(signableRequest.headers());
    }

    private static byte[] getSHA(String input) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(input.getBytes(UTF_8));
        } catch (Exception e) {
            // Check system if this happens as SHA-256 should always be available.
            throw new IllegalStateException("SHA-256 algorithm could not be retrieved on this system.", e);
        }
    }

    private static String toHexString(byte[] hash) {
        // Convert byte array into signum representation
        var number = new BigInteger(1, hash);

        // Convert message digest into hex value
        var hexString = new StringBuilder(number.toString(BASE));

        // Pad with leading zeroes
        while (hexString.length() < PAD_LIMIT) {
            hexString.insert(0, '0');
        }

        return hexString.toString();
    }

    private static SdkHttpFullRequest createSignableRequest(HttpRequest request, byte[] body, AwsCredentials credentials, Region region, String serviceName) {
        SdkHttpFullRequest signableRequest = SdkHttpFullRequest.builder()
            .uri(request.getURI())
            .encodedPath(request.getURI().getRawPath())
            .method(SdkHttpMethod.fromValue(request.getMethod().name()))
            .headers(httpRequest.getHeaders())
            .contentStreamProvider(() -> new StringInputStream(new String(bytes, UTF_8)))
            .build();

        return signSignableRequest(credentials, region, serviceName, signableRequest);
    }

    private static SdkHttpFullRequest signSignableRequest(AwsCredentials credentials, Region region, String serviceName, SdkHttpFullRequest signableRequest) {
        var signer = Aws4Signer.create();

        return signer.sign(
            signableRequest,
            Aws4SignerParams
                .builder()
                .signingRegion(region)
                .signingName(serviceName)
                .awsCredentials(credentials)
                .build()
        )
    }
}
