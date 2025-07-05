---
tags:
  - work
  - java
  - spring
created_on: "2025-03-28"
deck: Zettelkasten
modified_on: 2025-03-28 15:23:20
---

# Difference between `@Component` and `@Bean` annotations

Both the `@Component` and `@Bean` annotation define objects that can be injected anywhere required in a Spring application context.

The differences are the following:

- `@Component` is a class-level annotation while `@Bean` is a method-level annotation.
- The `@Component` annotation is for internally written objects. `@Bean` annotation is for objects from external dependencies.

## Related content

- [StackOverflow](https://stackoverflow.com/a/40861225)
- [[spring-configuration-annotation]]
- [[spring-bean-annotation]]

## Flashcards

Between _`@Component` and `@Bean` in a Spring application_, what is the **similarity**? :: Both are used for their respective objects to be injected wherever needed in the Spring application context.^1743178198182

Between _`@Component` and `@Bean` in a Spring application_, what are the **differences**? :: `@Component` is a class-level annotation for internally written objects. `@Bean` is a method-level annotation for objects from external dependencies.^1743178198196

Between _`@Component` and `@Bean` in a Spring application_, what are the **similarities and differences**? :: `@Component` is a class-level annotation for internally written objects. `@Bean` is a method-level annotation for objects from external dependencies. Both are used for their respective objects to be injected wherever needed in the Spring application context.^1743178198208
