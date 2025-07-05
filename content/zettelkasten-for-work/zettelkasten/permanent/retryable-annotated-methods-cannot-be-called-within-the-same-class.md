---
tags:
  - work
  - java
  - spring
created_on: "2025-03-28"
deck: Zettelkasten
modified_on: 2025-03-28 16:01:48
---

# `@Retryable` annotated methods cannot be called within the class it's defined in

Methods that are annotated with `@Retryable` cannot be called in the class it's defined in. This is why we have the [[habit-separate-api-calls-and-its-try-catch-block-into-its-own-client-class-and-method]].

## Related content

- [[naomi-davidson]] and [[etienne-badoche]]'s PR to make an API call retry-able.

## Flashcards

In _Spring_, can methods annotated with `@Retryable` **be called within the class it's defined in**? :: No.^1743178450066

In _Spring_, how can a method annotated with `@Retryable` that is called within the class it's defined in **be refactored**? :: Separate the method to be annotated with `@Retryable` into its own class and method.^1743178450080
