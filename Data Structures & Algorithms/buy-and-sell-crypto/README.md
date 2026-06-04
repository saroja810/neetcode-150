# Buy and Sell Crypto

## Problem Statement

You are given an array `prices` where `prices[i]` is the price of a cryptocurrency on day `i`. Return the maximum profit you can make by choosing one day to buy and one day to sell. You must buy before you sell.

---

## Example 1

Input:

```txt
prices = [7,1,5,3,6,4]
```

Output:

```txt
5
```

Explanation:

Buy at price `1` on day 1 and sell at price `6` on day 4.

---

## Example 2

Input:

```txt
prices = [7,6,4,3,1]
```

Output:

```txt
0
```

Explanation:

Prices only go down, so the best profit is `0`.

---

## Approach

Simple steps:

1. Keep a variable `minPrice` for the lowest price seen so far.
2. Keep `maxProfit` as the best profit so far.
3. For each price, update `minPrice` if the current price is smaller.
4. Calculate `price - minPrice` and update `maxProfit` if larger.
5. Return `maxProfit`.

---

## Core Idea

Track the cheapest day to buy while scanning prices once.

- If current price is lower than the minimum so far, update the minimum.
- Otherwise, consider selling today and update profit.

---

## Dry Run

Input:

```txt
prices = [7,1,5,3,6,4]
```

| day | price | minPrice | profit | maxProfit |
|-----|-------|----------|--------|-----------|
| 0 | 7 | 7 | 0 | 0 |
| 1 | 1 | 1 | 0 | 0 |
| 2 | 5 | 1 | 4 | 4 |
| 3 | 3 | 1 | 2 | 4 |
| 4 | 6 | 1 | 5 | 5 |
| 5 | 4 | 1 | 3 | 5 |

Return:

```txt
5
```

---

## Complexity

## Time Complexity

```txt
O(n)
```

Reason:

One pass through the price array.

## Space Complexity

```txt
O(1)
```

Reason:

Only two extra variables are used.

---

## Key Things To Remember

- Always update the cheapest price before computing profit.
- Profit cannot be negative, so keep the best positive result.
