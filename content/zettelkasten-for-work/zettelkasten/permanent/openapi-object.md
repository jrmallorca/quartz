---
Created on: 2024-09-06
tags: [work, programming]
deck: Zettelkasten
---

# OpenAPI object

In the [[openapi-description-file]], the [[openapi-specification]] object is the root. It mainly describes:

- the version of the OpenAPI,
- general metadata about the API,
- and the definition of the API.

Every OpenAPI Descriptions must contain an OpenAPI Object with at least the fields `openapi`, and `info`, and either `paths`, `components` or `webhooks`.

- `openapi` (string): This indicates the version of the OAS this OAD is using, e.g. “3.1.0”. Using this field, tools can check that the description correctly adheres to the specification.
- `info` (Info Object): This provides general information about the API (like its description, author and contact information) but the only mandatory fields are title and version.
    - `title` (string): A human-readable name for the API, like “GitHub REST API”, useful to keep API collections organized.
    - `version` (string): Indicates the version of the API description (not to be confused with the OAS version above). Tools can use this field to generate code that ensures that clients and servers are interacting through the same version of the API, for example.
- `paths` (Paths Object): This describes all the endpoints of the API, including their parameters and all possible server responses. Server and client code can be generated from this description, along with its documentation. In here, we can [[define-api-endpoints-in-openapi-descriptions]]

## Example

```
openapi: 3.1.0
info:
  title: A minimal OpenAPI Description
  version: 0.0.1
paths: {} # No endpoints defined
```

## Related content

- [OpenAPI](https://learn.openapis.org/specification/structure)

## Flashcards

In an *OpenAPI description*, what is the **root**? :: The OpenAPI object.^1725654616289

In an *OpenAPI description*, what is the **OpenAPI object**? :: The definition of the OpenAPI version and the general metadata of the API being defined.^1725654616300

In an *OpenAPI description*, what is the OpenAPI object **made of**? :: The fields `openapi`, `info`, and either `paths`, `components`, or `webhooks`.^1725654616309
