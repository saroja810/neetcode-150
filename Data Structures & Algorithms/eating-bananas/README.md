# Eating Bananas

## Problem Statement

Given an array `piles`, where `piles[i]` is the number of bananas in the i-th pile, and an integer `h`, return the minimum eating speed `k` such that Koko can eat all bananas in at most `h` hours.

---

## Example 1

Input:

```txt
piles = [3,6,7,11]
h = 8
```

Output:

```txt
4
```

Explanation:

At speed `4`, Koko can finish all piles in 8 hours.

---

## Example 2

Input:

```txt
piles = [30,11,23,4,20]
h = 5
```

Output:

```txt
30
```

Explanation:

Koko must eat the largest pile in one hour, so speed `30` is needed.

---

## Approach

Simple steps:

1. Set `low = 1` and `high = max(piles)`.
2. Try a speed `mid = low + (high - low) / 2`.
3. Compute how many hours it takes with that speed.
4. If hours <= h, try a smaller speed.
5. If hours > h, try a larger speed.
6. Return the smallest valid speed.

---

## Core Idea

The answer is the smallest `k` that makes total time fit into `h` hours.

- Use binary search over possible speeds.
- For each speed, compute hours with `(pile + mid - 1) / mid`.

---

## Dry Run

Input:

```txt
piles = [3,6,7,11]
h = 8
```

| low | high | mid | hours | action |
|-----|------|-----|-------|--------|
| 1 | 11 | 6 | 6 | valid → lower high to 5 |
| 1 | 5 | 3 | 8 | valid → lower high to 2 |
| 1 | 2 | 1 | 27 | too slow → low = 2 |
| 2 | 2 | 2 | 15 | too slow → low = 3 |
| 3 | 5 | 4 | 8 | valid → answer = 4 |

Return:

```txt
4
```

---

## Complexity

## Time Complexity

```txt
O(n log m)
```

Reason:

Each binary search step scans all piles. `m` is the max pile size.

## Space Complexity

```txt
O(1)
```

Reason:

Only a few variables are used.

---

## Key Things To Remember

- Binary search is on eating speed, not array positions.
- Use `(pile + k - 1) / k` to compute hours per pile.
