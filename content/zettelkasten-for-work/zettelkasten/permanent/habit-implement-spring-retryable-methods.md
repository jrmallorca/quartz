---
tags:
  - java
  - spring
  - work
created_on: 2025-04-08 2:05:57
deck: Zettelkasten
modified_on: 2025-06-17 19:45:27
---

# Habit - Implement Spring `@Retryable` methods

## [[cue-in-terms-of-habits|Cues]]

Implementing API calls which requires retrying on fail.

## [[response-in-terms-of-habits|Responses]]

1. Add `spring-retry` and `spring-aspects` dependencies into `pom.xml`
2. Create an empty `AppConfig` class annotated with [[spring-configuration-annotation]] and [[spring-enableretry-annotation]].
4. Create 2 exceptions about the call to the API, one suffixed with "Retryable" and one without.
5. [[habit-separate-api-calls-and-its-try-catch-block-into-its-own-client-class-and-method]]
6. In the try/catch block of the method in the client class, define which specific exceptions from the API, e.g. `RestClientException` or `HttpClientErrorException`, throws our custom exceptions to indicate if it's retryable or not.
7. Annotate the client class with [[spring-retryable-annotation]].
8. Add values for retry configuration as [[configuration-properties-annotation-associates-a-class-to-get-field-values-from-application-properties-file]].
9. Configure the [[spring-retryable-annotation]] method with values from the configuration properties.

For example:

```java
@Retryable(
    retryFor = RetryableStartApplicationException.class,
    maxAttemptsExpression = "${process.commit.retry.maxAttempts:4}",
    backoff = @Backoff(
        random = true,
        delayExpression = "${process.commit.retry.delay:500}",
        multiplierExpression = "${process.commit.retry.multiplier:2}",
        maxDelayExpression = "${process.commit.retry.maxDelay:2000}"
    )
)
```

## [[reward-in-terms-of-habits|Rewards]]

## Related content

- [Baeldung](https://www.baeldung.com/spring-retry)
- [[retryable-annotated-methods-cannot-be-called-within-the-same-class]]

## Flashcards

```anki
id: 1749457987307
deck: Zettelkasten
---
With the _habit of implementing Spring `@Retryable` methods_, what is the **cue**?
===
Implementing API calls which requires retrying on fail.
```

```anki
id: 1749457987353
deck: Zettelkasten
---
With the _habit of implementing Spring `@Retryable` methods_, what is the **response**?
===
1. Add `spring-retry` and `spring-aspects` dependencies into `pom.xml`
2. Create an empty `AppConfig` class annotated with `@Configuration` and `@EnableRetry`.
4. Create 2 exceptions about the call to the API, one suffixed with "Retryable" and one without.
5. Create a client class to contain a method with a try/catch block to call the API.
6. In the try/catch block of the method in the client class, define which specific exceptions from the API, e.g. `RestClientException` or `HttpClientErrorException`, throws our custom exceptions to indicate if it's retryable or not.
7. Annotate the client class with `@Retryable`.
8. Add values for retry configuration in the `application.properties` file.
9. Configure the `@Retryable` method with values from the configuration properties.
```

