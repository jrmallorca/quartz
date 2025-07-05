---
Created on: 2024-09-06
tags: [work, programming]
deck: Zettelkasten
---

# OpenAPI endpoint parameters

When defining the parameters during [[define-api-endpoints-in-openapi-descriptions]], we must provide the following mandatory fields:

- `in` (string): Location of the parameter (e.g., a path parameter, within the query, or within the header).
- `name` (string): Case-sensitive. Must be unique in each location.

Additional optional fields include:

- `description` (string): Documentation of parameters.
- `required` (boolean): Whether this parameter must be present or not. The default value is `false`.
- `schema` (Schema object): [[openapi-schema-object]]
- `requestBody` (Request Body object): The request body of a parameter, typically used in HTTP methods that write about a record.
    - `description` (string): Documentation of request body.
    - `required` (boolean): Whether the content must be present or not.
    - `content` (Content object): [[openapi-content-object]].

## Examples

### Parameter in path

```
paths:
  /users/{id}:
    get:
      parameters:
      - name: id
        in: path
        required: true
```

### Parameter in query

```
paths:
  /users:
    get:
      parameters:
      - name: id
        in: query
```

### Parameter in query with a restricted type

```
...
    parameters:
    - name: id
      in: query
      schema:
        type: integer
        minimum: 1
        maximum: 100
```

### Tic tac toe

```
paths:
  # Single square operations
  /board/{row}/{column}:
    parameters:
      - name: row
        in: path
        required: true
        schema:
          type: integer
          minimum: 1
          maximum: 3
      - name: column
        in: path
        required: true
        schema:
          type: integer
          minimum: 1
          maximum: 3
    get:
      summary: Get a single board square
      responses:
        ...
    put:
      summary: Set a single board square
      requestBody:
        required: true
        content:
          application/json:
            schema:
              type: string
              enum: [".", "X", "O"]
      responses:
        ...
```

Note that both operations (`get` and `put`) have the same parameters, since they are described at the Path Item level.

## Related content

- [OpenAPI](https://learn.openapis.org/specification/parameters)

## Flashcards

When *defining endpoint parameters in an OpenAPI description*, what is the **in field**? :: Location of the parameter (e.g., a path parameter, within the query, or within the header).^1725654616210

When *defining endpoint parameters in an OpenAPI description*, what is the **name field**? :: A (unique) name of the parameter.^1725654616223

When *defining endpoint parameters in an OpenAPI description*, what is the **Request Body object**? :: The request body of a parameter, typically used in HTTP methods that write about a record.^1725654616234

When *defining endpoint parameters in an OpenAPI description*, what would **specifying the schema do**? :: Impose type and restrictions on the parameter.^1725654616245
