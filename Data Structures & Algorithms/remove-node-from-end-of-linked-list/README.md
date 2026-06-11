# Remove Node From End of Linked List

## Problem Statement

Given the head of a linked list and an integer `n`, remove the n-th node from the end of the list and return the head of the list.

---

## Example 1

Input:

```txt
head = [1,2,3,4,5]
n = 2
```

Output:

```txt
[1,2,3,5]
```

Explanation:

The second node from the end is `4`, so it is removed.

---

## Example 2

Input:

```txt
head = [1]
n = 1
```

Output:

```txt
[]
```

Explanation:

The only node is removed, leaving an empty list.

---

## Approach

Simple steps:

1. Create a dummy node before `head`.
2. Set `sp` and `fp` to the dummy.
3. Move `fp` forward `n + 1` steps.
4. Move both pointers until `fp` reaches the end.
5. `sp.next` is the node to remove.
6. Set `sp.next = sp.next.next` and return `dummy.next`.

---

## Core Idea

Keep a gap of `n` nodes between the fast and slow pointers.

- When the fast pointer reaches the end, slow points to the node before the one to remove.
- Using a dummy node handles removal of the head cleanly.

---

## Dry Run

Input:

```txt
head = [1,2,3,4,5]
n = 2
```

| step | sp | fp | action |
|------|----|----|--------|
| 1 | dummy | dummy | start |
| 2 | dummy | 1 | move fp 1 |
| 3 | dummy | 2 | move fp 2 |
| 4 | dummy | 3 | move fp 3 |
| 5 | dummy | 4 | move fp 4 |
| 6 | sp=1 | fp=5 | move both until fp null |
| 7 | sp=3 | fp=null | remove sp.next (4) |

Return:

```txt
[1,2,3,5]
```

---

## Complexity

## Time Complexity

```txt
O(n)
```

Reason:

We traverse the list once with the fast pointer.

## Space Complexity

```txt
O(1)
```

Reason:

Only a few pointers are used.

---

## Key Things To Remember

- Use a dummy node to simplify removal.
- Move the fast pointer `n + 1` steps ahead before moving both pointers.
