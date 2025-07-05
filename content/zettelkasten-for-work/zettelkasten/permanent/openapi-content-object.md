---
Created on: 2024-09-06
tags: [work, programming]
deck: Zettelkasten
---

# OpenAPI content object

In the [[openapi-specification]], the content object refers to the contents of either a request or response.

The content needs the following fields defined:

- `media` (Media type object): The format of the content (e.g., `application/json` and `text/html`).
    - `schema` (Schema object): [[openapi-schema-object]].

## Example

```
content:
  application/json:
    schema:
      ...
```

## Related content

- [OpenAPI](https://learn.openapis.org/specification/content.html)

## Flashcards

In an *OpenAPI description*, what is the **Content object**? :: The contents of either a request or response.^1725654616142

When *defining a Content object in an OpenAPI description*, what is the **Media type object**? :: The format of the content (e.g., `application/json` and `text/html`).^1725654616155
