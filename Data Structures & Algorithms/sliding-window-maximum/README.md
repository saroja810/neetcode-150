# Sliding Window Maximum

## Problem Statement

Given an array `nums` and an integer `k`, return an array of the maximum values in each sliding window of size `k`.

---

## Example 1

Input:

```txt
nums = [1,3,-1,-3,5,3,6,7]
k = 3
```

Output:

```txt
[3,3,5,5,6,7]
```

Explanation:

Each answer is the maximum of the current window.

---

## Example 2

Input:

```txt
nums = [1]
k = 1
```

Output:

```txt
[1]
```

Explanation:

Only one window exists.

---

## Approach

Simple steps:

1. Use a max priority queue to store window values.
2. Add the first `k` values to the queue.
3. Record the maximum.
4. Slide the window: add the new value and remove the old value.
5. Record each window maximum.

---

## Core Idea

Use a priority queue to keep the largest value at the top.

- Add new window elements as the window moves.
- Remove the element that slides out.

---

## Dry Run

Input:

```txt
nums = [1,3,-1,-3,5,3,6,7]
k = 3
```

| window | queue top | max |
|--------|-----------|-----|
| [1,3,-1] | 3 | 3 |
| [3,-1,-3] | 3 | 3 |
| [-1,-3,5] | 5 | 5 |
| [-3,5,3] | 5 | 5 |
| [5,3,6] | 6 | 6 |
| [3,6,7] | 7 | 7 |

Return:

```txt
[3,3,5,5,6,7]
```

---

## Complexity

## Time Complexity

```txt
O(n log k)
```

Reason:

Each slide may add and remove from the priority queue.

## Space Complexity

```txt
O(k)
```

Reason:

The priority queue stores at most `k` items.

---

## Key Things To Remember

- Remove the element that leaves the window.
- The queue is a max heap, so the top is always the window maximum.
