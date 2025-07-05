---
tags:
  - java
  - spring
created_on: 2025-06-11
deck: Zettelkasten
modified_on: 2025-06-17 15:44:34
---

# Spring `@RequestMapping` annotation

[[spring-framework]] `@RequestMapping` annotation is a class-level and method-level annotation that maps web requests to a class annotated with [[spring-controller-annotation]].

## Concrete example

- [[spring-requestmapping-class-level-annotation-can-specify-a-base-endpoint]]

```java
@RequestMapping(value = "/ex/foos", method = RequestMethod.GET)
@ResponseBody
public String getFoosBySimplePath() {
    return "Get some Foos";
}
```

## Related content

- [[spring-getmapping-annotation]]
- [[spring-postmapping-annotation]]

- [Baeldung](https://www.baeldung.com/spring-requestmapping)
- [Spring documentation](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-requestmapping.html)

## Flashcards

In _Spring_, what is the **`@RequestMapping` annotation used for**? :: A class-level and method-level annotation that maps web requests to a class annotated with `@Controller`.^1749843329261
