# Day 25 – Insert Interval

## 🧩 Problem Statement
You are given a list of **non-overlapping intervals** sorted by their start times.  
A new interval **newInterval = [start, end]** is also given.

Insert the new interval into the list such that:
- The final list remains **sorted**
- Any **overlapping intervals are merged**

Return the updated list of intervals.

---

## 📥 Input
- A 2D array **intervals[][]** representing existing intervals
- An array **newInterval[]** representing the interval to insert

## 📤 Output
- Return the list of intervals after inserting and merging

---

## 🔢 Constraints
- 0 ≤ intervals.length ≤ 10⁵  
- 0 ≤ start ≤ end ≤ 10⁹  

---

## 🧪 Example 1
**Input:**

intervals = [[1,3], [6,9]]
newInterval = [2,5]


**Output:**

[[1,5], [6,9]]


**Explanation:**
The new interval `[2,5]` overlaps with `[1,3]`, so they merge into `[1,5]`.

---

## 🧪 Example 2
**Input:**

intervals = [[1,2], [3,5], [6,7], [8,10], [12,16]]
newInterval = [4,8]


**Output:**

[[1,2], [3,10], [12,16]]


**Explanation:**
Intervals `[3,5]`, `[6,7]`, and `[8,10]` overlap with `[4,8]`, so they merge into `[3,10]`.

---

## 💡 Explanation
To insert the interval correctly:
1. Add all intervals that **end before the new interval starts**
2. Merge all **overlapping intervals**
3. Add the merged interval
4. Add remaining intervals

---

## 🛠️ Solution Approach (Greedy)

Steps:
1. Traverse intervals and add all intervals that **do not overlap** with new interval
2. Merge overlapping intervals
3. Add merged interval to result
4. Append remaining intervals

---

## ⏱️ Expected Complexity
- **Time Complexity:** `O(N)`
- **Space Complexity:** `O(N)`

---

## ⏱️ Complexity Summary

| Approach | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Greedy Merge | O(N) | O(N) | ⭐ Optimal |

 
