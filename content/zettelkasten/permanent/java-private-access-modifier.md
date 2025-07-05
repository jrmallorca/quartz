---
tags:
  - java
created_on: 2025-06-26
deck: Zettelkasten
modified_on: 2025-06-26 17:59:14
---

# Java private access modifier

A method or field with the `private` access modifier can only be used within the class it's defined in. Other classes will not be able to use it. 

## Concrete example

```java
class A {
    private void display() {
        System.out.println("GeeksforGeeks");
    }
}
```

## Related content

- [[capgemini-first-interview-notes]]
- [[java-public-access-modifier]]
- [[java-default-access-modifier]]
- [[java-protected-access-modifier]]
- [[private-methods-cannot-be-overridden]]

## Flashcards

In _Java_, what is the `private` **access modifier**? :: Private methods or fields can only be used within the class it's defined in. No other class will be able to see or use it.^1751489672345

In _Java_, can a **class have a `private` access modifier**? :: No.^1751489672359
