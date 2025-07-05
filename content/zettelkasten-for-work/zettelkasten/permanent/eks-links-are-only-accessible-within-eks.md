---
tags:
  - work
  - aws
  - cloud
created_on: "2025-03-19"
deck: Zettelkasten
modified_on: 2025-03-20 07:06:46
---

# EKS links are only accessible within EKS

EKS links can only be accessed if the application is within EKS. It will not work if the application attempts to access the link outside of EKS.

The hint is that the URL still uses ports like 8080.

## Analogy

This is similar to running multiple applications locally and connecting them through localhost:8080 and localhost:8384.

I suppose this might have a concrete analogy through Docker, if we were more familiar with it.

## Concrete example

## Related content

- [[etienne-badoche]]

## Flashcards

Are _EKS links_ **accessible outside EKS**? :: No.^1742454331046
