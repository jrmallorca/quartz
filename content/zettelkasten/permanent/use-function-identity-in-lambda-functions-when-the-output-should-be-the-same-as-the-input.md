---
tags:
  - java
  - programming
created_on: "2024-10-30"
deck: Zettelkasten
modified_on: 2025-03-09 19:48:38
---

# Use `Function.identity()` in lambda functions when the output should be the same as the input

In Java, `Function.identity()` is used when you require a `Function` that just returns the same instance of the input.

This is typically used/seen in lambda functions or streams. Particularly when doing  `Stream.collect(Collectors.toMap())`.

## Related content

- Sam Lloyd

## Flashcards

In _Java_, what does `Function.identity()` DO? :: Return the same instance of the input.^1730751137948

In _Java_, where is `Function.identity()` **typically used/seen**? :: Lambda functions or streams.^1730751137969
