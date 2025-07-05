---
tags:
  - java
created_on: 2025-06-26
deck: Zettelkasten
modified_on: 2025-06-26 17:57:49
---

# Java default access modifier

A class, method, or field that has no access modifier prefixed to it has the default access modifier.

Only classes within the same package can access it.

## Concrete example

```java
package p1; 

// Class has default access modifier
class Geek { 
    // Method has default access modifier
    void display() { 
        System.out.println("Hello World!"); 
    } 
}
```

## Related content

- [GeeksForGeeks](https://www.geeksforgeeks.org/java/access-modifiers-java/)
- [[java-private-access-modifier]]
- [[java-public-access-modifier]]
- [[java-protected-access-modifier]]

## Flashcards

In _Java_ when a _class, method, or field has no prefixed access modifier_, what **does it mean**? :: The class, method, or field has the default access modifier.^1751108128485

In _Java_, what is the **default access modifier**? :: Classes within the same package can access it.^1751108128501
