# Container With Most Water

## Problem Statement

You are given an integer array `height` of length `n`.

There are `n` vertical lines drawn such that:

```txt
(i,height[i])
```

represents the endpoints of the line.

Find two lines that together with the x-axis form a container such that the container contains the maximum amount of water.

Return the maximum amount of water.

---

## Example 1

Input:

```txt
height=[1,8,6,2,5,4,8,3,7]
```

Output:

```txt
49
```

Explanation:

Choose:

```txt
height=8 and height=7
```

Width:

```txt
8-1=7
```

Area:

```txt
min(8,7) × 7

7 × 7 = 49
```

---

## Example 2

Input:

```txt
height=[1,1]
```

Output:

```txt
1
```

---

## Constraints

```txt
2 <= height.length <= 10⁵

0 <= height[i] <= 10⁴
```

---

## Approach

Simple steps:

1. Place left pointer at beginning
2. Place right pointer at end
3. Calculate width

```txt
right-left
```

4. Find smaller height

```txt
min(left,right)
```

5. Compute area

```txt
width × min height
```

6. Update maximum area
7. Move smaller pointer inward
8. Repeat

---

## Core Idea

Area formula:

```txt
Area = Width × Min(height)
```

Move smaller pointer because:

```txt
larger height already exists
```

Need chance to increase minimum height.

---

## Dry Run

Input:

```txt
[1,8,6,2,5,4,8,3,7]
```

| Left | Right | Width | Min Height | Area |
|-------|--------|--------|-------------|-------|
|1|7|8|1|8|
|8|7|7|7|49|

Maximum:

```txt
49
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
