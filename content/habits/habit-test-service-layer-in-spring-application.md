---
tags:
  - java
  - spring
created_on: 2025-06-11
deck: Zettelkasten
modified_on: 2025-06-12 08:30:05
---

# Habit - Test service layer in Spring application

## [[cue-in-terms-of-habits|Cues]]

Before or during writing a Spring service.

## [[response-in-terms-of-habits|Responses]]

1. Create a test class under `src/test/resources`.
2. Annotate the class with [[spring-extendwith-mockitoextension-class-annotation]]
3. Create a field of the service that is being tested annotated with [[spring-injectmocks-annotation]]
4. Create fields of other services and repositories and annotate with [[spring-mock-annotation]]
5. Create initial test annotated with [[spring-test-annotation]].
  1. **Arrange** any expected results and mock any services and/or repositories required.
  2. **Act** out the service method being tested.
  3. **Assert** the result by calling `assertEquals(expected, actual)`.

## [[reward-in-terms-of-habits|Rewards]]

## Related content

- [[habit-test-repository-layer-in-spring-application]]
- [[habit-test-controller-layer-in-spring-application]]

- [Medium - Explanations of annotations used](https://medium.com/@vipisanan1/test-driven-development-tdd-in-spring-boot-with-junit-and-mockito-0da0a247e5ef)

## Flashcards

```anki
id: 1749842973349
deck: Zettelkasten
---
With the _habit of testing the service layer in Spring applications_, what is the **cue**?
===
Before or during writing a Spring service.
```
```anki
id: 1749842973400
deck: Zettelkasten
---
With the _habit of testing the service layer in Spring applications_, what is the **response**?
===
1. Create a test class under `src/test/resources`.
2. Annotate the class with `@ExtendWith(MockitoExtension.class)`.
3. Create a field of the service that is being tested annotated with `@InjectMocks`.
4. Create fields of other services and repositories and annotate with `@Mock`.
5. Create initial test annotated with `@Test`.
  1. **Arrange** any expected results and mock any services and/or repositories required.
  2. **Act** out the service method being tested.
  3. **Assert** the result by calling `assertEquals(expected, actual)`.
```


