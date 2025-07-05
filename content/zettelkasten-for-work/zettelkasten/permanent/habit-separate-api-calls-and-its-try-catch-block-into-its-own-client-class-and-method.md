---
tags:
  - work
  - java
  - spring
created_on: 2025-03-19
deck: Zettelkasten
modified_on: 2025-06-17 19:45:41
---

# Habit - Separate API calls and its try/catch block into its own client class and public method

[[zettelkasten/permanent/application-programming-interface-api]] calls and its respective try/catch block should be separated into its own client class and public method. This separates API calls from our own written business logic.

## [[cue-in-terms-of-habits|Cues]]

Calling to an external API.

## [[response-in-terms-of-habits|Responses]]

1. Create a class suffixed with "Client".
2. Annotate it with [[spring-component-annotation]] and [[lombok-required-args-constructor-annotation]].
3. Create a public method that encapsulates the API call and its respective try/catch block.
4. Call the method and any business logic before/after it.

## [[reward-in-terms-of-habits|Rewards]]

- A clear distinction from API calls and business logic.
- API call is unit-testable.

## Related content

- [[etienne-badoche]]

## Flashcards

```anki
id: 1750185873991
deck: Zettelkasten
---
With the _habit of separating API calls and its try/catch block into its own class and public method_, what is the **cue**?
===
Calling to an external API.
```

```anki
id: 1750185874315
deck: Zettelkasten
---
With the _habit of separating API calls and its try/catch block into its own class and public method_, what is the **response**?
===
1. Create a class suffixed with "Client".
2. Annotate it with `@Component` and `@RequiredArgsConstructor`.
3. Create a public method that encapsulates the API call and its respective try/catch block.
4. Call the method and any business logic before/after it.
```

```anki
id: 1750185874665
deck: Zettelkasten
---
With the _habit of separating API calls and its try/catch block into its own class and public method_, what is the **reward**?
===
Separation of API calls and business logic, and unit-testable API calls.
```

