# Find Minimum in Rotated Sorted Array

## Problem Statement

Suppose an array `nums` sorted in ascending order is rotated at some unknown pivot. Find the minimum element in `nums`.

---

## Example 1

Input:

```txt
nums = [3,4,5,1,2]
```

Output:

```txt
1
```

Explanation:

The array was rotated and the smallest value is `1`.

---

## Example 2

Input:

```txt
nums = [4,5,6,7,0,1,2]
```

Output:

```txt
0
```

Explanation:

`0` is the minimum even though the array is split.

---

## Approach

Simple steps:

1. Set `low = 0` and `high = nums.length - 1`.
2. While `low < high`, compute `mid`.
3. If `nums[mid] <= nums[high]`, the minimum is in the left half.
4. Otherwise, the minimum is in the right half.
5. Return `nums[low]` after the loop.

---

## Core Idea

Because the rotated array still has sorted halves, compare `mid` and `high`.

- If `nums[mid] <= nums[high]`, the right half is sorted and the minimum is in the left half.
- Otherwise, the minimum is in the right half.

---

## Dry Run

Input:

```txt
nums = [3,4,5,1,2]
```

| low | high | mid | nums[mid] | action |
|-----|------|-----|-----------|--------|
| 0 | 4 | 2 | 5 | nums[mid] > nums[high] → low = 3 |
| 3 | 4 | 3 | 1 | nums[mid] <= nums[high] → high = 3 |

Return:

```txt
1
```

---

## Complexity

## Time Complexity

```txt
O(log n)
```

Reason:

Each loop reduces the search range.

## Space Complexity

```txt
O(1)
```

Reason:

Only a few simple variables are used.

---

## Key Things To Remember

- Compare `nums[mid]` with `nums[high]`.
- Return the remaining element when `low == high`.
