---
Created on: 2024-09-06
tags: [work, programming]
deck: Zettelkasten
---

# Define reusable components in OpenAPI descriptions

In the [[openapi-description-file]], anywhere that has either an:

- [[openapi-schema-object]],
- [[openapi-endpoint-parameters]],
- or [[openapi-endpoint-response]]

can be defined within the `components` field of the [[openapi-description-file]] to be referenced later.

To reference these components, use the following:

- `$ref` (Reference object): Location of the component.

## Examples

### Related content of components in a server

```
$ref: 'https://gigantic-server.com/schemas/Monster/schema.yaml'
```

### Related content of components in another OpenAPI description

```
$ref: './another_file.yaml#rowParam'
```

### Referenced components in the same file

```
components:
  schemas:
    coordinate:
      type: integer
      minimum: 1
      maximum: 3
  parameters:
    rowParam:
      name: row
      in: path
      required: true
      schema:
        $ref: "#/components/schemas/coordinate"
    columnParam:
      name: column
      in: path
      required: true
      schema:
        $ref: "#/components/schemas/coordinate"
paths:
  /board/{row}/{column}:
    parameters:
      - $ref: "#/components/parameters/rowParam"
      - $ref: "#/components/parameters/columnParam"
```

## Related content

- [OpenAPI](https://learn.openapis.org/specification/components.html)

## Flashcards

In an _OpenAPI description_, how do we **define components**? :: Specify each component in the `components` field.^1725654615991

In an _OpenAPI description_, what object will **reference components**? :: `$ref`^1725654616006

In an _OpenAPI description_, how do we REFERENCE components in **the same file**? :: `$ref: '#/components/{COMPONENT_TYPE}/{COMPONENT_NAME}'`^1725654616017

In an _OpenAPI description_, how do we REFERENCE components in **another local OpenAPI description**? :: `$ref: '{ABSOLUTE_OR_RELATIVE_PATH_TO_OPENAPI_DESCRIPTION}#{COMPONENT_NAME}'`^1725654616036

In an _OpenAPI description_, how do we REFERENCE components in **a remote OpenAPI description**? :: `$ref: '{ENDPOINT_TO_OPENAPI_DESCRIPTION}`^1726523409554
