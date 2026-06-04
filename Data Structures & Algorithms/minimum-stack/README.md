# Minimum Stack

## Problem Statement

Design a stack that supports `push`, `pop`, `top`, and retrieving the minimum element in constant time.

---

## Example 1

Input:

```txt
push(2)
push(0)
push(3)
push(0)
getMin()
pop()
top()
getMin()
```

Output:

```txt
0
3
0
```

Explanation:

The minimum stays `0` even after popping the last value.

---

## Example 2

Input:

```txt
push(1)
push(2)
getMin()
pop()
top()
```

Output:

```txt
1
1
```

Explanation:

The minimum remains available after popping.

---

## Approach

Simple steps:

1. Use one stack for values and another stack for the current minimum.
2. When pushing, also push the smaller of current value and previous minimum.
3. When popping, pop both stacks.
4. `top()` reads from the value stack.
5. `getMin()` reads from the min stack.

---

## Core Idea

Keep a parallel stack of minimums, so the minimum at each level is stored.

- The min stack always has the minimum corresponding to the value stack.
- This makes `getMin()` constant time.

---

## Dry Run

Operations:

```txt
push(2)
push(0)
push(3)
push(0)
```

| values | mins |
|--------|------|
| [2] | [2] |
| [2,0] | [2,0] |
| [2,0,3] | [2,0,0] |
| [2,0,3,0] | [2,0,0,0] |

`getMin()` returns 0.
`pop()` removes 0 and min 0.
`top()` returns 3.
`getMin()` returns 0.

---

## Complexity

## Time Complexity

```txt
O(1)
```

Reason:

Each operation uses a fixed number of stack actions.

## Space Complexity

```txt
O(n)
```

Reason:

Two stacks store the input values.

---

## Key Things To Remember

- Push to both stacks every time.
- The min stack mirrors the value stack.
