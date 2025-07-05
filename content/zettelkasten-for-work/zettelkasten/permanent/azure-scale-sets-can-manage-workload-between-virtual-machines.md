---
Created on: 2023-09-29

tags: [work, cloud, azure, az900, a-cloud-guru]
deck: Zettelkasten
---

# Azure scale sets can manage workload between virtual machines (VMs)

When [[virtual-machine]]s in an [[zettelkasten/fleeting/work/structure/azure-scale-set]] are nearing their workload capacity, the [[zettelkasten/fleeting/work/structure/azure-scale-set]] will be [[horizontally-scaling-computing-resources]] to accommodate and vice versa.

This is possible as [[azure-scale-sets-increase-elasticity-of-scalability]] and [[azure-scale-sets-allows-for-high-availability]].

---

## References

- [A Cloud Guru](https://learn.acloud.guru/course/az-900-microsoft-azure-fundamentals/learn/introduction/azure-cli/watch)

---

## Flashcards

When _virtual machines (VMs) in an Azure scale set_ are NEARING WORKLOAD CAPACITY, how will the **scale set reduce the workload** for all currently running VMs? :: The scale set will scale outwards for more VMs to alleviate the workload.

When _virtual machines (VMs) in an Azure scale set_ are NOT BUSY, what will the **scale set do**? :: The scale set will scale inwards until workload is considered balanced between running VMs.
