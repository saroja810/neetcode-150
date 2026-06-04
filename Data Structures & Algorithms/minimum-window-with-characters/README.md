# Minimum Window With Characters

## Problem Statement

Given strings `s` and `t`, return the smallest substring of `s` that contains all characters of `t`. If no such substring exists, return an empty string.

---

## Example 1

Input:

```txt
s = "ADOBECODEBANC"
t = "ABC"
```

Output:

```txt
"BANC"
```

Explanation:

"BANC" is the smallest substring containing `A`, `B`, and `C`.

---

## Example 2

Input:

```txt
s = "a"
t = "a"
```

Output:

```txt
"a"
```

Explanation:

The entire string is the smallest valid window.

---

## Approach

Simple steps:

1. Build a frequency array for `t`.
2. Expand the right pointer over `s` and decrease counts.
3. When all needed characters are covered, try to shrink from the left.
4. Update the smallest window found.
5. Repeat until the right pointer reaches the end.

---

## Core Idea

Keep a sliding window and count how many characters of `t` remain.

- `count` decreases when a needed character is added.
- Increase `left` until the window loses a required character.

---

## Dry Run

Input:

```txt
s = "ADOBECODEBANC"
t = "ABC"
```

| left | right | window | count | best window |
|------|-------|--------|-------|-------------|
| 0 | 5 | ADOBEC | 0 | ADOBEC |
| 1 | 5 | DOBEC | 0 | BEC |
| 1 | 9 | DOBECODEBA | 0 | BEC |
| 9 | 12 | BANC | 0 | BANC |

Return:

```txt
"BANC"
```

---

## Complexity

## Time Complexity

```txt
O(n + m)
```

Reason:

Each character in `s` and `t` is processed a constant number of times.

## Space Complexity

```txt
O(1)
```

Reason:

The frequency array has fixed size 128.

---

## Key Things To Remember

- Use `count` to know when all required chars are included.
- Shrink the window from the left when possible.
