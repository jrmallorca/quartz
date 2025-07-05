---
Created on: 2024-09-06
tags: [work, programming]
deck: Zettelkasten
---

# OpenAPI endpoint response

When defining the responses during [[define-api-endpoints-in-openapi-descriptions]], we can provide the description and its content.

- `description` (string): Description of purpose of the response.
- `content` (Content object): [[openapi-content-object]].

## Example

```
"200":
  description: "OK"
  content:
    application/json:
      schema:
        ...
```

## Related content

- [OpenAPI](https://learn.openapis.org/specification/content.html)

## Flashcards

When *defining API endpoints in an OpenAPI description*, what are **ALL relevant fields of the Response object**? :: `description` and `content`, with its respective `media`, `schema`, and `type`.^1725654616261
