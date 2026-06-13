# Add Two Numbers

## Problem Statement

You are given two non-empty linked lists `l1` and `l2` representing two non-negative integers.

The digits are stored in reverse order, and each node contains a single digit.

Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number `0` itself.

---

## Example 1

### Input

```text
l1 = [2,4,3]
l2 = [5,6,4]
```

### Output

```text
[7,0,8]
```

### Explanation

```text
342 + 465 = 807
```

---

## Example 2

### Input

```text
l1 = [0]
l2 = [0]
```

### Output

```text
[0]
```

---

## Example 3

### Input

```text
l1 = [9,9,9,9,9,9,9]
l2 = [9,9,9,9]
```

### Output

```text
[8,9,9,9,0,0,0,1]
```

---

## Constraints

- The number of nodes in each linked list is in the range `[1, 100]`
- `0 <= Node.val <= 9`
- It is guaranteed that the list represents a number that does not have leading zeros

---

## Approach

Simple steps:

1. Create a dummy node for the result linked list.
2. Maintain a pointer `curr` to build the answer.
3. Maintain a variable `carry`.
4. Traverse both linked lists simultaneously.
5. If a list becomes null, treat its digit as `0`.
6. Calculate:

```text
sum = digit1 + digit2 + carry
```

7. Store `sum % 10` in a new node.
8. Update carry using:

```text
carry = sum / 10
```

9. Move to the next nodes.
10. After traversal, if carry still exists, create one final node.
11. Return `dummy.next`.

---

## Core Idea

The solution follows the same process as manual addition.

For every position:

```text
Digit1 + Digit2 + Carry
```

Store:

```text
sum % 10
```

as the current digit and keep:

```text
sum / 10
```

as the carry for the next position.

Since digits are already stored in reverse order, no reversing is required.

---

## Dry Run

### Input

```text
l1 = [2,4,3]
l2 = [5,6,4]
```

### Iteration 1

```text
2 + 5 + 0 = 7

Node = 7
Carry = 0
```

Result:

```text
[7]
```

### Iteration 2

```text
4 + 6 + 0 = 10

Node = 0
Carry = 1
```

Result:

```text
[7,0]
```

### Iteration 3

```text
3 + 4 + 1 = 8

Node = 8
Carry = 0
```

Result:

```text
[7,0,8]
```

### Final Output

```text
[7,0,8]
```

---

## Complexity Analysis

### Time Complexity

```text
O(max(n, m))
```

where:

- `n` = length of `l1`
- `m` = length of `l2`

Reason:

Each node is visited exactly once.

### Space Complexity

```text
O(max(n, m))
```

Reason:

A new linked list is created to store the result.
