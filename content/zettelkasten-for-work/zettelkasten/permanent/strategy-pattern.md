---
tags:
  - work
created_on: 2025-03-05 4:34:03
deck: Zettelkasten
modified_on: 2025-03-05 20:28:30
---

# Strategy pattern

The strategy pattern is a behavioural design pattern that allows for the definition of multiple algorithms and implements them interchangeably.

## Analogy

## Concrete example

Imagine we're creating a class `Animal` that can be subclassed as `Ant`, `Bird`, `Dog`. Each `Animal` must be able to make a `sound()`, but all of them would make different types of sounds.

The strategy pattern would override the `sound()` method from the `Animal` parent class for each subclass to make their own sound.

## Related content

- [Strategy](https://refactoring.guru/design-patterns/strategy)
- [[strategy-pattern-in-oop-uses-polymorphism]]
- [[habit-strategy-pattern-with-enums-in-java]]

## Flashcards

What is the **strategy pattern**? :: The strategy pattern is a behavioural design pattern that defines multiple algorithms that are interchangeable during runtime.^1741206645330

What is a _simple example of the strategy pattern_, **in terms of animals**? :: Imagine we're creating a class `Animal` that can be subclassed as `Ant`, `Bird`, `Dog`. Each `Animal` must be able to make a `sound()`, but all of them would make different types of sounds. The strategy pattern would override the `sound()` method from the `Animal` parent class for each subclass to make their own sound.^1741206645345
