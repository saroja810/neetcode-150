# Reorder List

## Problem

You are given the head of a singly linked list.

Reorder the list to follow the pattern:

```text
L0 → Ln → L1 → Ln−1 → L2 → Ln−2 → ...
```

You may not modify the values in the nodes. Only the links between nodes can be changed.

---

## Approach: Find Middle + Reverse + Merge

### Intuition

To reorder the list into the required pattern, we need nodes from both the beginning and the end of the list.

Instead of repeatedly finding the last node, we can simplify the problem into three steps:

1. Find the middle of the linked list using slow and fast pointers.
   This divides the list into two halves.

2. Reverse the second half of the list.
   After reversing, the last node becomes the first node of the second half.

3. Merge the two halves alternately.
   Take one node from the first half and one node from the reversed second half until all nodes are connected.

This approach is efficient and uses only constant extra space.

---

## Algorithm

### Step 1: Find the Middle

Use slow and fast pointers.

- Move `slow` one step at a time.
- Move `fast` two steps at a time.

When `fast` reaches the end, `slow` will be positioned at the middle of the list.

Split the list into two halves:

```java
ListNode second = slow.next;
slow.next = null;
```

---

### Step 2: Reverse the Second Half

Reverse the second half using the standard linked list reversal technique.

Maintain:

- `prev`
- `second`
- `temp`

After reversal:

```text
4 → 5
```

becomes

```text
5 → 4
```

---

### Step 3: Merge Both Halves

Maintain two pointers:

```java
first = head;
second = reversedHalf;
```

Connect nodes alternately:

```text
first → second → first → second ...
```

Continue until all nodes from the second half are used.

---

## Dry Run

### Input

```text
1 → 2 → 3 → 4 → 5
```

### Find Middle

```text
First Half:
1 → 2 → 3

Second Half:
4 → 5
```

### Reverse Second Half

```text
5 → 4
```

### Merge

```text
1 → 5 → 2 → 4 → 3
```

### Output

```text
1 → 5 → 2 → 4 → 3
```

---

## Complexity Analysis

### Time Complexity

**O(n)**

- Finding the middle → O(n)
- Reversing the second half → O(n)
- Merging both halves → O(n)

Overall:

```text
O(n)
```

### Space Complexity

**O(1)**

Only a few pointers are used.

---

**Find Middle → Reverse Second Half → Merge Alternately**
