# Two Sum

## Problem Statement

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

You may assume exactly one solution exists, and you may not use the same element twice.

You can return the answer in any order.

---

## Example 1

Input:

```txt
nums = [2,7,11,15]
target = 9
```

Output:

```txt
[0,1]
```

Explanation:

Because:

```txt
nums[0] + nums[1]
2 + 7 = 9
```

---

## Example 2

Input:

```txt
nums = [3,2,4]
target = 6
```

Output:

```txt
[1,2]
```

---

## Example 3

Input:

```txt
nums = [3,3]
target = 6
```

Output:

```txt
[0,1]
```

---

## Constraints

```txt
2 <= nums.length <= 10⁴

-10⁹ <= nums[i] <= 10⁹

-10⁹ <= target <= 10⁹

Exactly one valid answer exists
```

---

## Approach

Simple steps:

1. Create a HashMap
2. Traverse array elements
3. Find complement = target - current element
4. Check if complement already exists
5. If yes → answer found
6. Otherwise store current value with index

---

## Core Idea

Instead of checking every pair:

```txt
a + b = target
```

Store previously seen values and instantly search for:

```txt
target - current
```

HashMap gives fast lookup.

---

## Dry Run

Input:

```txt
nums = [2,7,11,15]
target = 9
```

| Current | Complement | Map Before | Action |
|----------|------------|-------------|---------|
| 2 | 7 | {} | store 2 |
| 7 | 2 | {2:0} | found answer |

Return:

```txt
[0,1]
```

---

## Complexity

Time Complexity:

```txt
O(n)
```

Reason:

Traverse array once.

Space Complexity:

```txt
O(n)
```

Reason:

HashMap stores visited values.
