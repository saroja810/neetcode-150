# Longest Consecutive Sequence

## Problem Statement

Given an unsorted array of integers `nums`, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in:

```txt
O(n)
```

time.

---

## Example 1

Input:

```txt
nums = [100,4,200,1,3,2]
```

Output:

```txt
4
```

Explanation:

Longest consecutive sequence:

```txt
[1,2,3,4]
```

Length:

```txt
4
```

---

## Example 2

Input:

```txt
nums=[0,3,7,2,5,8,4,6,0,1]
```

Output:

```txt
9
```

Explanation:

Longest sequence:

```txt
[0,1,2,3,4,5,6,7,8]
```

---

## Constraints

```txt
0 <= nums.length <= 10⁵

-10⁹ <= nums[i] <= 10⁹
```

---

## Approach

Simple steps:

1. Insert all elements into HashSet
2. Traverse each number
3. Check if previous number exists

```txt
num-1
```

4. If exists → skip
5. If not → start sequence
6. Keep checking:

```txt
num+1
```

7. Count sequence length
8. Update maximum length

---

## Core Idea

Start counting only from the beginning of a sequence.

Beginning means:

```txt
num-1 does not exist
```

Example:

```txt
100
4
200
1
3
2
```

Start only at:

```txt
1
```

because:

```txt
0 not found
```

Then expand:

```txt
1 → 2 → 3 → 4
```

---

## Dry Run

Input:

```txt
[100,4,200,1,3,2]
```

HashSet:

```txt
{100,4,200,1,3,2}
```

Check:

```txt
100 → start → length=1

4 → skip
(3 exists)

200 → start → length=1

1 → start
2 found
3 found
4 found
```

Longest:

```txt
4
```

Return:

```txt
4
```

---

## Complexity

Time Complexity:

```txt
O(n)
```

Reason:

Each number processed at most once.

Space Complexity:

```txt
O(n)
```

Reason:

HashSet stores all elements.
