---
Created on: 2024-09-06
tags: [work, programming]
deck: Zettelkasten
---

# OpenAPI schema object

In the [[openapi-specification]], the schema object specifies the data type of the content and its respective fields.

This mandatory field determines the other fields you can specify in the schema:

- `type` (string): Specification of the schema's data type (e.g., `integer`, `array`, or `object`).

## Examples

### Integer with limited range

```
content:
  application/json:
    schema:
      type: integer
      minimum: 1
      maximum: 100
```

### String with only 3 valid options

```
content:
  application/json:
    schema:
      type: string
      enum:
      - Alice
      - Bob
      - Carl
```

### Array

```
content:
  application/json:
    schema:
      type: array
      minItems: 1
      maxItems: 10
      items:
        type: integer
```

### Object

```
content:
  application/json:
    schema:
      type: object
      properties:
        productName:
          type: string
        productPrice:
          type: number
```

## Related content

- [OpenAPI](https://learn.openapis.org/specification/content.html)

## Flashcards

In an *OpenAPI description*, what is the **Schema object**? :: The data type of the content and its respective fields.^1725654616339

When *defining a Schema object in an OpenAPI description*, what is the **type field**? :: Specification of the schema's data type.^1725654616353
