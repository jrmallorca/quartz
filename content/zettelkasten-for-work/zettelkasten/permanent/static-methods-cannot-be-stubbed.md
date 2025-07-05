---
tags:
  - java
  - work
created_on: "2025-03-19"
deck: Zettelkasten
modified_on: 2025-03-19 08:48:58
---

# Static methods cannot be stubbed

Static methods cannot be stubbed. Consider dependency injection, e.g. [[opt-for-constructor-injection-for-dependency-injection]], to allow for stubbing functionality in tests.

## Concrete example

Utility classes involve static methods to be used throughout an application. On [[naomi-davidson]]'s PR, [[gareth-edwards]] replied on [[gurpal-sian]]'s comment about using static methods in a utility class. Due to its usage, it is unable to be stubbed.

## Related content

- [StackOverflow](https://stackoverflow.com/questions/11591564/why-are-static-methods-untestable)

## Flashcards

In terms of _testing_, what is the **problem with static methods**? :: Static methods used in other parts of the application cannot be stubbed.^1742454331272
