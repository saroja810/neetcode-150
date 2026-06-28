# Diameter of Binary Tree

## Problem

Given the `root` of a binary tree, return the **length of the diameter** of the tree.

The **diameter** of a binary tree is the **longest path between any two nodes** in the tree.

The path **may or may not pass through the root**.

The length of the path is measured in **number of edges**.

---

# Example

```
        1
       / \
      2   3
     / \
    4   5
       /
      6
```

Longest path:

```
6 → 5 → 2 → 1 → 3
```

Diameter:

```
4 edges
```

---

# Approach (Algorithm)

1. Start DFS from the root.
2. For every node:
   - Find the height of the left subtree.
   - Find the height of the right subtree.
3. The longest path passing through the current node is:

```
left + right
```

4. Update the maximum diameter.
5. Return the height of the current subtree to the parent.
6. After DFS completes, return the maximum diameter.

---

# Core Idea

The recursive function returns the **height** of the current subtree.

While calculating height, we also compute the **diameter passing through every node** and store the maximum answer.

---

# Formula

### Diameter through current node

```
diameter = leftHeight + rightHeight
```

Update answer

```java
res[0] = Math.max(res[0], left + right);
```

Return height

```java
return 1 + Math.max(left, right);
```

---

# Why res[]?

The recursive function already returns the **height**.

But we also need to store the **maximum diameter**.

A Java method can return only one value.

So we use:

- return → height
- res[] → diameter

Since arrays are objects, every recursive call shares the same array.

Example

```java
int[] res = new int[1];
```

```
main()

res
 │
 ▼
+-----+
|  0  |
+-----+

       ▲
       │
dfs() also points to the same array
```

When DFS updates

```java
res[0] = 4;
```

the main function also sees

```java
res[0] == 4

---

# Code Dry Run

Tree

```
        1
       / \
      2   3
     / \
    4   5
       /
      6
```

Initially

```
res[0] = 0
```

---

### dfs(4)

```
left = 0
right = 0

res[0] = max(0,0)

res[0] = 0

return 1
```

---

### dfs(6)

```
left = 0
right = 0

res[0] = max(0,0)

res[0] = 0

return 1
```

---

### dfs(5)

```
left = 1
right = 0

res[0] = max(0,1)

res[0] = 1

return 2
```

---

### dfs(2)

```
left = 1
right = 2

res[0] = max(1,3)

res[0] = 3

return 3
```

---

### dfs(3)

```
left = 0
right = 0

res[0] = max(3,0)

res[0] = 3

return 1
```

---

### dfs(1)

```
left = 3
right = 1

res[0] = max(3,4)

res[0] = 4

return 4
```

---

Final Answer

```
return res[0]

= 4
```

Longest path

```
6 → 5 → 2 → 1 → 3
```

Diameter

```
4 edges
```

---

# Complexity

## Time Complexity

```
O(n)
```

Every node is visited exactly once.

---

## Space Complexity

```
O(h)
```

where `h` is the height of the tree.

Worst case:

```
O(n)
```

for a skewed tree.

Balanced tree:

```
O(log n)
```

---

# Interview Explanation

> "I perform a DFS to calculate the height of every subtree. While returning the height, I compute the diameter passing through the current node as `leftHeight + rightHeight` and maintain the maximum diameter in a shared array. This visits every node once, giving O(n) time complexity."

---

# Pattern Recognition

Use this recursion pattern when:

- Parent needs information from children.
- Recursive function returns one value.
- Another answer needs to be tracked globally.

Examples:

- Diameter of Binary Tree
- Binary Tree Maximum Path Sum
- Balanced Binary Tree
- Height of Binary Tree
- Longest Univalue Path

---

# Key Things To Remember

## 1. Diameter is measured in edges.

---

## 2. Diameter may not pass through the root.

---

## 3. DFS returns height.

---

## 4. Diameter through current node

```
leftHeight + rightHeight
```

---

## 5. Update maximum answer before returning height.

---

## 6. `res[]` is used because Java methods return only one value.

---

# Memory Trick

> "Return what the parent needs (height), store what the problem needs (diameter)."

```
DFS returns → Height

Global variable / res[] stores → Diameter
```
