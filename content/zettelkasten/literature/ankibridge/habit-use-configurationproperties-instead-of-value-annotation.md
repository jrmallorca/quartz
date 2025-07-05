---
tags:
  - java
  - spring
  - work
created_on: 2025-07-03
deck: Zettelkasten
modified_on: 2025-07-03 16:38:20
---

# Habit - Use `@ConfigurationProperties` instead of `@Value` annotation

## [[cue-in-terms-of-habits|Cues]]

- At least 3 `@Value` annotations are (going to be) used.
- Many properties to inject from the `application.properties`.

## [[response-in-terms-of-habits|Responses]]

1. Create the `application.properties` and declare each variable and its value.
2. Create a configuration class annotated with [[spring-configuration-annotation]], `@ConfigurationProperties("<PREFIX>")`, and `@Getter`.
3. Declare fields within the class that follows the names in the `application.properties`, following the `<PREFIX>`.
4. Declare the configuration class as a field in the class you want to inject the configuration property values.

## [[reward-in-terms-of-habits|Rewards]]

## Related content

- [[configuration-classes-can-be-injected-anywhere]]

## Flashcards

```anki
deck: Zettelkasten
---
With the _habit of using `@ConfigurationProperties` instead of `@Value`_, what is the **cue**?
===
- At least 3 `@Value` annotations are (going to be) used.
- Many properties to inject from the `application.properties`.
```

```anki
deck: Zettelkasten
---
With the _habit of using `@ConfigurationProperties` instead of `@Value`_, what is the **response**?
===
1. Create the `application.properties` and declare each variable and its value.
2. Create a configuration class annotated with `@Configuration`, `@ConfigurationProperties("<PREFIX>")`, and `@Getter`.
3. Declare fields within the class that follows the names in the `application.properties`, following the `<PREFIX>`.
4. Declare the configuration class as a field in the class you want to inject the configuration property values.
```

