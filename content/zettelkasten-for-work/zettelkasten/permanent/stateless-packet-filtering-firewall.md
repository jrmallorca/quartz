---
tags:
  - work
  - cloud
  - aws
  - aws-cloud-practitioner
created_on: "2025-03-20"
deck: Zettelkasten
modified_on: 2025-03-20 20:12:56
---

# Stateless packet filtering / Stateless firewall

Stateless [[network-packet]] filtering is a method of filtering the information contained in each [[network-packet]] in the current moment. This occurs even if it's the same [[network-packet]] that came through.

## Analogy

It's similar to [[rest-api-statelessness]] where no request is remembered by the server. In this case, information about the packet is not remembered and must be checked every time. Each packet is checked against the [[network-access-control-list-acl]] every time it's going inbound or outbound.

## Related content

- [[network-access-control-list-perform-stateless-packet-filtering]]

## Flashcards

What is **stateless packet filtering**? :: A method of filtering information contained in each packet in the current moment as its state or context will not be remembered for the next time.^1743178450104

What is a **stateless firewall**? :: A method of filtering information contained in each packet in the current moment as its state or context will not be remembered for the next time.^1743178450116
