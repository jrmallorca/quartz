---
Created on: 2024-11-18 16:25
tags: []
deck: Zettelkasten
---

# Publish/subscribe pattern allows for loose coupling

The [[publish-subscribe-pattern]] allows for a [[loosely-coupled-system]] as the publishers and subscribers don't directly interact with each other.

The publisher has no knowledge of its subscribers, if any, and just generates messages. The same is true for subscribers which can opt in/out of receiving messages. Both the publisher and subscriber can be updated/replaced with minimal impact to performance.

## Related content

- [How does publish-subscribe design pattern establish loose coupling between components? C# - Stack Overflow](https://stackoverflow.com/questions/58572415/how-does-publish-subscribe-design-pattern-establish-loose-coupling-between-compo)

## Flashcards

With the _publish/subscribe pattern_, how does it ESTABLISH **loose coupling**? :: The publisher has no knowledge of its subscribers, if any, and just generates messages to the message bus. Subscribers only care about the message, and has no knowledge about the publisher.^1732017524762
