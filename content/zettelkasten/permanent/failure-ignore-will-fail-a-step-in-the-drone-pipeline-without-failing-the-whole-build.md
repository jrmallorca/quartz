---
Created on: 2024-10-29
tags: [continuous-integration, drone, work]
deck: Zettelkasten
---

# `failure: ignore` will fail a step in the drone pipeline without failing the whole build

We can include `failure: ignore` attribute in a step of the drone pipeline to fail steps in the drone pipeline without failing the whole build.

## Related content

- [Drone documentation](https://docs.drone.io/pipeline/kubernetes/syntax/steps/#failure)

## Flashcards

In a _drone pipeline_, what would **including** `failure: ignore` **in a step** DO? :: Allow for failures in steps of a build without failing the whole pipeline.^1730306360402

In a _drone pipeline_, how could we **fail a step WITHOUT failing the whole pipeline**? :: Include `failure: ignore` attribute in a step.^1730306360441
