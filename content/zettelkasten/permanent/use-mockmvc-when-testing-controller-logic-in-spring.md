---
tags:
  - java
  - spring
created_on: 2025-06-11
deck: Zettelkasten
modified_on: 2025-06-25 20:44:43
---

# Use `MockMvc` when testing controller logic in Spring

Use `MockMvc` to test any controller-related logic in a [[spring-boot]] application by calling its endpoints under specified conditions and retrieving its results.

Avoid merely calling the controller's internal methods and checking their results. This does not test the connectivity between the web layer and its service layer.

If controllers had logic to extensively unit test, it is a sign to refactor it into a service. Ideally, it should just be testing what happens when you call an endpoint.

## Concrete example

- [[habit-test-controller-layer-in-spring-application]]

## Related content

- [StackOverflow](https://stackoverflow.com/questions/43138249/why-use-springs-mock-mvc-when-you-have-unit-test-of-your-controller-classes#43138861)

## Flashcards

When _testing Spring controller-related logic_, what **class** provided by `@WebMvcTest` should be used? :: `MockMvc`.^1749843329420

When _testing Spring controller-related logic_, why should **`MockMvc` be used**? :: To test connectivity between the web and service layers by calling a controller's endpoints under specified conditions and checking its results.^1749843329431

When _testing Spring controller-related logic_, why should we **invoke the method THROUGH AN ENDPOINT and check its results**? :: Controller tests should test the connectivity between the web layer and its service layer. ^1749843329444
