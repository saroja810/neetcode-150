# Maximum Depth of Binary Tree

## Problem Statement

Given the `root` of a binary tree, return its **maximum depth**.

The **maximum depth** of a binary tree is the number of nodes along the longest path from the root node down to the farthest leaf node.

### Example 1

**Input**
```
root = [1,2,3,null,null,4]
```

**Output**
```
3
```

### Example 2

**Input**
```
root = []
```

**Output**
```
0
```

---

## Approach

This problem can be solved using **Recursion (Depth First Search - DFS)**.

- If the current node is `null`, its depth is `0`.
- Recursively calculate the depth of the left subtree.
- Recursively calculate the depth of the right subtree.
- The depth of the current node is:

```
1 + max(leftDepth, rightDepth)
```

The extra `1` counts the current node itself.

---

## Algorithm

1. If the root is `null`, return `0`.
2. Recursively find the maximum depth of the left subtree.
3. Recursively find the maximum depth of the right subtree.
4. Return `1 + max(leftDepth, rightDepth)`.

---

## Dry Run

### Input

```
        1
       / \
      2   3
         /
        4
```

### Execution

- `maxDepth(2) = 1`
- `maxDepth(4) = 1`
- `maxDepth(3) = 1 + max(1, 0) = 2`
- `maxDepth(1) = 1 + max(1, 2) = 3`

### Output

```
3
```

---

## Complexity Analysis

### Time Complexity

- **O(n)**

Each node is visited exactly once.

### Space Complexity

- **O(h)**

Where `h` is the height of the tree due to the recursion stack.

- Best Case (Balanced Tree): **O(log n)**
- Worst Case (Skewed Tree): **O(n)**

---
