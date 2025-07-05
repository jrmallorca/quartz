---
tags:
  - work
  - java
  - spring
created_on: 2025-03-28
deck: Zettelkasten
modified_on: 2025-06-17 16:38:04
---

# Spring `@Bean` annotation

[[spring-framework]] `@Bean` annotation is a method-level annotation to instantiate, configure, and initialise a new object from an external dependency to inject within the Spring application context. It returns an instance of the class.

This is typically used within [[spring-configuration-annotation]] when [[spring-component-annotation]] cannot be used. For example, you cannot annotate generated code or code from external dependencies.

## Concrete example

Beans are typically used when we're creating classes with [[spring-configuration-annotation]]. We create a rest template as the client of an API and associate that as a `@Bean`.

## Related content

- [Spring](https://docs.spring.io/spring-framework/reference/core/beans/java/bean-annotation.html)
- [[configuration-properties-annotation-associates-a-class-to-get-field-values-from-application-properties-file]]

## Flashcards

In _Spring_, what is the `@Bean` **annotation**? :: A method-level annotation to instantiate, configure, and initialise a new object from an external dependency to inject within the Spring application context. It returns an instance of the class.^1743178198022

In _Spring_, when should the `@Bean` annotation **be used**? :: Within a `@Configuration` class to inject third-party dependencies within a Spring application context.^1743178198039
