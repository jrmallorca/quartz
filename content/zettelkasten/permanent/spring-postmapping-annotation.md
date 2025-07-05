---
tags:
  - java
  - spring
created_on: 2025-06-12
deck: Zettelkasten
modified_on: 2025-06-17 15:43:58
---

# Spring `@PostMapping` annotation

[[spring-framework]] `@PostMapping` annotation is a class-level and method-level annotation that is a shortcut of the [[spring-requestmapping-annotation]] to specify it is triggered by a HTTP POST method.

## Concrete example

```java
@PostMapping("/students/{id}")
public void updateStudent(@PathVariable("id") String id, @RequestBody Student student) {
    // Update the student record here.
}
```

## Related content

- [Spring documentation](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-requestmapping.html)
- [GeeksForGeeks](https://www.geeksforgeeks.org/spring-postmapping-and-getmapping-annotation/)

## Flashcards

In _Spring_, what is the **`@PostMapping` annotation used for**? :: A class-level and method-level annotation that is a shortcut of the `@RequestMapping` to specify it is triggered by a HTTP POST method.^1749843329243
