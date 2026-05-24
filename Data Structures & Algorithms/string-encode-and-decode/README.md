# Encode and Decode Strings

## Problem Statement

Design an algorithm to encode a list of strings into a single string.

The encoded string should then be decoded back to the original list of strings.

The encoding and decoding process should handle any possible characters.

---

## Example 1

Input:

```txt
["neet","code","love","you"]
```

Encoded:

```txt
"5#neet4#code4#love3#you"
```

Decoded:

```txt
["neet","code","love","you"]
```

---

## Example 2

Input:

```txt
["we","say",":","yes"]
```

Encoded:

```txt
"2#we3#say1#:4#yes"
```

Decoded:

```txt
["we","say",":","yes"]
```

---

## Constraints

```txt
0 <= strs.length <= 100

0 <= strs[i].length <= 200
```

---

## Approach

Simple steps:

### Encoding

1. Traverse each string
2. Find string length
3. Append:

```txt
length + "#" + string
```

4. Continue for all strings

---

### Decoding

1. Read digits until `#`
2. Convert into length
3. Read exact number of characters
4. Add extracted string
5. Repeat until end

---

## Core Idea

Store size before each string.

Structure:

```txt
length#string
```

Example:

```txt
5#hello
```

Means:

```txt
Next 5 characters belong to one word
```

Even if string contains symbols:

```txt
hello###abc
```

Length tells exactly where to stop.

---

## Dry Run

Input:

```txt
["cat","dog"]
```

Encoding:

```txt
3#cat3#dog
```

Decoding:

Read:

```txt
3
```

Take next:

```txt
cat
```

Read:

```txt
3
```

Take next:

```txt
dog
```

Return:

```txt
["cat","dog"]
```

---

## Complexity

Time Complexity:

```txt
O(n)
```

Reason:

Every character is visited once.

Space Complexity:

```txt
O(n)
```

Reason:

Encoded string and decoded list store all characters.
