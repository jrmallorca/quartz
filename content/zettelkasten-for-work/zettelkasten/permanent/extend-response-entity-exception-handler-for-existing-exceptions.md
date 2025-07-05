---
tags:
  - java
  - spring
  - work
created_on: "2025-02-26"
deck: Zettelkasten
modified_on: 2025-02-26 14:48:13
---

# Extend `ResponseEntityExceptionHandler` for existing exceptions

After associating a class as an exception handler, [[controller-advice-annotation-associates-a-class-as-a-global-exception-handler-for-all-controllers]], we can extend the class `ResponseEntityExceptionHandler` to override any methods that handle existing exceptions

This avoids needing to implement [[exception-handler-annotation-associates-a-method-to-handle-a-certain-exception]].

## Concrete example

```java
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  @Override
  protected ResponseEntity<Object> handleMethodArgumentNotValid(
    MethodArgumentNotValidException ex,
    HttpHeaders headers,
    HttpStatus status,
    WebRequest request) {
      // Implementation here
  }
}
```

## Related content

- [StackOverflow](https://stackoverflow.com/questions/71678557/what-is-the-usage-of-extending-responseentityexceptionhandler)

## Flashcards

In _Java Spring_, when should an **exception handler extend the `ResponseEntityExceptionHandler`**? :: To override existing Spring exception handlers.^1741007613658
