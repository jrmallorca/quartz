---
Created on: 2024-10-28
tags: [programming]
deck: Zettelkasten
---

# Check algorithm complexity by looking at loops

We can check [[algorithm-complexity]] by checking the loops in the algorithm with respect to input.

Examples:

- If we were printing the contents of a list, we would have to loop through each entry to print its content. This would give us O(n) time complexity.
- If we were printing the combinations of all values between 2 lists, we would have a nested loop: one to iterate through the first list and another to iterate through the 2nd list in comparison to the current value in the first list. This would give us O(n^2) time complexity.

## Related content

- [FrontendMasters](https://frontendmasters.com/courses/algorithms/big-o-time-complexity/)

## Flashcards

For _checking algorithm time/space complexity_, what is the **biggest clue**? :: Loops with respect to input.^1730306360332
