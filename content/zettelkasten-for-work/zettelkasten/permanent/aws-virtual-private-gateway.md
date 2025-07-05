---
tags:
  - work
  - cloud
  - aws
  - aws-cloud-practitioner
created_on: "2025-02-12"
deck: Zettelkasten
modified_on: 2025-03-11 19:10:24
---

# AWS Virtual Private Gateway

AWS Virtual Private Gateway is the private version of the [[aws-internet-gateway]] for accessing private resources in [[amazon-virtual-private-cloud]] from an approved network, rather than through the public internet, with a VPN connection.

## Analogy

Think of the internet as the road between your home and the coffee shop. Suppose that you are travelling on this road with a bodyguard to protect you. You are still using the same road as other customers, but with an extra layer of protection.

The bodyguard is like a virtual private network (VPN) connection that encrypts (or protects) your internet traffic from all the other requests around it.

The virtual private gateway is the component that allows protected internet traffic to enter into the VPC. Even though your connection to the coffee shop has extra protection, traffic jams are possible because you’re using the same road as other customers.

## Concrete example

![Image showing AWS virtual private gateway structure](zettelkasten/attachments/aws-virtual-private-gateway-diagram.png)

## Related content

- [Self-paced digital training on AWS - AWS Skill Builder](https://explore.skillbuilder.aws/learn/course/134/play/93606/aws-cloud-practitioner-essentials;lp=82)
- [[amazon-virtual-private-cloud-vpc]]
- [[aws-internet-gateway]]
- [[aws-direct-connect]]
- [[zettelkasten-for-work/zettelkasten/permanent/aws-virtual-private-gateway-provides-security-but-suffers-from-latency]]

## Flashcards

For _Amazon VPC_, what is a **virtual private gateway**? :: A VPN connection to the VPC from an approved network to access private AWS resources.^1741208347492

For _Amazon VPC virtual private gateway_, what is the **analogy**? :: A bodyguard protects you along the public road from the home to the coffee shop.^1741208347506
