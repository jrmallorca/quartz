---
tags:
  - java
  - spring
  - work
created_on: 2025-04-15 9:18:00
deck: Zettelkasten
modified_on: 2025-05-29 08:42:51
---

# Habit - Ensure custom "find"-prefixed repository methods in Spring `@Repository` annotated class returns an `Optional`

## [[cue-in-terms-of-habits|Cues]]

Implementing a custom "find"-prefixed method in a Spring `@Repository` annotated class.

## [[response-in-terms-of-habits|Responses]]

Ensure that custom "find"-prefixed methods return an `Optional`.

## [[reward-in-terms-of-habits|Rewards]]

Having it return an `Optional` will ease exception handling. For example:

```java
orderRepository.findByCustomerAndPayment(customer, payment).orElseThrow(() -> new ResourceNotFoundException("customer", "id", customer.getId()));
```

Spring is smart enough to know how to implement it.

## Related content

- [Spring Data Support for Java Optional, Streams, Future \| Baeldung](https://www.baeldung.com/spring-data-java-8)
- [How to throw exceptions on search methods in spring data jpa - Stack Overflow](https://stackoverflow.com/questions/39849574/how-to-throw-exceptions-on-search-methods-in-spring-data-jpa)

## Flashcards

```anki
id: 1749457921804
deck: Zettelkasten
---
With the _habit of ensuring custom "find"-prefixed repository methods in Spring `@Repository` annotated class returns an `Optional`_, what is the **cue**?
===
Implementing a custom "find"-prefixed method in a Spring `@Repository` annotated class.
```
```anki
id: 1749457921829
deck: Zettelkasten
---
With the _habit of ensuring custom "find"-prefixed repository methods in Spring `@Repository` annotated class returns an `Optional`_, what is the **response**?
===
Ensure method returns an `Optional`.
```

