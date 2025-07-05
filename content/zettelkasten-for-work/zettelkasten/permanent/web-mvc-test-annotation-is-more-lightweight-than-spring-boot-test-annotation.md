---
tags:
  - java
  - spring
  - work
created_on: "2025-02-26"
deck: Zettelkasten
modified_on: 2025-02-26 14:43:50
---

# `@WebMvcTest` annotation is more lightweight than `@SpringBootTest` annotation

The `@WebMvcTest` annotation is more lightweight than `@SpringBootTest` annotation as it doesn't load the whole application context. It only loads beans annotated with `@Controller`, `@RestController`, `@ControllerAdvice`.

## Related content

- [StackOverflow](https://stackoverflow.com/a/76172780)
- [[test-controller-logic-with-web-mvc-test-annotation]]
- [[test-custom-exception-handling-with-web-mvc-test-annotation]]

## Flashcards

Why is the `@WebMvcTest` **more lightweight than** `@SpringBootTest`? :: It doesn't load the whole application context. It only loads beans annotated with `@Controller`, `@RestController`, `@ControllerAdvice`.^1741007614074
