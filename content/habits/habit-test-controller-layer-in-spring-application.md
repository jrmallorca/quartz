---
tags:
  - java
  - spring
created_on: 2025-06-11
deck: Zettelkasten
modified_on: 2025-06-24 09:41:55
---

# Habit - Test controller layer in Spring application

## [[cue-in-terms-of-habits|Cues]]

Before or during writing a Spring controller.

## [[response-in-terms-of-habits|Responses]]

1. Create a test class under `src/test`.
2. Annotate the class with [[spring-webmvctest-annotation]].
3. Create a field `MockMvc mockMvc` annotated with [[spring-autowired-annotation]].
4. Create fields of the services used in the controller and annotate with [[spring-mockitobean-annotation]]
5. Create a field `ObjectWriter objectWriter = new ObjectMapper().writer()` to write requests and responses into JSON.
6. Create initial test annotated with [[spring-test-annotation]].
  1. **Arrange** any expected results and mock any services required.
  2. **Act** out the `mockMvc` by calling `mockMvc.perform().andExpect().andReturn()`. 
  3. **Assert** the result by calling `assertEquals(expected, actual)`.

### Example

```java
@WebMvcTest
class ControllerTest {
    @Autowired
    private MockMvc mockMvc;

    // Can be removed if no service in controller.
    @MockitoBean
    private SomeService someService;

    private final ObjectWriter objectWriter = new ObjectMapper().writer();

    @Test
    void testGetAllThings() {
        List<Thing> thingList = List.of(new Thing(1), new Thing(2));
        String expectedResponseJson = objectWriter.writeValueAsString(thingList);
        when(someService.findAll()).thenReturn(thingList);

        MvcResult result = mockMvc
            .perform(
                get("/things")
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andReturn();

        assertEquals(expectedResponseJson, result.getResponse().getContentAsString());
    }
}
```

## [[reward-in-terms-of-habits|Rewards]]

## Related content

- [[test-controller-logic-with-web-mvc-test-annotation]]
- [[habit-test-repository-layer-in-spring-application]]
- [[habit-test-service-layer-in-spring-application]]

- [Baeldung - Information on `@WebMvcTest`](https://www.baeldung.com/spring-mockmvc-vs-webmvctest)
- [HowToDoInJava - Information on MockMvc](https://howtodoinjava.com/spring-boot2/testing/spring-boot-mockmvc-example/)
- [Java Guides](https://www.javaguides.net/2025/03/avoid-mockbean-use-mockitobean-for-unit-testing.html)
- [Medium - Explanations of annotations used](https://medium.com/@vipisanan1/test-driven-development-tdd-in-spring-boot-with-junit-and-mockito-0da0a247e5ef)

## Flashcards

```anki
id: 1749843014202
deck: Zettelkasten
---
With the _habit of testing the controller layer in Spring applications_, what is the **cue**?
===
Before or during writing a Spring controller.
```

```anki
id: 1749843014247
deck: Zettelkasten
---
With the _habit of testing the controller layer in Spring applications_, what is the **response**?
===
1. Create a test class under `src/test`.
2. Annotate the class with `@WebMvcTest`.
3. Create a field `MockMvc mockMvc` annotated with `@Autowired`.
4. Create fields of the services used in the controller and annotate with `@MockitoBean`.
5. Create a field `ObjectWriter objectWriter = new ObjectMapper().writer()` to write requests and responses into JSON.
6. Create initial test annotated with `@Test`.
  1. **Arrange** any expected results and mock any services required.
  2. **Act** out the `mockMvc` by calling `mockMvc.perform().andExpect().andReturn()`. 
  3. **Assert** the result by calling `assertEquals(expected, actual)`.
```

