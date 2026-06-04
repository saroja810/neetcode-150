# Linked List Cycle Detection

## Problem Statement

Given the head of a linked list, return `true` if the list contains a cycle. Otherwise, return `false`.

---

## Example 1

Input:

```txt
head = [3,2,0,-4], pos = 1
```

Output:

```txt
true
```

Explanation:

The node at index 1 points back to index 0 and creates a cycle.

---

## Example 2

Input:

```txt
head = [1,2], pos = 0
```

Output:

```txt
true
```

Explanation:

The list loops back from the second node to the first.

---

## Approach

Simple steps:

1. Use a HashSet to store visited nodes.
2. Walk through the list node by node.
3. If a node is already in the set, return `true`.
4. If you reach `null`, return `false`.

---

## Core Idea

Every node object is unique, so a repeated node means a cycle.

- Add each node reference to the set.
- If `add()` returns false, the node was visited before.

---

## Dry Run

Input:

```txt
head = [3,2,0,-4], pos = 1
```

| node value | set contents | action |
|------------|---------------|--------|
| 3 | {3} | add node |
| 2 | {3,2} | add node |
| 0 | {3,2,0} | add node |
| -4 | {3,2,0,-4} | add node |
| 2 | cycle found | return true |

---

## Complexity

## Time Complexity

```txt
O(n)
```

Reason:

Each node is visited once.

## Space Complexity

```txt
O(n)
```

Reason:

The HashSet stores visited nodes.

---

## Key Things To Remember

- Use node references, not node values.
- A repeated node means a cycle exists.
