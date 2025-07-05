---
Created on: 2024-11-25
tags: [work, cloud, aws, aws-cloud-practitioner]
deck: Zettelkasten
---

# Selecting the correct cloud region to host

To select the correct [[cloud-region]] to host the client's data, services, applications, etc., check your priority against the 4 following factors:

- [[application-governance]]
    - [[azure-resource-groups-must-have-a-location]]
    - The company or local government may legally require data to be hosted in specific areas.
- Proximity to customers.
    - Hosting closer to customers would reduce [[latency]] of delivering data and services to customers.
- Available services within a region.
    - Some [[amazon-web-services]] may be unavailable in certain regions. If the feature is required, then another region would need to be chosen to host.
- Pricing.
    - Tax structures differ between countries. Running the same workload between regions may incur more costs than another.

## Related content

- [Self-paced digital training on AWS - AWS Skill Builder](https://explore.skillbuilder.aws/learn/course/134/play/93606/aws-cloud-practitioner-essentials;lp=82)

## Flashcards

When _selecting a cloud region to host_, what are the **4 factors to consider**? :: Legal compliance, proximity to customers, available services in a region, and pricing.^1732654410954

When _selecting a cloud region to host_, why would **legal compliance be a consideration**? :: The company or local government may legally require data to be hosted in specific areas.^1732654410966

When _selecting a cloud region to host_, why would **proximity to customers be a consideration**? :: Proximity determines the latency experienced by customers when data is delivered to them.^1732654410976

When _selecting a cloud region to host_, why would **available services within a region be a consideration**? :: Certain services required to use may be currently unavailable within certain regions.^1732654410986

When _selecting a cloud region to host_, why would **pricing be a consideration**? :: Running the same workload in different locations can incur different costs and may be cheaper elsewhere.^1732654411000
