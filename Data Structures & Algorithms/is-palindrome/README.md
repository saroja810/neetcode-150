# Valid Palindrome

## Problem Statement

Given a string `s`, return `true` if it is a palindrome, otherwise return `false`.

A palindrome reads the same forward and backward.

Ignore:

- Uppercase and lowercase differences
- Spaces
- Special characters

Only alphanumeric characters should be considered.

---

## Example 1

Input:

```txt
s = "A man, a plan, a canal: Panama"
```

Output:

```txt
true
```

Explanation:

After removing special characters and converting to lowercase:

```txt
amanaplanacanalpanama
```

Forward and backward are same.

---

## Example 2

Input:

```txt
s = "race a car"
```

Output:

```txt
false
```

---

## Example 3

Input:

```txt
s = " "
```

Output:

```txt
true
```

Explanation:

After removing non-alphanumeric characters:

```txt
""
```

Empty string is a palindrome.

---

## Constraints

```txt
1 <= s.length <= 2 × 10⁵
```

---

## Approach

Simple steps:

1. Place left pointer at beginning
2. Place right pointer at end
3. Ignore non-alphanumeric characters
4. Convert characters to lowercase
5. Compare both characters
6. If different → return false
7. Move both pointers inward
8. Continue until pointers cross

---

## Core Idea

Use Two Pointers:

```txt
left → beginning
right → end
```

Compare only valid characters.

Skip:

```txt
spaces
symbols
punctuation
```

---

## Dry Run

Input:

```txt
"A man, a plan, a canal: Panama"
```

Compare:

```txt
A ↔ a
m ↔ m
a ↔ a
n ↔ n
```

Skip:

```txt
spaces
,
:
```

Continue checking.

All characters match.

Return:

```txt
true
```

---

## Complexity

Time Complexity:

```txt
O(n)
```

Reason:

Each character visited at most once.

Space Complexity:

```txt
O(1)
```

Reason:

Only pointers are used.
