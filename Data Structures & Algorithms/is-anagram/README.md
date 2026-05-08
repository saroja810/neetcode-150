# Valid Anagram

## Problem Statement

Given two strings `s` and `t`, return `true` if the two strings are anagrams of each other, otherwise return `false`.

An anagram contains the exact same characters as another string, but the order can be different.

---

## Example 1

Input:
```txt
s = "racecar"
t = "carrace"
```

Output:
```txt
true
```

---

## Example 2

Input:
```txt
s = "jar"
t = "jam"
```

Output:
```txt
false
```

---

## Approach

Use a frequency counter to track characters.

- Increment count using string `s`
- Decrement count using string `t`
- If all frequencies become zero, both strings are anagrams

---

## Time Complexity

O(n)

## Space Complexity

O(1)
