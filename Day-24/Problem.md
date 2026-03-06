# Day 24 – Merge Overlapping Intervals

## 🧩 Problem Statement
Given a collection of intervals represented as a 2D array **arr[][]**, where each interval is `[start, end]`, merge all **overlapping intervals** and return the resulting intervals.

Two intervals overlap if:

start₂ ≤ end₁


---

## 📥 Input
- A 2D array **arr[][]** of size **N × 2**
- Each row represents an interval `[start, end]`

## 📤 Output
- Return a list of merged intervals

---

## 🔢 Constraints
- 1 ≤ N ≤ 10⁵  
- 0 ≤ start ≤ end ≤ 10⁹  

---

## 🧪 Example 1
**Input:**

arr = [[1,3], [2,4], [6,8], [9,10]]


**Output:**

[[1,4], [6,8], [9,10]]


**Explanation:**
Intervals `[1,3]` and `[2,4]` overlap, so they merge into `[1,4]`.

---

## 🧪 Example 2
**Input:**

arr = [[6,8], [1,9], [2,4], [4,7]]


**Output:**

[[1,9]]


**Explanation:**
All intervals overlap with each other.

---

## 💡 Explanation
To merge intervals efficiently:
1. Sort intervals based on **start time**
2. Compare current interval with last merged interval
3. Merge if they overlap

---

## 🛠️ Solution Approaches

---

### ⚠️ Solution 1: Nested Merge Check
- Sort intervals by start
- For each interval, check upcoming intervals
- Extend the end while overlaps continue

**Time Complexity:** `O(N²)`  
**Space Complexity:** `O(N)`

⚠️ Less efficient due to nested traversal

---

### ⭐ Solution 2: Greedy Merge (Optimized)
Steps:
1. Sort intervals based on start
2. Traverse intervals
3. If current interval overlaps with last merged interval → merge them
4. Otherwise add new interval

**Time Complexity:** `O(N log N)` (sorting)  
**Space Complexity:** `O(N)`

✔ Efficient and widely used interview solution

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Nested Merge | O(N²) | O(N) | ⚠️ Less Efficient |
| Greedy Merge | O(N log N) | O(N) | ⭐ Optimal |

