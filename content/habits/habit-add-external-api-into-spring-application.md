---
tags:
  - java
  - spring
created_on: 2025-06-17
deck: Zettelkasten
modified_on: 2025-06-18 18:53:41
---

# Habit - Add external API into Spring application

## [[cue-in-terms-of-habits|Cues]]

## [[response-in-terms-of-habits|Responses]]

1. Add the [[openapi-specification]] dependency into Maven.
2. Create the `application.properties` file under `src/main/resources` and add the following:
  - `my-config-name.url=<LINK_TO_API_ENVIRONMENT>`
  - (If applicable) `my-config-name.awsServiceName=execute-api`
3. Create a [[spring-configuration-annotation]] class that contains the [[spring-bean-annotation]] to create the API within the Spring application as well as any request interceptors.

```java
@Bean
public DefaultApi applicationProcessEngineApi() {
    ClientHttpRequestFactory factory = new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory());
    var restTemplate = new RestTemplate(factory);
    restTemplate.setInterceptors(Collections.singletonList(applicationProcessEngineRequestInterceptor()));
    var client = new ApiClient(restTemplate);
    client.setBasePath(url);

    return new DefaultApi(client);
}
```

```java
private ClientHttpRequestInterceptor applicationProcessEngineRequestInterceptor() {
    return (request, body, execution) -> {
        log.debug("Using aws credentials to call the application process engine");
        // Don't let this object be autoclosed as we want AWS credentials to be cached.
        var provider = DefaultCredentialsProvider.create();
        DvlaAwsSigV4RequestSigner.signRequest(
            request,
            body,
            provider.resolveCredentials(),
            EU_WEST_2,
            awsServiceName
        );

        return execution.execute(request, body);
    };
}
```

4. (Optional) Create a [[spring-configuration-annotation]] class that contains [[spring-value-annotation]] fields for any common headers to put into the client class.
5. Create a client class to [[habit-separate-api-calls-and-its-try-catch-block-into-its-own-client-class-and-method]] and a field to create the [[spring-bean-annotation]] API from the configuration class.
6. Create a service class with the client class as a field. Create methods that contain the arguments required to call the API.
7. Create a controller class with the service class as a field.

## [[reward-in-terms-of-habits|Rewards]]

## Related content

## Flashcards

```anki
id: 1750329835168
deck: Zettelkasten
---
With the _habit of adding external APIs into a Spring application_, what is the **response**?
===
1. Add the OpenAPI dependency into the `pom.xml`.
2. Create the `application.properties` file under `src/main/resources` and add the following:
  - `my-config-name.url=<LINK_TO_API_ENVIRONMENT>`
  - (If applicable) `my-config-name.awsServiceName=execute-api`
3. Create a `@Configuration` class that contains the `@Bean` to create the API within the Spring application as well as any request interceptors.
4. (Optional) Create another `@Configuration` class that contains `@Value` fields for any common headers to put into the client class.
5. Create a client class to contain a method to call the API and a field to create the `@Bean` API object from the configuration class.
6. Create a service class with the client class as a field. Create methods that contain the arguments required to call the API.
7. Create a controller class with the service class as a field.
```

