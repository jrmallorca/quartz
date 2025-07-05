---
tags:
  - work
  - cloud
  - aws
  - aws-cloud-practitioner
created_on: "2025-03-20"
deck: Zettelkasten
modified_on: 2025-03-20 20:16:46
---

# Network access control list (ACL)

A network access control list (network ACL) is a set of rules that allows or denies specific inbound or outbound traffic at the [[amazon-vpc-subnet]] level.

For every [[network-packet]] that accesses the [[amazon-vpc-subnet]] boundaries, they are checked against the network ACL to see if the [[network-packet]] has permissions to either enter and/or leave the [[amazon-vpc-subnet]]. This is based off the source of the packet and how it's trying to communicate.

## Analogy

Think of the network ACLs as passport control officers; If you're on the approved list, you get through. If you're not on the list, or if you're explicitly on the do-not-enter list, then you get blocked.

Just because you can get in, doesn't mean you can get out though.

## Related content

- [[aws-cloud-practitioner]]
- [[network-access-control-list-perform-stateless-packet-filtering]]
- [[network-access-control-list-allow-all-inbound-and-outbound-traffic-by-default]]

## Flashcards

What is a **network access control list (ACL)**? :: A set of rules that allows or denies specific inbound or outbound traffic at the subnet level.^1743178449892

What is the **analogy** for _network access control list_? :: Passport control officers that ensure a person has permissions to come in and/or out.^1743178449908

For an _Amazon VPC subnet_, how is **network traffic managed**? :: Every packet that accesses the subnet boundaries is checked against the network ACL to check if it has permissions to either come in or out. If a packet can come in, it doesn't necessarily mean it can come out and vice versa.^1743178449923
