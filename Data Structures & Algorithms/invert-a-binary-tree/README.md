# Invert Binary Tree

## Problem Statement

Given the `root` of a binary tree, invert the tree and return its root.

Inverting a binary tree means swapping the left and right child of every node in the tree.

### Example 1

**Input**
```
root = [1,2,3,4,5,6,7]
```

**Output**
```
[1,3,2,7,6,5,4]
```

### Example 2

**Input**
```
root = [3,2,1]
```

**Output**
```
[3,1,2]
```

### Example 3

**Input**
```
root = []
```

**Output**
```
[]
```

---

## Approach

This problem is solved using **Recursion (Depth First Search - DFS)**.

- If the current node is `null`, return `null`.
- Swap the left and right child of the current node.
- Recursively invert the left subtree.
- Recursively invert the right subtree.
- Finally, return the root.

Since every node is visited exactly once, this approach is efficient and simple.

---

## Algorithm

1. If the root is `null`, return `null`.
2. Swap the left and right child of the current node.
3. Recursively invert the left subtree.
4. Recursively invert the right subtree.
5. Return the root.

---

## Dry Run

### Input

```
        1
       / \
      2   3
     / \ / \
    4  5 6  7
```

### Step 1

Swap children of `1`

```
        1
       / \
      3   2
     / \ / \
    6  7 4  5
```

### Step 2

Recursively swap children of every remaining node.

Final Tree

```
        1
       / \
      3   2
     / \ / \
    7  6 5  4
```

### Output

```
[1,3,2,7,6,5,4]
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
