# Evaluate Reverse Polish Notation

## Problem Statement

Given an array `tokens` where each token is either an integer or one of the operators `+`, `-`, `*`, `/`, evaluate the expression and return the result.

---

## Example 1

Input:

```txt
tokens = ["2","1","+","3","*"]
```

Output:

```txt
9
```

Explanation:

`(2 + 1) * 3 = 9`.

---

## Example 2

Input:

```txt
tokens = ["4","13","5","/","+"]
```

Output:

```txt
6
```

Explanation:

`4 + (13 / 5) = 6`.

---

## Approach

Simple steps:

1. Use a stack for numbers.
2. For each token:
3. If it is a number, parse and push it.
4. If it is an operator, pop two values and compute.
5. Push the result back on the stack.
6. Return the final value on the stack.

---

## Core Idea

A stack naturally handles the order of operations for Reverse Polish Notation.

- Operators always use the two most recent numbers.
- The stack stores intermediate results.

---

## Dry Run

Input:

```txt
tokens = ["2","1","+","3","*"]
```

| token | stack before | action | stack after |
|-------|---------------|--------|-------------|
| 2 | [] | push 2 | [2] |
| 1 | [2] | push 1 | [2,1] |
| + | [2,1] | pop 1,2 → push 3 | [3] |
| 3 | [3] | push 3 | [3,3] |
| * | [3,3] | pop 3,3 → push 9 | [9] |

Return:

```txt
9
```

---

## Complexity

## Time Complexity

```txt
O(n)
```

Reason:

Each token is processed once.

## Space Complexity

```txt
O(n)
```

Reason:

The stack may hold all numbers in the expression.

---

## Key Things To Remember

- Use the stack only for numbers.
- Pop two values in the correct order for `-` and `/`.
