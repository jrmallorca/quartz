---
Created on: 2024-09-06
tags: [work, programming]
deck: Zettelkasten
---

# Define API endpoints in OpenAPI descriptions

In the [[openapi-description-file]], we can define each [[rest-endpoint]] through the `paths` object in the [[openapi-object]].

- `path` (Path object): This is the name of the path prefixed with an `/` (e.g., `/user`).
    - `operation` (Operation object): This is the HTTP method associated with the `path` (e.g., `get` and `put`).
        - `summary` (string): Summary of purpose of the path's operation.
        - `description` (string): Description of purpose of the path's operation.
        - `parameters` (Parameter object): [[openapi-endpoint-parameters]]
        - `responses` (Responses object): Expected responses of the endpoint (e.g., `200` or `404`).
            - `response` (Response object): The description and content of response. [[openapi-endpoint-response]]

## Example

```
openapi: 3.1.0
info:
  title: Tic Tac Toe
  description: |
    This API allows writing down marks on a Tic Tac Toe board
    and requesting the state of the board or of individual squares.
  version: 1.0.0
paths:
  # Whole board operations
  /board:
    get:
      summary: Get the whole board
      description: Retrieves the current state of the board and the winner.
      responses:
        "200":
          description: "OK"
          content:
            ...
```

## Related content

- [OpenAPI](https://learn.openapis.org/specification/paths.html)

## Flashcards

In an *OpenAPI description*, how do we **define API endpoints**? :: Specify each `path` in the `paths` field with their respective operations, parameters, and responses.^1725654615917

When *defining API endpoints in an OpenAPI description*, what is the **Path object** in the `paths` field? :: Name of the path prefixed with an `/` (e.g., `/user`).^1725654615934

When *defining API endpoints in an OpenAPI description*, what is the **Operation object** in the `path` field? :: HTTP method associated with the `path` (e.g., `get` and `put`).^1725654615952

When *defining API endpoints in an OpenAPI description*, what are the **fields of the Operation object**? :: `summary`, `description`, `parameters`, and `responses`.^1725654615966
