---
Created on: 2023-12-07
tags: [java, lombok]
deck: Zettelkasten
---

# Lombok `@RequiredArgsConstructor` annotation

The [[lombok]] `@RequiredArgsConstructor`  annotation generates a constructor with 1 parameter for each field that requires special handling:
    - All fields with [[lombok-non-null-annotation]],
    - All non-initialised final fields.

## Related content

- [Project Lombok](https://projectlombok.org/features/constructor)

## Flashcards

In _Lombok_, what does the **`@RequiredArgsConstructor` annotation** PROVIDE? :: Generates a constructor with 1 parameter for each field that requires special handling.^1704223241066

In _Lombok_ `@RequiredArgsConstructor` annotation, which **fields** are considered SPECIAL HANDLING? :: All fields with `@NonNull` annotation, and all non-initialised final fields.^1704223241101
