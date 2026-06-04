# Search 2D Matrix

## Problem Statement

Write an efficient algorithm that searches for a value `target` in an `m x n` matrix. The matrix has the following properties:

- Integers in each row are sorted from left to right.
- The first integer of each row is greater than the last integer of the previous row.

---

## Example 1

Input:

```txt
matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
target = 3
```

Output:

```txt
true
```

Explanation:

`3` is found in the matrix.

---

## Example 2

Input:

```txt
matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
target = 13
```

Output:

```txt
false
```

Explanation:

`13` is not present in the matrix.

---

## Approach

Simple steps:

1. Treat the matrix as one sorted list of length `m * n`.
2. Use binary search on the index range `0` to `m*n-1`.
3. Convert `mid` to row and column by `mid / n` and `mid % n`.
4. Compare the value to `target`.
5. Move the search range left or right until found.

---

## Core Idea

The matrix is sorted in row-major order, so binary search works.

- Use arithmetic to map a single index back to matrix coordinates.
- This avoids a nested search.

---

## Dry Run

Input:

```txt
matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
target = 3
```

| low | high | mid | value | action |
|-----|------|-----|-------|--------|
| 0 | 11 | 5 | 11 | target < 11 → high = 4 |
| 0 | 4 | 2 | 5 | target < 5 → high = 1 |
| 0 | 1 | 0 | 1 | target > 1 → low = 1 |
| 1 | 1 | 1 | 3 | found → return true |

---

## Complexity

## Time Complexity

```txt
O(log(mn))
```

Reason:

Binary search runs over all elements.

## Space Complexity

```txt
O(1)
```

Reason:

Only a few variables are used.

---

## Key Things To Remember

- Convert `mid` into `row = mid / n` and `col = mid % n`.
- The matrix behaves like one long sorted array.
