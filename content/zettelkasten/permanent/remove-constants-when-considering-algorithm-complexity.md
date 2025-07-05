---
Created on: 2024-10-28
tags: [computer-science, programming]
deck: Zettelkasten
---

# Remove constants when considering algorithm complexity

Constants are removed when considering [[algorithm-complexity]] as, in the theoretical sense, it becomes irrelevant the bigger the input is.

It is worth considering for practicality that sometimes algorithms with more severe theoretical complexity might be better than less severe theoretical complexity, due to (dropped) constants, with smaller input.

For example:

- N = 1, O(10N) = 10, O(N^2) = 1,
- N = 100, O(10N) = 100, O(N^2) = 1000,
- N = 100,000, O(10N) = 100,000, O(N^2) = 100,000,000,

## Related content

- [FrontendMasters](https://frontendmasters.com/courses/algorithms/big-o-time-complexity/)

## Flashcards

When considering _algorithm complexity_, why should **constants be removed**? :: Theoretically, constants become irrelevant as input becomes bigger.^1730306360462

When considering _algorithm complexity_, what should **be removed**? :: Constants.^1730306360478
