# Validate Parentheses

## Problem Statement

Given a string `s` containing only parentheses `()`, `[]`, and `{}`, determine if the input string is valid.

A string is valid if:

- Open brackets are closed by the same type of brackets.
- Open brackets are closed in the correct order.

---

## Example 1

Input:

```txt
s = "()"
```

Output:

```txt
true
```

Explanation:

The parentheses match correctly.

---

## Example 2

Input:

```txt
s = "()[]{}"
```

Output:

```txt
true
```

Explanation:

Each type of bracket closes properly.

---

## Approach

Simple steps:

1. Use a stack for opening brackets.
2. For each character, push opening brackets.
3. For closing brackets, pop from the stack and check if it matches.
4. If the stack is empty or the match is wrong, return `false`.
5. At the end, return `true` only if the stack is empty.

---

## Core Idea

Every closing bracket must match the most recent opening bracket.

- A stack keeps the last opened bracket.
- If the stack does not match, the string is invalid.

---

## Dry Run

Input:

```txt
s = "()[]{}"
```

| char | stack | action |
|------|-------|--------|
| ( | [(] | push |
| ) | [] | pop and match |
| [ | [[] | push |
| ] | [] | pop and match |
| { | [{] | push |
| } | [] | pop and match |

Return:

```txt
true
```

---

## Complexity

## Time Complexity

```txt
O(n)
```

Reason:

Each character is visited once.

## Space Complexity

```txt
O(n)
```

Reason:

The stack may hold every opening bracket.

---

## Key Things To Remember

- Always check the top of the stack for matches.
- Return false if the stack is empty when a closing bracket appears.
