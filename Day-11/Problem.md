# Day 11 – Maximum Product Subarray

## 🧩 Problem Statement
Given an integer array **arr[]**, find the **contiguous subarray** within the array that has the **largest product**, and return that product.

---

## 📥 Input
- An integer array **arr[]** of size **N**

## 📤 Output
- Return the **maximum product of a contiguous subarray**

---

## 🔢 Constraints
- 1 ≤ N ≤ 10⁵  
- -10⁴ ≤ arr[i] ≤ 10⁴  

---

## 🧪 Example 1
**Input:**
arr = [2, 3, -2, 4]


**Output:**
6


**Explanation:**
Subarray `[2, 3]` has maximum product = 6

---

## 🧪 Example 2
**Input:**
arr = [-2, 0, -1]


**Output:**
0


**Explanation:**
Best subarray is `[0]`

---

## 💡 Important Observation
- Negative numbers can turn small product into large product
- Two negatives multiplied become positive
- Therefore, we must track both **maximum product** and **minimum product** at each step

---

## 🛠️ Solution Approaches

---


### ❌ Solution 1: Brute Force (TLE)
- Generate all possible subarrays
- Compute product of each subarray
- Track maximum product

**Time Complexity:** `O(N²)`  
**Space Complexity:** `O(1)`

**Issue:**  
Nested loops → too slow for large inputs → **Time Limit Exceeded**

---

### ✅ Solution 2: Prefix–Suffix Traversal (Optimized)
- Traverse array from left → maintain prefix product
- Traverse array from right → maintain suffix product
- Reset product to 1 whenever it becomes 0
- Maximum product will be the maximum among prefix and suffix products

**Key Idea:**  
Negative numbers flip sign of product, so scanning from both directions ensures we don't miss the best subarray.

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(1)`

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Brute Force | O(N²) | O(1) | ❌ TLE |
| Prefix–Suffix | O(N) | O(1) | ✅ Optimal |

 
