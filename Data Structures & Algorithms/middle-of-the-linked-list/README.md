# Middle of the Linked List

## Problem Statement

Given the head of a singly linked list, return the middle node. If there are two middle nodes, return the second middle node.

---

## Example 1

Input:

```txt
head = [1,2,3,4,5]
```

Output:

```txt
[3,4,5]
```

Explanation:

The middle node is `3`, and the result returns the list from that node.

---

## Example 2

Input:

```txt
head = [1,2,3,4,5,6]
```

Output:

```txt
[4,5,6]
```

Explanation:

There are two middle nodes, `3` and `4`. We return the second one, `4`.

---

## Approach

Simple steps:

1. Set `sp` and `fp` both to `head`.
2. Move `sp` one step and `fp` two steps each loop.
3. Stop when `fp` is null or `fp.next` is null.
4. Return `sp`.

---

## Core Idea

A fast pointer moves twice as fast as a slow pointer.

- When the fast pointer reaches the end, the slow pointer is at the middle.
- If the list length is even, the slow pointer stops at the second middle.

---

## Dry Run

Input:

```txt
head = [1,2,3,4,5,6]
```

| step | sp | fp | action |
|------|----|----|--------|
| 1 | 1 | 1 | start |
| 2 | 2 | 3 | move sp by 1, fp by 2 |
| 3 | 3 | 5 | move sp by 1, fp by 2 |
| 4 | 4 | null | move sp by 1, fp reaches end |

Return:

```txt
[4,5,6]
```

---

## Complexity

## Time Complexity

```txt
O(n)
```

Reason:

The fast pointer moves through the list once.

## Space Complexity

```txt
O(1)
```

Reason:

Only two pointers are used.

---

## Key Things To Remember

- Fast pointer moves two steps, slow pointer moves one.
- Return the slow pointer when the fast pointer is done.
