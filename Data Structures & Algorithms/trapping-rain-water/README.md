# Trapping Rain Water

## Problem Statement

Given `n` non-negative integers representing an elevation map where width of each bar is `1`, compute how much water can be trapped after raining.

---

## Example 1

Input:

```txt
height=[0,1,0,2,1,0,1,3,2,1,2,1]
```

Output:

```txt
6
```

---

## Example 2

Input:

```txt
height=[4,2,0,3,2,5]
```

Output:

```txt
9
```

---

## Constraints

```txt
1 <= height.length <= 2×10⁴

0 <= height[i] <= 10⁵
```

---

## Approach

Simple steps:

1. Place left pointer at beginning
2. Place right pointer at end
3. Maintain:

```txt
leftMax
rightMax
```

4. Compare both heights
5. Process smaller side
6. If current smaller than max:

```txt
water=max-current
```

7. Add trapped water
8. Move pointer

---

## Core Idea

Water at index:

```txt
min(leftMax,rightMax)-height[i]
```

Three important formulas:

```txt
leftMax=max(leftMax,height[left])
```

```txt
rightMax=max(rightMax,height[right])
```

```txt
water=min(leftMax,rightMax)-height[i]
```

---

## Dry Run

Input:

```txt
[0,1,0,2]
```

| Position | leftMax | rightMax | Water |
|-----------|----------|-----------|--------|
|0|0|2|0|
|1|1|2|0|
|2|1|2|1|
|3|2|2|0|

Total:

```txt
1
```

---

## Complexity

Time Complexity:

```txt
O(n)
```

Space Complexity:

```txt
O(1)
```
