# Time Based Key Value Store

## Problem Statement

Implement a time-based key-value store that can store multiple values for the same key at different timestamps. It should return the value set at the largest timestamp less than or equal to the given timestamp.

---

## Example 1

Input:

```txt
set("foo","bar",1)
get("foo",1)
get("foo",3)
set("foo","bar2",4)
get("foo",4)
get("foo",5)
```

Output:

```txt
"bar"
"bar"
"bar2"
"bar2"
```

Explanation:

The value for timestamp 3 is the most recent value at timestamp 1.

---

## Example 2

Input:

```txt
set("love","high",10)
set("love","low",20)
get("love",5)
get("love",10)
get("love",15)
```

Output:

```txt
""
"high"
"high"
```

Explanation:

No value exists before timestamp 10, then the latest value is returned.

---

## Approach

Simple steps:

1. Use a HashMap from key to a list of `(timestamp, value)` pairs.
2. Append new pairs in `set()`.
3. In `get()`, use binary search on the pair list.
4. Return the value with the largest timestamp <= requested timestamp.
5. If none exists, return an empty string.

---

## Core Idea

Store values in time order and search by timestamp.

- Each key has an ordered list of updates.
- Binary search finds the best match quickly.

---

## Dry Run

Input:

```txt
set("foo","bar",1)
set("foo","bar2",4)
get("foo",3)
```

| key | stored pairs | timestamp | result |
|-----|--------------|-----------|--------|
| foo | [(1,bar),(4,bar2)] | 3 | choose value at 1 → bar |

Return:

```txt
"bar"
```

---

## Complexity

## Time Complexity

```txt
O(log n)
```

Reason:

`get()` uses binary search on the list of pairs.

## Space Complexity

```txt
O(n)
```

Reason:

All stored items are saved in the map.

---

## Key Things To Remember

- Values are kept in insertion order for each key.
- Binary search finds the most recent timestamp <= target.
