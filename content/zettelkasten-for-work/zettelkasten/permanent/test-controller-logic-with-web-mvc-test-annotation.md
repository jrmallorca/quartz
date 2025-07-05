---
tags:
  - java
  - spring
  - work
created_on: 2025-02-26
deck: Zettelkasten
modified_on: 2025-06-11 18:58:34
---

# Test controller logic with `@WebMvcTest` annotation

The `@WebMvcTest` annotation is used to create controller-related tests.

## Concrete example

```java
@WebMvcTest
class ControllerTest {
    @Autowired
    private MockMvc mockMvc;

    // Can be removed if no service in controller.
    @MockitoBean
    private SomeService someService;

    @Test
    void testControllerLogic() {
        // Implementation here
    }
}
```

## Related content

- [[custom-exception-handling-in-java-spring]]
- [[test-custom-exception-handling-with-web-mvc-test-annotation]]
- [[habit-test-controller-layer-in-spring-application]]

## Flashcards

What is the `@WebMvcTest` annotation **used for**? :: Test controller-related logic.^1741007614007
