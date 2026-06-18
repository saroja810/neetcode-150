# LRU Cache

## Problem

Design a data structure that follows the **Least Recently Used (LRU)** policy.

Support:

```java
LRUCache(int capacity)
int get(int key)
void put(int key, int value)
```

Rules:

* `get(key)`

  * Return value if key exists.
  * Otherwise return `-1`.
  * Accessed key becomes **Most Recently Used (MRU)**.

* `put(key, value)`

  * Insert or update key.
  * If cache exceeds capacity, remove the **Least Recently Used (LRU)** key.

---

# Approach 1 → ArrayList (Brute Force)

## Core Idea

Store all `(key, value)` pairs in a list.

Order:

```text
Oldest -----------------> Newest
LRU                      MRU
```

Whenever a key is accessed:

* Remove it from current position.
* Move it to the end.

Whenever cache is full:

* Remove first element.
* Insert new element at end.

---

# Visualization

Capacity:

```text
2
```

After:

```java
put(1,10)
```

```text
[1,10]
```

After:

```java
put(2,20)
```

```text
[1,10] [2,20]
```

LRU = 1

MRU = 2

---

After:

```java
get(1)
```

Move key 1 to end.

Before:

```text
[1,10] [2,20]
```

After:

```text
[2,20] [1,10]
```

LRU = 2

MRU = 1

---

After:

```java
put(3,30)
```

Cache full.

Remove first element:

```text
[2,20] [1,10]
```

↓

```text
[1,10]
```

Insert:

```text
[1,10] [3,30]
```

---

# Algorithm

## get(key)

* Traverse list.
* If key found:

  * Remove pair.
  * Add pair to end.
  * Return value.
* Else return `-1`.

---

## put(key,value)

* Traverse list.
* If key exists:

  * Remove pair.
  * Update value.
  * Add pair to end.
* Else:

  * If cache full:

    * Remove first pair.
  * Add new pair to end.

---

# Complexity

## Time Complexity

### get()

```text
O(n)
```

Need to search list.

### put()

```text
O(n)
```

Need to search list.

---

## Space Complexity

```text
O(n)
```

Store up to n entries.

---

# Why Brute Force Fails

The problem requires:

```text
get()  -> O(1)
put()  -> O(1)
```

But ArrayList requires searching.

So we need a better design.

---

# Approach 2 → HashMap + Doubly Linked List

## Core Idea

Use:

```java
HashMap<Integer, Node>
```

for O(1) lookup.

Use:

```text
Doubly Linked List
```

for O(1) insertion and deletion.

---

# Why HashMap?

HashMap stores:

```text
key -> node
```

Example:

```text
1 -> node1
2 -> node2
3 -> node3
```

So:

```java
cache.get(2)
```

directly gives:

```text
node2
```

No traversal.

---

# Why Doubly Linked List?

Need to:

* Remove node from middle.
* Move node to MRU position.
* Remove LRU node.

All in:

```text
O(1)
```

---

# Structure

Use two dummy nodes:

```text
left <-> right
```

where:

```text
left  = before LRU
right = after MRU
```

Example:

```text
left <-> 2 <-> 5 <-> 8 <-> right
```

Meaning:

```text
LRU = 2
MRU = 8
```

---

# remove(node)

Before:

```text
left <-> 2 <-> 5 <-> 8 <-> right
```

Remove 5:

```text
left <-> 2 <-> 8 <-> right
```

Code:

```java
Node prev = node.prev;
Node nxt = node.next;

prev.next = nxt;
nxt.prev = prev;
```

---

# insert(node)

Insert before right.

Before:

```text
left <-> 2 <-> 8 <-> right
```

Insert 5:

```text
left <-> 2 <-> 8 <-> 5 <-> right
```

Now:

```text
MRU = 5
```

---

# get(key)

If key exists:

```java
Node node = cache.get(key);
```

Move node to MRU position:

```java
remove(node);
insert(node);
```

Return:

```java
node.val
```

Else:

```java
return -1;
```

---

# put(key,value)

## Case 1: Key Exists

Remove old node:

```java
remove(cache.get(key));
```

Create updated node.

Insert near MRU.

Update HashMap.

---

## Case 2: New Key

Create node.

Store in HashMap.

Insert near MRU.

---

## Capacity Exceeded

Take:

```java
Node lru = left.next;
```

Because first real node is LRU.

Remove:

```java
remove(lru);
cache.remove(lru.key);
```

---

# Example

Capacity:

```text
2
```

Operations:

```java
put(1,10)
put(2,20)
get(1)
put(3,30)
```

---

After:

```java
put(1,10)
```

```text
left <-> 1 <-> right
```

---

After:

```java
put(2,20)
```

```text
left <-> 1 <-> 2 <-> right
```

LRU = 1

MRU = 2

---

After:

```java
get(1)
```

```text
left <-> 2 <-> 1 <-> right
```

LRU = 2

MRU = 1

---

After:

```java
put(3,30)
```

Insert:

```text
left <-> 2 <-> 1 <-> 3 <-> right
```

Capacity exceeded.

Remove LRU:

```text
2
```

Result:

```text
left <-> 1 <-> 3 <-> right
```

---

# Complexity

## Time Complexity

### get()

```text
O(1)
```

### put()

```text
O(1)
```

---

## Space Complexity

```text
O(n)
```

HashMap + Doubly Linked List store at most n nodes.

