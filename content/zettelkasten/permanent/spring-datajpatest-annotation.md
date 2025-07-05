---
tags:
  - java
  - spring
created_on: 2025-06-11
deck: Zettelkasten
modified_on: 2025-06-17 15:42:06
---

# Spring `@DataJpaTest` annotation

[[spring-framework]] `@DataJpaTest` annotation is a class-level annotation to test JPA repositories in isolation by configuring an in-memory database (H2 by default) and loading beans annotated with [[spring-entity-annotation]].

## Analogy

It's similar to [[spring-webmvctest-annotation]] which only runs a few components of a Spring application to test controller-related logic. With `@DataJpaTest` though, it isolates the repository to test its logic.

## Concrete example

- [[habit-test-repository-layer-in-spring-application]]

## Related content

- [Medium](https://medium.com/@vipisanan1/test-driven-development-tdd-in-spring-boot-with-junit-and-mockito-0da0a247e5ef)

## Flashcards

In _Spring_, what is the **`@DataJpaTest` annotation used for**? :: A class-level annotation to test JPA repositories in isolation by configuring an in-memory database, H2 by default, and loading beans annotated with `@Entity`.^1749843329102
