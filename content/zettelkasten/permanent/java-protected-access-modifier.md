---
tags:
  - java
created_on: 2025-06-26
deck: Zettelkasten
modified_on: 2025-06-26 18:05:00
---

# Java protected access modifier

A method or field with the `protected` access modifier can only be used within the same package the class is defined in or in its subclasses.

## Concrete example

```java
public class A {
    protected void display() {
        System.out.println("GeeksforGeeks");
    }
}
```

## Related content

- [[capgemini-first-interview-notes]]
- [[java-private-access-modifier]]
- [[java-public-access-modifier]]
- [[java-default-access-modifier]]

## Flashcards

In _Java_, what is the `protected` **access modifier**? :: Protected methods or fields can only be used within its subclasses or in the same package the class it's defined in.^1751108128521

In _Java_, can a **class have a `protected` access modifier**? :: No.^1751108128542
