---
tags:
  - java
  - spring
  - work
created_on: "2025-02-25"
deck: Zettelkasten
modified_on: 2025-02-26 14:44:33
---

# Test custom exception handling with `@WebMvcTest` annotation

While we usually [[test-controller-logic-with-web-mvc-test-annotation]], it also loads any class annotated with `@ControllerAdvice`, [[controller-advice-annotation-associates-a-class-as-a-global-exception-handler-for-all-controllers]]. This is useful for testing custom exception handling for existing exceptions (e.g., `MethodArgumentNotValidException`).

For custom exception handling for custom or simpler exceptions, testing the actual exception handling class itself would likely be more appropriate.

## Concrete example

```java
@WebMvcTest
@AutoConfigureWebClient
class ValidationTest {
    @Autowired
    private MockMvc mockMvc;

	// Can be removed if no service in controller.
	@MockitoBean
	private SomeService someservice;

    private final String endpoint = "some/end/point"

    @Test
    void testFieldIsNull() throws Exception {
        mockMvc.perform(
           post(endpoint)
              .content(request.toPrettyString())
        )
        .andExpect(status().isBadRequest())
        .andExpect(result -> assertTrue(result.getResponse().getContentAsString().contains("Custom exception message")));
    }
}
```

## Related content

- [Baeldung](https://www.baeldung.com/spring-mockmvc-vs-webmvctest)
- [[custom-exception-handling-in-java-spring]]
- [[web-mvc-test-annotation-is-more-lightweight-than-spring-boot-test-annotation]]

## Flashcards

In _Java Spring_, how can **exception handlers with `@ControllerAdvice` for EXISTING exceptions** be TESTED? :: Write a test class with `@WebMvcTest`.^1741007614033

In _Java Spring_, how can **exception handlers with `@ControllerAdvice` for CUSTOM or SIMPLER exceptions** be TESTED? :: Write a regular test class for any methods annotated with `@ExceptionHandler`.^1741007614052
