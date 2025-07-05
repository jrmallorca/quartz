---
tags:
  - java
  - spring
  - work
created_on: 2025-04-08 2:38:29
deck: Zettelkasten
modified_on: 2025-05-28 16:45:37
---

# Inject mocked dependencies into fields annotated with `@Autowire` inside a `@SpringBootTest`

In tests annotated with `@SpringBootTest`, fields can be injected dependencies into any fields annotated with `@Autowire`. Usually, anything with `@Autowire` in a test would have the "real" component injected into the test.
Instead, we could do the following:

- An internal `@Configuration` class in the test class that specifies dependencies as `@Bean` and `@Primary`.
  - I observed this in DVLA. Although through research and verification with Matthew Collins, I then realised the next option.
- `@MockitoBean` which will have a mocked component injected into the test.

Annotating dependencies with `@MockitoBean` will likely be the preferred method.

## Concrete example

```java
@SpringBootTest
class UserServiceTest {

    @MockitoBean
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Test
    void testGetUserById() {
        User mockUser = new User(1L, "John Doe");

        Mockito.when(userRepository.findById(1L)).thenReturn(Optional.of(mockUser));

        User result = userService.getUserById(1L);
        assertEquals("John Doe", result.getName());
    }
}
```

## Related content

- [Java Guides](https://www.javaguides.net/2025/03/mockitobean-annotation-in-spring-boot.html)

## Flashcards

When _injecting mocked dependencies into fields annotated with `@Autowire` inside a `@SpringBootTest`_, what **annotation should the dependency have**? :: `@MockitoBean`.^1749458018994
