---
Created on: 2024-04-30
tags: [oop, object-oriented-programming, work]
deck: Zettelkasten
---

# Differences between abstraction, encapsulation, and data hiding

[[data-abstraction-in-terms-of-object-oriented-programming]], [[encapsulation-in-terms-of-object-oriented-programming]], and [[data-hiding-in-terms-of-object-oriented-programming]] are different but highly related concepts.

Consider a person driving a car. Each car will have a way to `accelerate()` and `break()`. In [[encapsulation-in-terms-of-object-oriented-programming]], that would be like defining a `Car` class with `accelerate()` and `break()` methods.

Consider 2 different people driving a car. One of them has a normal Ford, while the other has a Lamborghini. Both cars still have a way to `accelerate()` and `break()` but they differ in the implementation. But the people driving doesn't care about the internal implementations, they just want to `brake()` or `accelerate()`. This is [[data-abstraction-in-terms-of-object-oriented-programming]].

Consider a child sitting in the back seat of a moving car. We definitely don't want a child to open the door while it's moving. By implementing a child lock, we can restrict opening the doors. In [[data-hiding-in-terms-of-object-oriented-programming]], that would be like putting `private` next to the `isRearDoorLocked` attribute of a `Car` class.

Abstraction exposes only the most necessary information to a user. Encapsulation wraps related data and functions into one unit. Data hiding restricts access to data.

## Related content

- [Tony Marston](https://www.tonymarston.co.uk/php-mysql/abstraction.txt)

## Flashcards

In _object-oriented programming_, what is the **difference** between **abstraction, encapsulation, and data hiding**? :: Abstraction exposes only the most necessary information to a user. Encapsulation wraps related data and functions into one unit. Data hiding restricts access to data.^1714826350045
