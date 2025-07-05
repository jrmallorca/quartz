---
tags:
  - spring
  - java
  - work
created_on: 2025-06-26
deck: Zettelkasten
modified_on: 2025-06-26 10:55:17
---

# Habit - Mock static methods in Java with Mockito

## [[cue-in-terms-of-habits|Cues]]

Mocking third-party static methods for internally written functionality.

## [[response-in-terms-of-habits|Responses]]

1. In a test class, add the `MockedStatic<CLASS_WITH_STATIC_METHOD>` class as a field.
2. Create a [[spring-beforeeach-annotation]] `setUp()` method that initialises the `MockedStatic`.
3. Create a [[spring-aftereach-annotation]] `tearDown()` method that closes the `MockedStatic`.
4. Mock the static method in a related [[spring-test-annotation]] method.

### Concrete example

```java
public class StaticMockRegistrationUnitTest {

    private MockedStatic<StaticUtils> mockStatic;

    @BeforeEach
    public void setUp() {
        mockStatic = mockStatic(StaticUtils.class);
    }

    @AfterEach
    public void tearDown() {
        mockStatic.close();
    }

    @Test
    public void givenStaticMockRegistration_whenMocked_thenReturnsMockSuccessfully() {
        mockStatic.when(() -> StaticUtils.range(2, 6))
            .thenReturn(Arrays.asList(10, 11, 12));

        assertThat(StaticUtils.range(2, 6)).containsExactly(10, 11, 12);
    }
}
```

## [[reward-in-terms-of-habits|Rewards]]

## Related content

- Observed in DVLA code.
- [Baeldung - Mocking static methods](https://www.baeldung.com/mockito-mock-static-methods)
- [Baeldung - try-with-resources](https://www.baeldung.com/java-try-with-resources)

## Flashcards

```anki
id: 1750932321908
deck: Zettelkasten
---
With the _habit of mocking static methods in Java_, what is the **cue**?
===
Mocking third-party static methods for internally written functionality.
```
```anki
id: 1750932322095
deck: Zettelkasten
---
With the _habit of mocking static methods in Java_, what is the **response**?
===
1. In a test class, add the `MockedStatic<CLASS_WITH_STATIC_METHOD>` class as a field.
2. Create a `@BeforeEach` `setUp()` method that initialises the `MockedStatic`.
3. Create a `@AfterEach` `tearDown()` method that closes the `MockedStatic`.
4. Mock the static method in a related `@Test` method.
```


