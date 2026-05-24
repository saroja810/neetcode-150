# Valid Sudoku

## Problem Statement

Determine if a `9 x 9` Sudoku board is valid.

Only the filled cells need to be validated according to the following rules:

---

## Rules

### Rule 1: Row Check

A row must not contain duplicate numbers.

```txt
5 3 . . 7 . . . .
6 . . 1 9 5 . . .
5 . . . . . . . .
```

Invalid:

```txt
5 appears twice in same row
```

---

### Rule 2: Column Check

A column must not contain duplicate numbers.

```txt
5 . . . . . . . .
6 . . . . . . . .
5 . . . . . . . .
```

Invalid:

```txt
5 appears twice in same column
```

---

### Rule 3: 3×3 Box Check

Each 3×3 sub-box must not contain duplicate numbers.

```txt
5 3 . | . . . | . . .
6 5 . | . . . | . . .
. . . | . . . | . . .
```

Invalid:

```txt
5 appears twice in same box
```

---

## Example

Input:

```txt
[
["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]
]
```

Output:

```txt
true
```

---

## Approach

Simple steps:

1. Create row sets
2. Create column sets
3. Create box sets
4. Traverse every cell
5. Ignore `.`
6. Check duplicates in:

- Row
- Column
- Box

7. If duplicate found → false
8. Otherwise continue

---

## Core Idea

For every number:

Check these three:

```txt
(row, value)
(column, value)
(box, value)
```

If already seen:

```txt
duplicate exists
```

---

## Box Formula

To determine box index:

```txt
(row / 3) * 3 + (col / 3)
```

Examples:

```txt
(0,0) → box 0
(1,2) → box 0
(4,5) → box 4
(8,8) → box 8
```

---

## Dry Run

Cell:

```txt
board[4][5]="3"
```

Check:

```txt
Row 4
Column 5
Box 4
```

If value already exists in any:

```txt
return false
```

Otherwise insert.

---

## Complexity

Time Complexity:

```txt
O(81)
```

Reason:

Maximum board size always fixed.

Space Complexity:

```txt
O(1)
```

Reason:

Board size remains constant.
