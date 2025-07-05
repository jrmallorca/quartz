---
tags:
  - java
  - spring
created_on: 2025-06-12
deck: Zettelkasten
modified_on: 2025-06-12 08:52:46
---

# Spring `@RequestMapping` class-level annotation can specify a base path pattern for an endpoint

The [[spring-requestmapping-annotation]] can be used as a class-level annotation for a class annotated with [[spring-controller-annotation]] to specify a base path pattern for an endpoint.

## Concrete example

```java
@RestController
@RequestMapping("/persons")
class PersonController {

	@GetMapping("/{id}")
	public Person getPerson(@PathVariable Long id) {
		// ...
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void add(@RequestBody Person person) {
		// ...
	}
}
```

## Related content

- [Spring documentation](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-requestmapping.html)

## Flashcards

In _a Spring controller_ how can a **base path pattern be specified**?? :: Annotate the class with `@RequestMapping("/<BASE_PATH_PATTERN>")`.^1749843329279
