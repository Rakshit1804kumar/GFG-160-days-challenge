# Day 12 – Maximum Circular Subarray Sum

## 🧩 Problem Statement
Given a circular integer array **arr[]**, find the **maximum possible sum of a non-empty subarray**.

The array is circular, meaning the last element is connected to the first element.

---

## 📥 Input
- An integer array **arr[]** of size **N**

## 📤 Output
- Return the **maximum circular subarray sum**

---

## 🔢 Constraints
- 1 ≤ N ≤ 10⁵  
- -10⁴ ≤ arr[i] ≤ 10⁴  

---

## 🧪 Example 1
**Input:**

arr = [8, -8, 9, -9, 10, -11, 12]


**Output:**

22


**Explanation:**
Circular subarray `[12, 8, -8, 9, -9, 10]` gives sum = 22

---

## 🧪 Example 2
**Input:**

arr = [-3, -2, -1]


**Output:**

-1


**Explanation:**
All elements are negative → answer is the maximum element

---

## 🛠️ Solution Approaches

---

### ❌ Solution 1: Brute Force (TLE)
- Try every starting index
- Generate subarray using circular traversal `(i + j) % n`
- Track maximum sum

**Time Complexity:** `O(N²)`  
**Space Complexity:** `O(1)`

**Issue:**  
Nested loops cause **Time Limit Exceeded** for large inputs

---

### ✅ Solution 2: Optimized (Kadane + Circular Logic)
We calculate two values:

1. **Normal Maximum Subarray Sum** (Kadane)
2. **Circular Maximum Subarray Sum**

Circular Sum Formula:

Circular Max = Total Sum − Minimum Subarray Sum


Final Answer:

max(normal max subarray sum, circular max subarray sum)


Special Case:
If all elements are negative → return normal maximum

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(1)`

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Brute Force | O(N²) | O(1) | ❌ TLE |
| Optimized Approach | O(N) | O(1) | ✅ Optimal |

