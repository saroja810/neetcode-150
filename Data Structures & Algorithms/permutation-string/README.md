# Permutation in String

## Problem Statement

Given two strings `s1` and `s2`, return `true` if `s2` contains a permutation of `s1` as a substring.

---

## Example 1

Input:

```txt
s1 = "ab"
s2 = "eidbaooo"
```

Output:

```txt
true
```

Explanation:

`s2` contains "ba", which is a permutation of `s1`.

---

## Example 2

Input:

```txt
s1 = "ab"
s2 = "eidboaoo"
```

Output:

```txt
false
```

Explanation:

No substring of `s2` has the same characters as `s1`.

---

## Approach

Simple steps:

1. Count the letters in `s1`.
2. Build a window of length `s1.length()` in `s2`.
3. Count the letters in the current window.
4. Compare the two counts.
5. Slide the window one letter at a time.
6. Return `true` if any window matches.

---

## Core Idea

Two windows match when they have the same letter frequencies.

- Use fixed-size arrays for all lowercase letters.
- Compare counts after each slide.

---

## Dry Run

Input:

```txt
s1 = "ab"
s2 = "eidbaooo"
```

| window | freq1 | freq2 | match |
|--------|-------|-------|-------|
| ei | no | no | false |
| id | no | no | false |
| db | no | no | false |
| ba | yes | yes | true |

Return:

```txt
true
```

---

## Complexity

## Time Complexity

```txt
O(n * 26)
```

Reason:

Each slide compares 26 letter counts.

## Space Complexity

```txt
O(1)
```

Reason:

Two fixed arrays of size 26 are used.

---

## Key Things To Remember

- Use a window of size `s1.length()`.
- Compare full letter counts, not just one or two values.
