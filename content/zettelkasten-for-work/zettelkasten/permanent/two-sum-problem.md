---
tags:
  - leetcode
  - programming
  - work
created_on: "2024-10-28"
deck: Zettelkasten
modified_on: 2025-01-18 14:04:38
---

# Two-sum problem

## Problem

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
```

Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

```
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

Example 3:

```
Input: nums = [3,3], target = 6
Output: [0,1]
```

Constraints:

- 2 <= nums.length <= 104
- -109 <= nums[i] <= 109
- -109 <= target <= 109
- Only one valid answer exists.

## Solution

The brute force solution includes 2 for loops, creating a time complexity of [[big-O]] O(n^2). [[consider-trading-time-for-space-when-time-complexity-is-large]].

- While iterating, `target` = current + X
    - X is some other value in the table that is the complement of the current value.
- Instead of trying to find `target`, we can try to find the complement, X, that makes up our target.

The solution is to:

- Use a hash table to store the array's value as the table's key and the array's key as the table's value.
    - This can be done by iterating through all the array's elements and putting the appropriate entries to the table.
- As we iterate, we can check if any of the values we've already put in the map are the complement of the current value.
- Doing this results in an O(n) time complexity solution.

## References

- [Leetcode: Two Sum problem](https://leetcode.com/problems/two-sum/editorial/)

## Flashcards

For the _two-sum programming problem_, what is the **optimal solution**? :: Create a key-value pair data structure. Iterate through the given array of numbers. If the current number's complement is already inside the hash table, return the indices of the current number and the complement. Otherwise, add the current value as the key and the current index as the value into the data structure.^1737573180883
