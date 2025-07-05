---
tags:
  - java
  - spring
  - work
created_on: "2025-02-25"
deck: Zettelkasten
modified_on: 2025-02-26 14:45:05
---

# `@ExceptionHandler` annotation associates a method to handle a certain exception

The `@ExceptionHandler` annotation associates a method to override the handling of an exception. Through it, a custom message or response can be outputted due to the exception.

This can be used within either of the following:

- A global exception handler, [[controller-advice-annotation-associates-a-class-as-a-global-exception-handler-for-all-controllers]].
- Within a controller.

## Concrete example

```java
// Method to handle IllegalArgumentException
@ExceptionHandler(IllegalArgumentException.class)
public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
    // Return a custom error message with HTTP 400 status
    return new ResponseEntity<>("Error: " + ex.getMessage(), HttpStatus.BAD_REQUEST);
}
```

## Related content

- [GeeksForGeeks](https://www.geeksforgeeks.org/spring-mvc-controlleradvice-annotation-for-global-exception-handling/)
- [[custom-exception-handling-in-java-spring]]
- [[controller-advice-annotation-associates-a-class-as-a-global-exception-handler-for-all-controllers]]

## Flashcards

What is the `@ExceptionHandler` annotation **used for**? :: Associates a method as the exception handler for a specified exception.^1741007613615

When should the `@ExceptionHandler` annotation be **used**? :: To handle a single custom or existing exception through a method within a controller or an exception handler class.^1741007613633
