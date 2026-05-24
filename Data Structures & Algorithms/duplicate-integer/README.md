# Contains Duplicate

## Problem Statement

Given an integer array `nums`, return:

- `true` if any value appears at least twice
- `false` if every element is distinct

---

## Example 1

Input:

```txt
nums = [1,2,3,1]
```

Output:

```txt
true
```

Explanation:

Element `1` appears more than once.

---

## Example 2

Input:

```txt
nums = [1,2,3,4]
```

Output:

```txt
false
```

Explanation:

All elements are unique.

---

## Example 3

Input:

```txt
nums = [1,1,1,3,3,4,3,2,4,2]
```

Output:

```txt
true
```

---

## Approach

Simple steps:

1. Create a HashSet
2. Traverse each element
3. Check if element already exists
4. If yes → duplicate found
5. Else insert into set
6. Finish traversal → no duplicates

---

## Core Idea

HashSet stores only unique values.

While traversing:

- Existing element → duplicate
- New element → insert

This gives constant time lookup.

---

## Dry Run

Input:

```txt
nums = [1,2,3,2]
```

| Current | Set Before | Action | Set After |
|----------|-------------|---------|------------|
| 1 | {} | add | {1} |
| 2 | {1} | add | {1,2} |
| 3 | {1,2} | add | {1,2,3} |
| 2 | {1,2,3} | duplicate found | stop |

Return:

```txt
true
```

---

## Complexity

Time Complexity:

```txt
O(n)
```

Reason:

Traverse array once and HashSet lookup is average O(1)

Space Complexity:

```txt
O(n)
```

Reason:

In worst case all elements are unique.

---



## Memory Trick

> Need fast duplicate checking → use HashSet
