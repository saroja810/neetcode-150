# Binary Search

## Problem Statement

Given a sorted integer array `nums` and an integer `target`, return the index of `target` if it exists in `nums`. If `target` is not present, return `-1`.

---

## Example 1

Input:

```txt
nums = [-1,0,3,5,9,12]
target = 9
```

Output:

```txt
4
```

Explanation:

The value `9` is found at index `4`.

---

## Example 2

Input:

```txt
nums = [-1,0,3,5,9,12]
target = 2
```

Output:

```txt
-1
```

Explanation:

`2` is not in the array, so we return `-1`.

---

## Approach

Simple steps:

1. Set `low` to `0` and `high` to `nums.length - 1`
2. While `low <= high`, find `mid = (low + high) / 2`
3. If `nums[mid] == target`, return `mid`
4. If `nums[mid] < target`, search right side
5. Otherwise, search left side
6. If loop ends, return `-1`

---

## Core Idea

The array is sorted, so we can cut half of the search range each time.

- If `target` is greater than `nums[mid]`, the answer must be on the right.
- If `target` is smaller, the answer must be on the left.

---

## Dry Run

Input:

```txt
nums = [-1,0,3,5,9,12]
target = 9
```

| low | high | mid | nums[mid] | Action |
|-----|------|-----|-----------|--------|
| 0 | 5 | 2 | 3 | target > mid → move low to 3 |
| 3 | 5 | 4 | 9 | found target → return 4 |

---

## Complexity

## Time Complexity

```txt
O(log n)
```

Reason:

Each step halves the search range.

## Space Complexity

```txt
O(1)
```

Reason:

Only a few variables are used.

---

## Key Things To Remember

- Binary search works only on sorted arrays.
- Use `low <= high`, not `low < high`, to include the last element.
