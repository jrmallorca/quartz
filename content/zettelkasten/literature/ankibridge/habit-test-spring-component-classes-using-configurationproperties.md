---
tags:
  - java
  - spring
  - work
created_on: 2025-07-03
deck: Zettelkasten
modified_on: 2025-07-03 16:42:26
---

# Habit - Test Spring `@Component` classes using `@ConfigurationProperties`

## [[cue-in-terms-of-habits|Cues]]

Testing any Spring component that has a configuration class that uses `@ConfigurationProperties`.

## [[response-in-terms-of-habits|Responses]]

1. Declare the [[spring-configuration-annotation]] class as a field annotated with [[spring-spy-annotation]] in the test class.
2. Call getters for the configuration properties you want to inject. 

## [[reward-in-terms-of-habits|Rewards]]

## Related content

- [[habit-use-configurationproperties-instead-of-value-annotation]]

## Flashcards

```anki
deck: Zettelkasten
---
With the _habit of testing Spring `@Component` classes using `@ConfigurationProperties`_, what is the **cue**?
===
Testing any Spring component that has a configuration class that uses `@ConfigurationProperties`.
```

```anki
deck: Zettelkasten
---
With the _habit of testing Spring `@Component` classes using `@ConfigurationProperties`_, what is the **response**?
===
1. Declare the `@Configuration` class as a field annotated with `@Spy` in the test class.
2. Call getters for the configuration properties you want to inject. 
```

