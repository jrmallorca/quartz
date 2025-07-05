---
Created on: 2023-11-03
tags: [work, cloud, aws, aws-cloud-practitioner]
deck: Zettelkasten
---

# AWS EC2 standard reserved instances are less flexible than convertible reserved instances

[[aws-ec2-standard-reserved-instances-pricing]] are less flexible than [[aws-ec2-convertible-reserved-instances-pricing]] as the following configurations must be known:

- Instance type and size.
- AWS Region plan.
- Platform description.
- Tenancy.

If [[amazon-elastic-compute-cloud-ec2]] instances must be run in different availability zones or instance types, then [[aws-ec2-convertible-reserved-instances-pricing]] should be used.

## References

- [AWS Cloud Practitioner Essentials](https://explore.skillbuilder.aws/learn/course/134/play/93606/aws-cloud-practitioner-essentials;lp=82)

## Flashcards

For _AWS EC2 instances_ why are **convertible reserved instances** MORE FLEXIBLE than **standard reserved instances**? :: Convertible reserved instances can be run in different availability zones or instance types.^1699271175092
