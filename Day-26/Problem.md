# Day 26 – Non-Overlapping Intervals

## 🧩 Problem Statement
Given a list of intervals **intervals[][]**, determine the **minimum number of intervals that must be removed** so that the remaining intervals do **not overlap**.

Two intervals overlap if:

start₂ < end₁


---

## 📥 Input
- A 2D array **intervals[][]** of size **N × 2**
- Each row represents an interval `[start, end]`

## 📤 Output
- Return the **minimum number of intervals to remove** so the rest are non-overlapping

---

## 🔢 Constraints
- 1 ≤ N ≤ 10⁵  
- 0 ≤ start ≤ end ≤ 10⁹  

---

## 🧪 Example 1
**Input:**

intervals = [[1,2], [2,3], [3,4], [1,3]]


**Output:**

1


**Explanation:**
Removing `[1,3]` makes the rest of the intervals non-overlapping.

---

## 🧪 Example 2
**Input:**

intervals = [[1,2], [1,2], [1,2]]


**Output:**

2


**Explanation:**
We must remove two intervals to avoid overlaps.

---

## 🧪 Example 3
**Input:**

intervals = [[1,2], [2,3]]


**Output:**

0


**Explanation:**
Intervals do not overlap.

---

## 💡 Explanation
To minimize removals, we should **keep intervals with smaller end times** when overlaps occur.  
This ensures more intervals can fit without overlapping.

---

## 🛠️ Solution Approach (Greedy)

Steps:
1. Sort intervals by **start time**
2. Track the end of the previous interval
3. If current interval overlaps:
   - Increase removal count
   - Keep the interval with the **smaller end**
4. Otherwise update the previous end

---

## ⏱️ Expected Complexity
- **Time Complexity:** `O(N log N)` (sorting)
- **Space Complexity:** `O(1)`

---

## ⏱️ Complexity Summary

| Approach | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Greedy | O(N log N) | O(1) | ⭐ Optimal |
