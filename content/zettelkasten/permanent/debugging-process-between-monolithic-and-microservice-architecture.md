---
tags: []
created_on: 2025-06-25 1:20:28
deck: Zettelkasten
modified_on: 2025-06-25 22:00:14
---

# Debugging process between monolithic and microservice architecture

Debugging a [[monolithic-architecture]] will be easier as we're able to trace code in a single database.

Due to the [[loosely-coupled-system]] nature of [[microservice-architecture]], tracing the bug across multiple services would be harder. It may take more time and resources due to coordination between teams to identify the bug.

However, if the bug is only confined in 1 service, then it is easier.

## Related content

- [Monolithic vs Microservices - Difference Between Software Development Architectures- AWS](https://aws.amazon.com/compare/the-difference-between-monolithic-and-microservices-architecture/)

## Flashcards

Between _monolithic and microservice architecture_, what is the **difference in the DEBUGGING process**? :: Monolithic architectures can trace code movement across multiple features in a single codebase. Microservice architecture may be harder to trace movement due to its loosely-coupled nature and will take time and resources from coordinating with multiple teams.^1750932293417
