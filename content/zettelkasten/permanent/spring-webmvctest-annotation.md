---
tags:
  - java
  - spring
created_on: 2025-06-11
deck: Zettelkasten
modified_on: 2025-06-17 15:45:01
---

# Spring `@WebMvcTest` annotation

[[spring-framework]] `@WebMvcTest` annotation is a class-level annotation that loads beans annotated with `@Controller`, `@RestController`, `@ControllerAdvice` and provides a `MockMvc` to test controller-related logic.

## Concrete example

- [[habit-test-controller-layer-in-spring-application]]
- [[test-custom-exception-handling-with-web-mvc-test-annotation]]

## Related content

- [Spring documentation](https://docs.spring.io/spring-boot/api/java/org/springframework/boot/test/autoconfigure/web/servlet/WebMvcTest.html)
- [[web-mvc-test-annotation-is-more-lightweight-than-spring-boot-test-annotation]]

## Flashcards

In _Spring_, what is the **`@WebMvcTest` annotation used for**? :: A class-level annotation that loads beans annotated with `@Controller`, `@RestController`, `@ControllerAdvice` and provides a `MockMvc` to test controller-related logic.^1749843329343
