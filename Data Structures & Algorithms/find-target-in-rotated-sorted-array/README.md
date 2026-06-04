# Find Target in Rotated Sorted Array

## Problem Statement

Given a rotated sorted array `nums` and an integer `target`, return the index of `target` if it exists in `nums`, otherwise return `-1`.

---

## Example 1

Input:

```txt
nums = [4,5,6,7,0,1,2]
target = 0
```

Output:

```txt
4
```

Explanation:

The value `0` appears at index `4`.

---

## Example 2

Input:

```txt
nums = [4,5,6,7,0,1,2]
target = 3
```

Output:

```txt
-1
```

Explanation:

`3` is not in the rotated array.

---

## Approach

Simple steps:

1. Use binary search with `low` and `high` pointers.
2. For each `mid`, check if the left part is sorted.
3. If left is sorted, see if `target` is inside it.
4. Otherwise, the right part must be sorted.
5. Narrow the search to the side where `target` can be.
6. Return `-1` if not found.

---

## Core Idea

One half of the array is always sorted.

- Use `nums[low] <= nums[mid]` to test the left-half order.
- Then decide whether `target` belongs to the sorted half.

---

## Dry Run

Input:

```txt
nums = [4,5,6,7,0,1,2]
target = 0
```

| low | high | mid | nums[mid] | sorted side | action |
|-----|------|-----|-----------|-------------|--------|
| 0 | 6 | 3 | 7 | left sorted | target not in left → low = 4 |
| 4 | 6 | 5 | 1 | left sorted | target in left → high = 4 |
| 4 | 4 | 4 | 0 | found | return 4 |

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

Only fixed pointers are used.

---

## Key Things To Remember

- Check which half is sorted, then narrow search.
- If `nums[low] <= nums[mid]`, the left half is sorted.
