---
tags:
  - java
  - spring
created_on: 2025-06-11
deck: Zettelkasten
modified_on: 2025-06-28 10:54:46
---

# Spring `@Spy` annotation

[[spring-framework]] `@Spy` annotation is a field-level annotation that creates a real instance of the field to inject within another field annotated with [[spring-injectmocks-annotation]]. Unlike [[spring-mock-annotation]], it will use real results from calling any of the spy's methods.

## Related content

- [HowToDoInJava](https://howtodoinjava.com/mockito/mockito-annotations/)

## Flashcards

In _Spring_, what is the **`@Spy` annotation used for**? :: A field-level annotation that creates a real instance of the field to inject within another field annotated with `@InjectMocks`. Unlike `@Mock`, it will use real results from calling any of the spy's methods.^1750185369256
