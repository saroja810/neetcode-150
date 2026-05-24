# Top K Frequent Elements

## Problem Statement

Given an integer array `nums` and an integer `k`, return the `k` most frequent elements.

You may return the answer in any order.

---

## Example 1

Input:

```txt
nums = [1,1,1,2,2,3]

k = 2
```

Output:

```txt
[1,2]
```

Explanation:

Frequency:

```txt
1 → 3 times
2 → 2 times
3 → 1 time
```

Top 2 frequent elements:

```txt
[1,2]
```

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

---

## Constraints

```txt
1 <= nums.length <= 10⁵

k is in range [1, number of unique elements]
```

---

## Approach

Simple steps:

1. Count frequency using HashMap
2. Store unique elements into List
3. Sort list based on frequency
4. Higher frequency comes first
5. Take first k elements
6. Store into answer array

---

## Core Idea

Count frequencies first:

```txt
number → count
```

Then sort elements using:

```txt
higher frequency first
```

Finally return first `k` values.

---

## Dry Run

Input:

```txt
nums=[1,1,1,2,2,3]

k=2
```

Frequency map:

```txt
1 → 3
2 → 2
3 → 1
```

List before sorting:

```txt
[1,2,3]
```

After sorting:

```txt
[1,2,3]
```

Take first 2:

```txt
[1,2]
```

Return:

```txt
[1,2]
```

---

## Complexity

Time Complexity:

```txt
O(n log n)
```

Reason:

Sorting unique elements dominates.

Space Complexity:

```txt
O(n)
```

Reason:

HashMap and List store elements.
