# Daily Temperatures

## Problem Statement

Given an array `temperatures`, return an array `answer` where `answer[i]` is the number of days after day `i` that a warmer temperature appears. If there is no future day with a warmer temperature, set `answer[i] = 0`.

---

## Example 1

Input:

```txt
temperatures = [73,74,75,71,69,72,76,73]
```

Output:

```txt
[1,1,4,2,1,1,0,0]
```

Explanation:

For day 0, the next warmer day is day 1. For day 2, the next warmer day is day 6.

---

## Example 2

Input:

```txt
temperatures = [30,40,50,60]
```

Output:

```txt
[1,1,1,0]
```

Explanation:

Each temperature is followed by a warmer day except the last one.

---

## Approach

Simple steps:

1. Use a stack to keep indexes of days.
2. For each day, while the stack is not empty and current temperature is warmer than top of stack:
3. Pop the older day and set its answer to `currentIndex - oldIndex`.
4. Push the current day index onto the stack.
5. Remaining days have no warmer future day.

---

## Core Idea

Keep a stack of indexes where temperatures are waiting to find a warmer day.

- When a warmer day appears, resolve all colder days before it.
- This avoids scanning ahead for each day.

---

## Dry Run

Input:

```txt
temperatures = [73,74,75,71,69,72,76,73]
```

| i | temp | stack indexes | action | answer update |
|---|------|----------------|--------|----------------|
| 0 | 73 | [0] | push | - |
| 1 | 74 | [0,1] | pop 0 | ans[0] = 1 |
| 2 | 75 | [1,2] | pop 1 | ans[1] = 1 |
| 3 | 71 | [2,3] | push | - |
| 4 | 69 | [2,3,4] | push | - |
| 5 | 72 | pop 4 | ans[4] = 1; pop 3 | ans[3] = 2 |
| 6 | 76 | [2,6] | pop 2 | ans[2] = 4 |
| 7 | 73 | [6,7] | push | - |

Return:

```txt
[1,1,4,2,1,1,0,0]
```

---

## Complexity

## Time Complexity

```txt
O(n)
```

Reason:

Each index is pushed and popped at most once.

## Space Complexity

```txt
O(n)
```

Reason:

The stack and answer array use extra space.

---

## Key Things To Remember

- Use indexes on the stack, not values.
- The stack keeps days that still need a warmer future temperature.
