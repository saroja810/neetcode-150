# Merge Two Sorted Linked Lists

## Problem Statement

You are given the heads of two sorted linked lists, `list1` and `list2`. Merge the two lists into one sorted list. Return the merged list.

---

## Example 1

Input:

```txt
list1 = [1,2,4]
list2 = [1,3,4]
```

Output:

```txt
[1,1,2,3,4,4]
```

Explanation:

The two lists are merged in order and the result is a single sorted list.

---

## Example 2

Input:

```txt
list1 = []
list2 = [0]
```

Output:

```txt
[0]
```

Explanation:

The first list is empty, so the merged list is just the second list.

---

## Approach

Simple steps:

1. Create a dummy node and a pointer `node` that starts there.
2. While both lists have nodes, compare their values.
3. Attach the smaller node to `node.next`.
4. Move `node` and the list pointer you used.
5. After the loop, attach any remaining nodes.
6. Return `dummy.next`.

---

## Core Idea

Merge the two sorted lists like merging sorted arrays.

- Always choose the smaller current node.
- Keep one pointer to build the result list.
- Use a dummy node so the first node is easy to return.

---

## Dry Run

Input:

```txt
list1 = [1,2,4]
list2 = [1,3,4]
```

| list1 head | list2 head | chosen | result list |
|------------|------------|--------|-------------|
| 1 | 1 | list2 1 or list1 1 | [1] |
| 2 | 1 | list2 1 | [1,1] |
| 2 | 3 | list1 2 | [1,1,2] |
| 4 | 3 | list2 3 | [1,1,2,3] |
| 4 | 4 | list1 4 | [1,1,2,3,4] |
| 4 | null | remaining list1 | [1,1,2,3,4,4] |

Return:

```txt
[1,1,2,3,4,4]
```

---

## Complexity

## Time Complexity

```txt
O(n + m)
```

Reason:

We visit each node in both lists once.

## Space Complexity

```txt
O(1)
```

Reason:

Only a few pointers are used, no extra list is created.

---

## Key Things To Remember

- Use a dummy node to simplify the merge.
- Attach the remaining part after one list ends.
