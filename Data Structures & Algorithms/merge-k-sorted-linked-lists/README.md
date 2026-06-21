# Merge K Sorted Linked Lists

## Problem

You are given an array of `k` linked lists where every linked list is sorted in ascending order.

Merge all linked lists into one sorted linked list and return the head.

### Example

Input:

```
lists = [
    [1,2,4],
    [1,3,5],
    [3,6]
]
```

Output:

```
[1,1,2,3,3,4,5,6]
```

---

# Understanding

We have multiple sorted linked lists.

Example:

```
List 0:
1 -> 2 -> 4

List 1:
1 -> 3 -> 5

List 2:
3 -> 6
```

Each list is already sorted.

Our job:

Combine all nodes while keeping the final list sorted.

---

# Approach 1: Brute Force

## Intuition

Instead of using linked list properties, collect all values into an array.

Then:

1. Store every node value.
2. Sort the array.
3. Create a new linked list.

---

## Example

Input:

```
1 -> 2 -> 4
1 -> 3 -> 5
3 -> 6
```

Collect:

```
[1,2,4,1,3,5,3,6]
```

Sort:

```
[1,1,2,3,3,4,5,6]
```

Create:

```
1 -> 1 -> 2 -> 3 -> 3 -> 4 -> 5 -> 6
```

---

## Time Complexity

```
O(n log n)
```

Because sorting takes most of the time.

---

## Space Complexity

```
O(n)
```

Because we store all values.

---

# Approach 2: Iteration (Finding Minimum Every Time)

## Intuition

We maintain pointers to the current node of every linked list.

At every step:

1. Check all list heads.
2. Find the smallest value.
3. Attach that node to result.
4. Move that list pointer forward.

Basically:

"Among all available nodes, pick the smallest one."

---

# Dry Run Visualization

Input:

```
List 0:
1 -> 4 -> 5

List 1:
1 -> 3 -> 4

List 2:
2 -> 6
```

Initially:

```
lists[0] = 1
lists[1] = 1
lists[2] = 2


Result:

dummy -> null
cur
```

---

## Iteration 1

Check heads:

```
1
1
2
```

Smallest:

```
1 (from list 0)
```

Attach it:

```
dummy -> 1
          ^
          cur
```

Move list0:

Before:

```
1 -> 4 -> 5
```

After:

```
4 -> 5
```

Now:

```
lists[0] = 4
lists[1] = 1
lists[2] = 2
```

---

## Iteration 2

Compare:

```
list0 = 4
list1 = 1
list2 = 2
```

Smallest:

```
1 from list1
```

Attach:

```
dummy -> 1 -> 1
               ^
               cur
```

Move list1:

Before:

```
1 -> 3 -> 4
```

After:

```
3 -> 4
```

Now:

```
lists[0] = 4
lists[1] = 3
lists[2] = 2
```

---

## Iteration 3

Compare:

```
4
3
2
```

Pick:

```
2
```

Attach:

```
dummy

1 -> 1 -> 2
          ^
          cur
```

Move list2:

Before:

```
2 -> 6
```

After:

```
6
```

Now:

```
lists[0] = 4
lists[1] = 3
lists[2] = 6
```

---

## Iteration 4

Compare:

```
4
3
6
```

Pick:

```
3
```

Result:

```
1 -> 1 -> 2 -> 3
```

Move list1:

```
3 -> 4
```

becomes:

```
4
```

---

## Continue

Remaining:

```
4
4
6
```

Pick 4.

Then:

```
5
4
6
```

Pick 4.

Then:

```
5
null
6
```

Pick 5.

Then:

```
null
null
6
```

Pick 6.


Final:

```
1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6
```

---

# Why cur.next = lists[minNode] ?

Suppose:

```
lists[minNode] = 2 -> 6
```

We attach entire node:

```
cur.next = lists[minNode]
```

Meaning:

```
current result node
        |
        v
        2 -> 6
```

Then:

```
lists[minNode] = lists[minNode].next
```

moves the list pointer:

Before:

```
2 -> 6
^
pointer
```

After:

```
6
^
pointer
```

Now next time we can pick 6.

---

# Time Complexity

There are:

```
n total nodes
k linked lists
```

For every node:

we scan all k lists.

So:

```
O(n*k)
```

---

# Space Complexity

```
O(1)
```

Only pointers are used.

---

# Approach 3: Merge Lists One By One

## Intuition

Use the already solved problem:

"Merge Two Sorted Lists"

Merge:

```
List0 + List1
```

Result:

```
1 -> 2 -> 3 -> 4 -> 4 -> 5
```

Then merge:

```
Result + List2
```

Final:

```
1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5 -> 6
```

---

## Time Complexity

```
O(n*k)
```

Because some nodes are processed repeatedly.

---

## Space Complexity

```
O(1)
```

---

# Approach 4: Min Heap

## Intuition

Iteration scans all k lists every time.

Instead of scanning:

Use a Min Heap.

Heap always keeps the smallest node on top.

Steps:

1. Put every list head into heap.
2. Remove smallest.
3. Add its next node.

---

## Complexity

Time:

```
O(n log k)
```

Space:

```
O(k)
```

---

# Approach 5: Divide and Conquer

## Intuition

Like Merge Sort.

Instead of:

```
List0 + List1 + List2 + List3
```

Do:

```
(List0 + List1)

(List2 + List3)
```

Then:

```
(result1 + result2)
```

---

Example:

Before:

```
A B C D
```

First merge:

```
AB   CD
```

Second merge:

```
ABCD
```

---

## Complexity

Time:

```
O(n log k)
```

Space:

```
O(log k)
```

because of recursion.

---

# Comparison

| Approach | Time | Space |
|-|-|-|
| Brute Force | O(n log n) | O(n) |
| Iteration | O(n*k) | O(1) |
| Merge One By One | O(n*k) | O(1) |
| Heap | O(n log k) | O(k) |
| Divide Conquer | O(n log k) | O(log k) |

---

# Interview Explanation

"I have k sorted linked lists.  
The simple approach is collecting all values and sorting, but it ignores the sorted property.  
A better approach is using merge two sorted lists repeatedly.  
For optimal performance we can use min heap or divide and conquer to get O(n log k)."

---

# Key Learning

This problem is basically:

```
Merge Two Sorted Lists
+
Multiple Lists Handling
```

The main pattern:

Whenever you see:

"merge k sorted things"

Think:

1. Heap

or

2. Divide and conquer
