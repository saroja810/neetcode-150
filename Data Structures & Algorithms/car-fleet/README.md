# Car Fleet

## Problem Statement

There are `n` cars traveling to the same destination on a one-lane highway.

You are given two arrays:

* `position[i]` → starting position of the ith car
* `speed[i]` → speed of the ith car

Destination is at `target` miles.

Rules:

* A car cannot overtake another car.
* A faster car behind may catch a slower car ahead.
* Once it catches up, it must move at the slower car's speed.
* These cars become one **fleet**.
* A single car also counts as one fleet.
* If cars meet exactly at the destination, they are still one fleet.

Return the number of fleets reaching the destination.

---

# Simplified Problem Statement

Many cars are moving on a one-lane road.

Cars cannot pass each other.

If a faster car reaches a slower car ahead, it gets blocked and both move together.

Your task:

Find how many separate groups (fleets) finally reach the destination.

---

# Core Idea

Do NOT simulate movement.

Think:

"How much time does each car need to reach the destination?"

Time:

`(target-position)/speed`

Then ask:

"Can this car catch the fleet ahead?"

If yes → join fleet

If no → create new fleet

---

# Why Sort?

Sort cars by:

Nearest to target → Farthest

Reason:

Each car only depends on the fleet ahead.

---

# Approach 1: Stack Solution

## Steps

### Step 1

Pair position and speed.

(position,speed)

### Step 2

Sort by position descending.

Closest to destination first.

### Step 3

Compute time:

`time=(target-position)/speed`

### Step 4

Use stack to store fleet arrival times.

If:

currentTime > stack.peek()

Create new fleet.
Push into stack.

Else:

currentTime <= stack.peek()

Car catches fleet.
Do nothing.

---

## Dry Run

Input:

Target = 10

position=[4,1,0,7]

speed=[2,2,1,1]

Pair:

(4,2)
(1,2)
(0,1)
(7,1)

Sort:

(7,1)
(4,2)
(1,2)
(0,1)

Times:

Car at 7:

(10−7)/1=3

Car at 4:

(10−4)/2=3

Car at 1:

(10−1)/2=4.5

Car at 0:

(10−0)/1=10

Times:

3,3,4.5,10

Stack process:

3 → push

stack=[3]

3 <= 3

join fleet

stack=[3]

4.5 > 3

new fleet

stack=[3,4.5]

10 > 4.5

new fleet

stack=[3,4.5,10]

Answer:

3 fleets

---

## Time Complexity

Sorting:

O(n log n)

Traversal:

O(n)

Total:

O(n log n)

---

## Space Complexity

Car array:

O(n)

Stack:

O(n)

Total:

O(n)

---

# Approach 2: Optimized Solution (Without Stack)

Observation:

We only compare with latest fleet time.

So stack is unnecessary.

Use:

* fleetCount
* lastFleetTime

---

## Steps

### Step 1

Pair position and speed.

### Step 2

Sort descending.

### Step 3

Calculate time.

### Step 4

Compare with lastFleetTime.

If:

time > lastFleetTime

new fleet

fleetCount++

update lastFleetTime

Else:

join existing fleet

ignore

---

## Dry Run

Times:

3,3,4.5,10

Start:

fleet=0
lastFleetTime=0

3 >0

fleet=1
lastFleetTime=3

3<=3

join

fleet=1

4.5>3

fleet=2
lastFleetTime=4.5

10>4.5

fleet=3

Answer:

3 fleets

---

## Time Complexity

Sorting:

O(n log n)

Traversal:

O(n)

Total:

O(n log n)

---

## Space Complexity

Only variables:

fleetCount
lastFleetTime

Space:

O(1)
