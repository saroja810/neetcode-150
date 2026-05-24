# Two Sum II - Input Array Is Sorted

## Problem Statement

Given a **1-indexed** array of integers `numbers` that is sorted in non-decreasing order, find two numbers such that they add up to a specific `target`.

Return the indices of the two numbers:

```txt
[index1, index2]
```

where:

```txt
1 <= index1 < index2 <= numbers.length
```

You may assume exactly one solution exists.

You must use only constant extra space.

---

## Example 1

Input:

```txt
numbers = [2,7,11,15]
target = 9
```

Output:

```txt
[1,2]
```

Explanation:

```txt
2 + 7 = 9
```

Since array is 1-indexed:

```txt
[1,2]
```

---

## Example 2

Input:

```txt
numbers = [2,3,4]
target = 6
```

Output:

```txt
[1,3]
```

---

## Example 3

Input:

```txt
numbers = [-1,0]
target = -1
```

Output:

```txt
[1,2]
```

---

## Constraints

```txt
2 <= numbers.length <= 3 × 10⁴

-1000 <= numbers[i] <= 1000

numbers is sorted

Exactly one solution exists
```

---

## Approach

Simple steps:

1. Place left pointer at beginning
2. Place right pointer at end
3. Find current sum
4. If sum equals target → return answer
5. If sum smaller → move left pointer
6. If sum larger → move right pointer

Repeat until answer found.

---

## Core Idea

Array is already sorted.

If:

```txt
sum < target
```

Move left pointer to increase sum.

If:

```txt
sum > target
```

Move right pointer to decrease sum.

No need to check all pairs.

---

## Dry Run

Input:

```txt
numbers=[2,7,11,15]

target=9
```

| Left | Right | Sum | Action |
|-------|--------|-----|---------|
| 2 | 15 | 17 | move right |
| 2 | 11 | 13 | move right |
| 2 | 7 | 9 | found |

Return:

```txt
[1,2]
```

---

## Complexity

Time Complexity:

```txt
O(n)
```

Reason:

Each pointer moves at most once.

Space Complexity:

```txt
O(1)
```

Reason:

Only two variables used.
