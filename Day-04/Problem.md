# Day 04 – Rotate Array

## 🧩 Problem Statement
Given an array **Arr[]** of size **N**, rotate the array by **D elements** in a **clockwise direction**.

## 📥 Input
- An integer **N** representing the size of the array  
- An integer **D** representing the number of rotations  
- An array **Arr[]** of **N** integers  

## 📤 Output
- The array after rotating it by **D elements**

## 🔢 Constraints
- 1 ≤ N ≤ 10⁵  
- 0 ≤ D ≤ 10⁵  
- -10⁶ ≤ Arr[i] ≤ 10⁶  

## 🧪 Example 1
**Input:**
N = 5
D = 2
Arr = [1, 2, 3, 4, 5]


**Output:**
[4, 5, 1, 2, 3]


## 🧪 Example 2
**Input:**
N = 4
D = 1
Arr = [10, 20, 30, 40]


**Output:**
[40, 10, 20, 30]


## 💡 Explanation
- Rotating the array by **D = 2** moves the last two elements to the front.
- The order of remaining elements is preserved.

## 🛠️ Solution Approaches

### ✅ Solution 1: Using Temporary Array
- Store the first **D** elements in a temporary array.
- Shift the remaining elements to the left.
- Copy the stored elements back to the end.

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(D)` *(Worst case: O(N))*

---

### ✅ Solution 2: Reversal Algorithm (Optimized)
- Reverse the first **D** elements.
- Reverse the remaining **N − D** elements.
- Reverse the entire array.

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(1)`

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity |
|--------|-----------------|------------------|
| Solution 1 | O(N) | O(D) (Worst case O(N)) |
| Solution 2 | O(N) | O(1) |

---
