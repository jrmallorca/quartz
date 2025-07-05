---
Created on: 2024-11-19 15:35
tags: []
deck: Zettelkasten
---

# Message queue pattern allows for loose coupling

The [[message-queue-pattern]] allows for a [[loosely-coupled-system]] as the producers and consumers don't directly interact with each other.

The producer has no knowledge of its consumer and just generates messages; the same is true for consumers. Both the producer and consumer can be updated/replaced with minimal impact to performance.

## Related content

- [Message Queue pattern · Microservices Architecture](https://badia-kharroubi.gitbooks.io/microservices-architecture/content/patterns/communication-patterns/message-queue-pattern.html)

## Flashcards

With the _message queue pattern_, how does it ESTABLISH **loose coupling**? :: The producer has no knowledge of its consumer and just generates messages to the queue. Consumers only care about the message, and has no knowledge about the producer.^1732654410933
