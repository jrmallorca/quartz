---
tags:
  - java
  - spring
created_on: 2025-06-12
deck: Zettelkasten
modified_on: 2025-06-17 15:41:52
---

# Spring `@GetMapping` annotation

[[spring-framework]] `@GetMapping` annotation is a class-level and method-level annotation that is a shortcut of the [[spring-requestmapping-annotation]] to specify it is triggered by a HTTP GET method.

## Concrete example

```java
@GetMapping("/{id}")
public Person getPerson(@PathVariable Long id) {
  // ...
}
```

## Related content

- [Spring documentation](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-requestmapping.html)

## Flashcards

In _Spring_, what is the **`@GetMapping` annotation used for**? :: A class-level and method-level annotation that is a shortcut of the `@RequestMapping` to specify it is triggered by a HTTP GET method.^1749843329171
