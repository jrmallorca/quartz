---
tags: []
created_on: "2023-12-12"
deck: Zettelkasten
modified_on: 2025-03-20 19:15:41
---

# REST API statelessness

[[rest-api]]'s should be stateless. This means that each client [[http-request-methods]] invoked must include all information necessary for the server to complete the request. The server never relies on information from previous requests from the client.

## Related content

- [RESTful API](https://restfulapi.net/statelessness/)
- [ChatGPT](https://chat.openai.com/c/2c7e8843-4159-42cf-9656-f2123f7dfb08)

## Flashcards

Should _REST APIs_ be **stateful or stateless**? :: Stateless.^1704223777524

What does it MEAN for _REST APIs_ to be **stateless**? :: Each client HTTP request invoked includes all the information necessary for the server to complete the request. The server will not rely on previous information from the client.^1704223777644

In a _REST API_, should a **server store any previous information** RECEIVED from a CLIENT? :: No.^1704223777678
