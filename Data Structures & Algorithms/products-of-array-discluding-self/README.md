# Product of Array Except Self

## Problem Statement

Given an integer array `nums`, return an array `answer` such that:

```txt
answer[i]
```

is equal to the product of all elements of `nums` except:

```txt
nums[i]
```

You must solve it without using division and in:

```txt
O(n)
```

time.

---

## Example 1

Input:

```txt
nums = [1,2,3,4]
```

Output:

```txt
[24,12,8,6]
```

Explanation:

```txt
24 = 2×3×4
12 = 1×3×4
8  = 1×2×4
6  = 1×2×3
```

---

## Example 2

Input:

```txt
nums = [-1,1,0,-3,3]
```

Output:

```txt
[0,0,9,0,0]
```

---

## Constraints

```txt
2 <= nums.length <= 10⁵

-30 <= nums[i] <= 30
```

---

## Approach

Simple steps:

1. Create answer array
2. Traverse left to right
3. Store prefix product
4. Traverse right to left
5. Maintain suffix product
6. Multiply:

```txt
prefix × suffix
```

7. Store final result

---

## Core Idea

For every index:

```txt
product except self
```

can be calculated as:

```txt
left product × right product
```

Example:

```txt
nums=[1,2,3,4]
```

For index:

```txt
2
```

Left:

```txt
1×2 = 2
```

Right:

```txt
4
```

Result:

```txt
2×4 = 8
```

No division needed.

---

## Dry Run

Input:

```txt
nums=[1,2,3,4]
```

Prefix:

```txt
[1,1,2,6]
```

Suffix traversal:

| Index | Suffix | Result |
|---------|---------|---------|
| 3 | 1 | 6 |
| 2 | 4 | 8 |
| 1 | 12 | 12 |
| 0 | 24 | 24 |

Final:

```txt
[24,12,8,6]
```

---

## Complexity

Time Complexity:

```txt
O(n)
```

Reason:

Two traversals only.

Space Complexity:

```txt
O(1)
```

Reason:

Only prefix and suffix variables used.

(Output array not counted)
