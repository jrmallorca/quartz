---
tags: []
created_on: 2025-06-25 1:37:47
deck: Zettelkasten
modified_on: 2025-06-25 22:00:21
---

# Modification process between monolithic and microservice architecture

Modifying anything in a [[monolithic-architecture]], as indicated in the [[development-process-between-monolithic-and-microservice-architectures]], may affect many features in the codebase and likely will require re-testing and re-deployment due to its tightly-coupled nature.

In [[microservice-architecture]], each service is independently deployable and [[loosely-coupled-system]] which likely won't affect the rest of the system due to a modification.

## Related content

- [Monolithic vs Microservices - Difference Between Software Development Architectures- AWS](https://aws.amazon.com/compare/the-difference-between-monolithic-and-microservices-architecture/)
- [[development-process-between-monolithic-and-microservice-architectures]]
- [[deployment-process-between-monolithic-and-microservice-architecture]]

## Flashcards

Between _monolithic and microservice architecture_, what is the **difference in MODIFICATION**? :: Modification in monolithic architectures will likely require re-testing and re-deployment due to its tightly-coupled nature. In microservice architecture, any modification will be contained in a single service which likely won't affect the rest of the system.^1750932293520
