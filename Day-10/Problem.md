# Day 10 – Maximum Subarray Sum (Kadane’s Algorithm)

## 🧩 Problem Statement
Given an integer array **arr[]**, find the **contiguous subarray** (containing at least one number) which has the **largest sum** and return that sum.

---

## 📥 Input
- An integer array **arr[]** of size **N**

## 📤 Output
- Return the **maximum possible subarray sum**

---

## 🔢 Constraints
- 1 ≤ N ≤ 10⁵  
- -10⁴ ≤ arr[i] ≤ 10⁴  

---

## 🧪 Example 1
**Input:**
arr = [2, 3, -8, 7, -1, 2, 3]


**Output:**
11


**Explanation:**
Subarray `[7, -1, 2, 3]` gives the maximum sum = 11

---

## 🧪 Example 2
**Input:**
arr = [-2, -4]


**Output:**
-2


**Explanation:**
When all numbers are negative, the answer is the maximum element.

---

## 🛠️ Solution Approaches

---

### ❌ Solution 1: Brute Force (TLE)
- Generate all possible subarrays
- Calculate sum for each subarray
- Keep track of maximum sum

**Time Complexity:** `O(N²)`  
**Space Complexity:** `O(1)`

**Issue:**  
Fails for large inputs due to nested loops → **Time Limit Exceeded**

---

### ✅ Solution 2: Kadane’s Algorithm (Optimized)
- Traverse array once
- Maintain current subarray sum
- Reset sum when it becomes smaller than current element
- Track maximum sum globally

**Key Idea:**  
At each index, decide whether to:
- extend the previous subarray
- or start a new subarray

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(1)`

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Brute Force | O(N²) | O(1) | ❌ TLE |
| Kadane’s Algorithm | O(N) | O(1) | ✅ Optimal |
