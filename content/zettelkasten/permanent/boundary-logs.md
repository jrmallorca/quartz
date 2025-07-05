---
tags: []
created_on: 2025-02-18 11:16:05
deck: Zettelkasten
modified_on: 2025-02-18 11:32:42
---

# Boundary logs

Boundary logs are logs of the requests and responses that come in and out of a service.

## Analogy

## Concrete example

The DVLA's schema has the following:

```
{
    "direction": "inbound",
    "request": {
        "type": "http",
        "method": "POST",
        "path": "/v1/enquiry",
        "params": "{\"id\":\"123\"}",
    },
    "response": {
        "type": "http",
        "status": 200,
        "body": "{\"id\":\"123\"}",
    },
    ...
}
```

## Related content

## Flashcards

What are **boundary logs**? :: Logs of the requests and responses that come in and out of a service.^1739878399993
