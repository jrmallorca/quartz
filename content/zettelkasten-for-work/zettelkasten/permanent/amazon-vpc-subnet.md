---
tags:
  - work
  - cloud
  - aws
  - aws-cloud-practitioner
created_on: "2025-02-04"
deck: Zettelkasten
modified_on: 2025-03-15 16:04:40
---

# Amazon VPC Subnet

[[amazon-virtual-private-cloud-vpc]] subnets are isolated sections of public or private [[amazon-web-services]] resources within a virtual network.

## Analogy

Imagine the VPC as a coffee shop. In the coffee shop, there are customers, a cashier (AWS resource), and a barista (AWS resource). Customers are meant to be served by the cashier, but some customers might get cheeky and go directly to the barista to make their drinks.

To fix this, we contain the cashier into a public subnet and the barista into a private subnet. This way, no customers will be able to directly interact with the barista to make their drink.

## Related content

- [Self-paced digital training on AWS - AWS Skill Builder](https://explore.skillbuilder.aws/learn/course/134/play/93606/aws-cloud-practitioner-essentials;lp=82)

## Flashcards

What are **Amazon VPC Subnets**? :: Isolated sections of a VPC that contains public or private AWS resources.^1738780555401

What **gateway** can access PUBLIC _Amazon VPC Subnets_? :: Internet gateway.^1742454331001

What **gateway** can access PRIVATE _Amazon VPC Subnets_? :: Virtual private gateway.^1742454331019
