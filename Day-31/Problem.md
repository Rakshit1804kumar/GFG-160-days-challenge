# Day 31 – Peak Element

## 🧩 Problem Statement
Given an array **arr[]**, find the index of a **peak element**.

An element is considered a **peak** if it is **greater than or equal to its adjacent elements**.

If the array contains multiple peaks, return the **index of any one of them**.

For the first and last elements, only one adjacent element exists.

---

## 📥 Input
- An integer array **arr[]** of size **N**

## 📤 Output
- Return the **index of a peak element**

---

## 🔢 Constraints
- 1 ≤ N ≤ 10⁵  
- -10⁹ ≤ arr[i] ≤ 10⁹  

---

## 🧪 Example 1
**Input:**

arr = [1, 2, 4, 5, 7, 8, 3]


**Output:**

5


**Explanation:**  
`arr[5] = 8` is greater than its neighbors `7` and `3`.

---

## 🧪 Example 2
**Input:**

arr = [10, 20, 15, 2, 23, 90, 80]


**Output:**

1


**Explanation:**  
`arr[1] = 20` is greater than its neighbors.

---

## 💡 Explanation
A **peak element** is an element that is **not smaller than its neighbors**.

Possible cases:
- First element can be peak
- Last element can be peak
- Any middle element satisfying the condition

---

## 🛠️ Solution Approach

### ✅ Linear Scan
Steps:
1. If array has only one element → return index `0`
2. Check if first element is peak
3. Traverse the array from index `1` to `n-2`
4. Check if current element is greater than both neighbors
5. If no peak found, last element is peak

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(1)`

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Linear Scan | O(N) | O(1) | Correct |
| Binary Search (Idea) | O(log N) | O(1) | ⭐ Optimal |
 
