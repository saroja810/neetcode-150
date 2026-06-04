# Longest Repeating Substring With Replacement

## Problem Statement

Given a string `s` and an integer `k`, return the length of the longest substring that can be made repeating by replacing at most `k` characters.

---

## Example 1

Input:

```txt
s = "ABAB"
k = 2
```

Output:

```txt
4
```

Explanation:

Replace both `A`s or both `B`s to make "AAAA" or "BBBB".

---

## Example 2

Input:

```txt
s = "AABABBA"
k = 1
```

Output:

```txt
4
```

Explanation:

Replace one letter to get a long repeating substring.

---

## Approach

Simple steps:

1. Use a sliding window with two pointers.
2. Track frequency of each letter in the window.
3. Keep `maxfreq` as the highest count of a single letter.
4. If `(window length - maxfreq) <= k`, the window is valid.
5. Otherwise, move the left pointer forward.
6. Update `maxlen` for valid windows.

---

## Core Idea

The window is valid when we can change the non-most-common letters with `k` replacements.

- `maxfreq` is the count of the letter we keep.
- `window length - maxfreq` is the number of changes needed.

---

## Dry Run

Input:

```txt
s = "AABABBA"
k = 1
```

| left | right | window | maxfreq | need | valid | maxlen |
|------|-------|--------|---------|------|-------|--------|
| 0 | 0 | A | 1 | 0 | yes | 1 |
| 0 | 1 | AA | 2 | 0 | yes | 2 |
| 0 | 2 | AAB | 2 | 1 | yes | 3 |
| 0 | 3 | AABA | 3 | 1 | yes | 4 |
| 0 | 4 | AABAB | 3 | 2 | no → left = 1 |
| 1 | 4 | ABAB | 2 | 2 | yes | 4 |

Return:

```txt
4
```

---

## Complexity

## Time Complexity

```txt
O(n)
```

Reason:

Each character is visited by the sliding window once.

## Space Complexity

```txt
O(1)
```

Reason:

Frequency array size is fixed at 26.

---

## Key Things To Remember

- Keep the window as large as possible.
- `maxfreq` can stay the same even when left moves.
