---
tags:
  - work
  - programming
created_on: "2025-01-09"
deck: Zettelkasten
modified_on: 2025-01-09 16:49:34
---

# Docker can standardise development environments to be the same as production environments

Docker can standardise development environments to act the same as production environments. This prevents the "It works on my machine" problem.

For example, if any tests succeed on a development environment but fail during the pipeline, we can use docker to simulate the environment it runs on to see why it fails.

## Related content

- [HowToGeek](https://www.howtogeek.com/devops/what-does-docker-do-and-when-should-you-use-it/#why-is-docker-so-useful)
- Former coworker Terence Quirke.

## Flashcards

How could _Docker_ **prevent "It works on my machine" problems**? :: Simulate production environments locally.^1736441270525
