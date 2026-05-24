# 3Sum

## Problem Statement

Given an integer array `nums`, return all unique triplets:

```txt
[nums[i], nums[j], nums[k]]
```

such that:

```txt
i != j
i != k
j != k
```

and:

```txt
nums[i] + nums[j] + nums[k] = 0
```

The solution set must not contain duplicate triplets.

---

## Example 1

Input:

```txt
nums = [-1,0,1,2,-1,-4]
```

Output:

```txt
[[-1,-1,2],[-1,0,1]]
```

Explanation:

Possible triplets:

```txt
-1 + -1 + 2 = 0

-1 + 0 + 1 = 0
```

---

## Example 2

Input:

```txt
nums=[0,1,1]
```

Output:

```txt
[]
```

---

## Example 3

Input:

```txt
nums=[0,0,0]
```

Output:

```txt
[[0,0,0]]
```

---

## Constraints

```txt
3 <= nums.length <= 3000

-10⁵ <= nums[i] <= 10⁵
```

---

## Approach

Simple steps:

1. Sort the array
2. Fix one element at index `i`
3. Use two pointers:

```txt
left=i+1
right=n-1
```

4. Find current sum

```txt
nums[i] + nums[left] + nums[right]
```

5. If sum smaller → move left
6. If sum larger → move right
7. If sum equals 0 → store answer
8. Skip duplicate values
9. Repeat for all elements

---

## Core Idea

Convert:

```txt
3 numbers problem
```

into:

```txt
1 fixed number + Two Sum
```

Sorting allows two pointers to work efficiently.

---

## Dry Run

Input:

```txt
[-1,0,1,2,-1,-4]
```

After sorting:

```txt
[-4,-1,-1,0,1,2]
```

Fix:

```txt
i=-1
```

Pointers:

```txt
left=-1
right=2
```

Sum:

```txt
-1 + -1 + 2 = 0
```

Store:

```txt
[-1,-1,2]
```

Move pointers and skip duplicates.

Next:

```txt
-1 + 0 + 1 = 0
```

Store:

```txt
[-1,0,1]
```

Return:

```txt
[[-1,-1,2],[-1,0,1]]
```

---

## Complexity

Time Complexity:

```txt
O(n²)
```

Reason:

Outer loop:

```txt
O(n)
```

Two pointers:

```txt
O(n)
```

Total:

```txt
O(n²)
```

Space Complexity:

```txt
O(1)
```

Reason:

Only pointers used.

(ignoring output array)
