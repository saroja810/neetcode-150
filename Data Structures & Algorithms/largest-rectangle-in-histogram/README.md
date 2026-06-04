# Largest Rectangle in Histogram

## Problem Statement

Given an array `heights` representing the height of bars in a histogram, return the area of the largest rectangle that can be formed.

---

## Example 1

Input:

```txt
heights = [2,1,5,6,2,3]
```

Output:

```txt
10
```

Explanation:

The largest rectangle uses heights 5 and 6 with width 2.

---

## Example 2

Input:

```txt
heights = [2,4]
```

Output:

```txt
4
```

Explanation:

The largest rectangle is height 2 with width 2, or height 4 with width 1.

---

## Approach

Simple steps:

1. Use a stack of indexes for bars with increasing height.
2. For each bar, if the current bar is shorter than stack top, pop the stack.
3. Compute area with the popped height and width from the new stack top to current index.
4. Push the current index.
5. Add a final `0` height step to clear the stack.

---

## Core Idea

The stack keeps a list of bars that can extend to the right.

- When a shorter bar appears, it ends rectangles for taller bars.
- Compute area using the popped bar as the shortest bar in a range.

---

## Dry Run

Input:

```txt
heights = [2,1,5,6,2,3]
```

| i | height | stack | action | maxArea |
|---|--------|-------|--------|---------|
| 0 | 2 | [0] | push | 0 |
| 1 | 1 | [1] | pop 0 → area 2 | 2 |
| 2 | 5 | [1,2] | push | 2 |
| 3 | 6 | [1,2,3] | push | 2 |
| 4 | 2 | [1,4] | pop 3 → area 6; pop 2 → area 10 | 10 |
| 5 | 3 | [1,4,5] | push | 10 |
| 6 | 0 | [] | pop 5 → area 3; pop 4 → area 8; pop 1 → area 6 | 10 |

Return:

```txt
10
```

---

## Complexity

## Time Complexity

```txt
O(n)
```

Reason:

Each index is pushed and popped at most once.

## Space Complexity

```txt
O(n)
```

Reason:

The stack can hold all indexes in the worst case.

---

## Key Things To Remember

- Add a final `0` step to flush the stack.
- Use bar indexes to calculate width.
