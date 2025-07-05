---
tags:
  - java
  - spring
created_on: 2025-06-12
deck: Zettelkasten
modified_on: 2025-06-23 17:05:06
---

# Habit - Test repository layer in Spring application

## [[cue-in-terms-of-habits|Cues]]

Before or during writing a Spring repository.

## [[response-in-terms-of-habits|Responses]]

1. Create a test class under `src/test`.
2. Annotate the class with [[spring-datajpatest-annotation]].
3. Create a field of the repository being tested annotated with [[spring-autowired-annotation]].
5. Create initial test annotated with `@Test`.
  1. **Arrange** any expected results and objects to be used.
  2. **Act** out the repository method being tested.
  3. **Assert** the result by calling `assertEquals(expected, actual)`.

## [[reward-in-terms-of-habits|Rewards]]

## Related content

- [[habit-test-service-layer-in-spring-application]]
- [[habit-test-controller-layer-in-spring-application]]

- [Medium - Explanations of annotations used](https://medium.com/@vipisanan1/test-driven-development-tdd-in-spring-boot-with-junit-and-mockito-0da0a247e5ef)

## Flashcards

```anki
id: 1749842966899
deck: Zettelkasten
---
With the _habit of testing the repository layer in Spring applications_, what is the **cue**?
===
Before or during writing a Spring repository.
```

```anki
id: 1749842966949
deck: Zettelkasten
---
With the _habit of testing the repository layer in Spring applications_, what is the **response**?
===
1. Create a test class under `src/test`.
2. Annotate the class with `@DataJpaTest.
3. Create a field of the repository being tested annotated with `@Autowired`.
5. Create initial test annotated with `@Test`.
  1. **Arrange** any expected results and objects to be used.
  2. **Act** out the repository method being tested.
  3. **Assert** the result by calling `assertEquals(expected, actual)`.
```

