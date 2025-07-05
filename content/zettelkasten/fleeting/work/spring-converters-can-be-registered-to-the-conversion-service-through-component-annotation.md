---
Created on: 2023-12-04
tags: [java, to-add-links]
deck: Zettelkasten
---

# Spring converters can be registered to the ConversionService through `@Component` annotation

For any `Converter` classes that implement `Converter<S, T>`, annotating it with `@Component` will register it as a `Converter`.

This means the `Converter<S, T>`, when converting from type `S` to type `T`, will be recognised by the `ConversionService` interface and used.

## Related content

- [Stack Overflow](https://stackoverflow.com/questions/75664484/spring-boot-not-registering-conversionservice-converters-at-startup)
- [Baeldung](https://www.baeldung.com/spring-type-conversions)

## Flashcards

For a _Spring Converter class_, what **annotation** can be used to REGISTER it to be recognised by the ConversionService? :: @Component.^1701769366746

For a _Spring Converter class_, what will annotating the class with **@Component** do? :: Register it as a Converter in ConversionService for converting from a type S to type T.^1701769366780
