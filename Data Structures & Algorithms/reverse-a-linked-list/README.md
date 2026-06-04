# Reverse a Linked List

## Problem Statement

Given the head of a singly linked list, reverse the list and return the new head.

---

## Example 1

Input:

```txt
head = [1,2,3,4,5]
```

Output:

```txt
[5,4,3,2,1]
```

Explanation:

The list is reversed.

---

## Example 2

Input:

```txt
head = [1,2]
```

Output:

```txt
[2,1]
```

Explanation:

The two nodes are reversed.

---

## Approach

Simple steps:

1. Use `prev = null` and `curr = head`.
2. Save `next = curr.next`.
3. Point `curr.next` to `prev`.
4. Move `prev` to `curr` and `curr` to `next`.
5. Repeat until `curr` is null.
6. Return `prev`.

---

## Core Idea

Reverse the pointer on each node while walking the list.

- Keep the previous node so the current node can point backward.
- Use the saved next node to continue traversal.

---

## Dry Run

Input:

```txt
head = [1,2,3]
```

| curr | prev | next | action |
|------|------|------|--------|
| 1 | null | 2 | 1.next = null; prev = 1; curr = 2 |
| 2 | 1 | 3 | 2.next = 1; prev = 2; curr = 3 |
| 3 | 2 | null | 3.next = 2; prev = 3; curr = null |

Return:

```txt
[3,2,1]
```

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
O(1)
```

Reason:

Only a few pointers are used.

---

## Key Things To Remember

- Always save `next` before reversing the pointer.
- Return `prev` when the loop finishes.
