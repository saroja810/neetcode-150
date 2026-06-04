# Median of Two Sorted Arrays

## Problem Statement

Given two sorted arrays `nums1` and `nums2`, return the median of the two arrays combined.

---

## Example 1

Input:

```txt
nums1 = [1,3]
nums2 = [2]
```

Output:

```txt
2.0
```

Explanation:

The merged array is [1,2,3], and the median is 2.

---

## Example 2

Input:

```txt
nums1 = [1,2]
nums2 = [3,4]
```

Output:

```txt
2.5
```

Explanation:

The merged array is [1,2,3,4], and the median is (2+3)/2.

---

## Approach

Simple steps:

1. Ensure `nums1` is the smaller array.
2. Use binary search on the partition of `nums1`.
3. Choose `i` in `nums1` and `j` in `nums2` so left and right halves have equal size.
4. Check if partition is valid with boundary values.
5. If valid, compute median from max left and min right values.
6. Otherwise move the binary search left or right.

---

## Core Idea

The median is determined by splitting both arrays into left and right halves.

- Use the smaller array for binary search to keep complexity low.
- Compare edges of the partition to find the correct split.

---

## Dry Run

Input:

```txt
nums1 = [1,3]
nums2 = [2]
```

| i | j | left1 | right1 | left2 | right2 | valid? |
|---|---|-------|--------|-------|--------|---------|
| 1 | 1 | 1 | 3 | 2 | INF | yes |

Median:

```txt
2.0
```

---

## Complexity

## Time Complexity

```txt
O(log(min(n, m)))
```

Reason:

Binary search runs on the smaller array.

## Space Complexity

```txt
O(1)
```

Reason:

Only a few pointers and values are used.

---

## Key Things To Remember

- Always search the smaller array.
- Handle edge values with `Integer.MIN_VALUE` and `Integer.MAX_VALUE`.
