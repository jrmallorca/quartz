---
tags:
  - java
  - spring
  - work
created_on: "2025-02-25"
deck: Zettelkasten
modified_on: 2025-02-26 14:43:07
---

# `@ControllerAdvice` annotation associates a class as a global exception handler for all controllers

The `@ControllerAdvice` annotation associates a class as a global exception handler for all controllers in the application to override the handling of certain exceptions.

## Concrete example

```java
@ControllerAdvice // Global exception handler for all controllers
public class GlobalExceptionHandler {

    // Method to handle IllegalArgumentException
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        // Return a custom error message with HTTP 400 status
        return new ResponseEntity<>("Error: " + ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    // Method to handle generic exceptions
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneralException(Exception ex) {
        // Return a custom error message with HTTP 500 status
        return new ResponseEntity<>("An unexpected error occurred: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
```

## Related content

- [GeeksForGeeks](https://www.geeksforgeeks.org/spring-mvc-controlleradvice-annotation-for-global-exception-handling/)
- [StackOverflow](https://stackoverflow.com/questions/50504918/custom-controlleradvice-in-spring-for-exception-handling)
- [[custom-exception-handling-in-java-spring]]
- [[exception-handler-annotation-associates-a-method-to-handle-a-certain-exception]]
- [[extend-response-entity-exception-handler-for-existing-exceptions]]

## Flashcards

What is the `@ControllerAdvice` annotation **used for**? :: Associates a class as the global exception handler for all controllers in a Java Spring application.^1741007613566

When should the `@ControllerAdvice` annotation be **used**? :: To handle one or multiple custom or existing exceptions through a global exception handler.^1741007613585
