# Group Anagrams

## Problem Statement

Given an array of strings `strs`, group all anagrams together into sublists.

You may return the output in any order.

An anagram is a word formed by rearranging the letters of another word using exactly the same characters.

---

## Example 1

Input:

```txt
strs = ["eat","tea","tan","ate","nat","bat"]
```

Output:

```txt
[["bat"],["nat","tan"],["ate","eat","tea"]]
```

Explanation:

```txt
eat, tea, ate
```

contain same characters.

```txt
tan, nat
```

contain same characters.

```txt
bat
```

has no matching anagram.

---

## Example 2

Input:

```txt
strs = [""]
```

Output:

```txt
[[""]]
```

---

## Example 3

Input:

```txt
strs = ["a"]
```

Output:

```txt
[["a"]]
```

---

## Constraints

```txt
1 <= strs.length <= 10⁴

0 <= strs[i].length <= 100

strs[i] consists of lowercase English letters
```

---

## Approach

Simple steps:

1. Create a HashMap
2. Traverse each word
3. Sort characters of current word
4. Convert sorted characters into string key
5. If key already exists → add word
6. Otherwise create new group
7. Return all grouped values

---

## Core Idea

Anagrams have:

```txt
Same characters
Same frequencies
```

After sorting:

```txt
eat → aet
tea → aet
ate → aet
```

Same sorted string means same group.

---

## Dry Run

Input:

```txt
["eat","tea","tan","ate"]
```

| Word | Sorted Key | Group |
|-------|-------------|--------|
| eat | aet | [eat] |
| tea | aet | [eat,tea] |
| tan | ant | [tan] |
| ate | aet | [eat,tea,ate] |

Final:

```txt
[
 [eat,tea,ate],
 [tan]
]
```

---

## Complexity

Time Complexity:

```txt
O(n × k log k)
```

where:

```txt
n = number of strings
k = average string length
```

Reason:

Each word needs sorting.

Space Complexity:

```txt
O(n × k)
```

Reason:

HashMap stores all grouped strings.
