# Longest Substring Without Duplicates

## Problem Statement

Given a string `s`, return the length of the longest substring without repeating characters.

---

## Example 1

Input:

```txt
s = "abcabcbb"
```

Output:

```txt
3
```

Explanation:

The longest substring without repeated characters is "abc".

---

## Example 2

Input:

```txt
s = "bbbbb"
```

Output:

```txt
1
```

Explanation:

Only one unique character appears in any substring.

---

## Approach

Simple steps:

1. Use a map to remember the latest index of each character.
2. Expand the right pointer one character at a time.
3. If a character is repeated inside the window, move the left pointer.
4. Update max length after each step.

---

## Core Idea

The window always contains unique characters.

- If a duplicate is found, jump `left` past the previous position.
- The map lets us find that previous position quickly.

---

## Dry Run

Input:

```txt
s = "abcabcbb"
```

| right | char | last index map | left | window | max |
|-------|------|----------------|------|--------|-----|
| 0 | a | {a:0} | 0 | a | 1 |
| 1 | b | {a:0,b:1} | 0 | ab | 2 |
| 2 | c | {a:0,b:1,c:2} | 0 | abc | 3 |
| 3 | a | {a:3,b:1,c:2} | 1 | bca | 3 |
| 4 | b | {a:3,b:4,c:2} | 2 | cab | 3 |

Return:

```txt
3
```

---

## Complexity

## Time Complexity

```txt
O(n)
```

Reason:

Each character is read once and left moves at most once per character.

## Space Complexity

```txt
O(min(n, m))
```

Reason:

The map stores characters seen in the window.

---

## Key Things To Remember

- Use `Math.max(left, prevIndex + 1)` when a duplicate is inside the window.
- Keep the map updated with the new index.
