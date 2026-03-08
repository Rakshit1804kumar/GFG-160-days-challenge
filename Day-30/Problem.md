# Day 30 – Search in Rotated Sorted Array

## 🧩 Problem Statement
An array is originally **sorted in increasing order**, but then it is **rotated at some pivot**.

Given the rotated sorted array `arr[]` and an integer `key`, return the **index of the key** if it exists in the array. Otherwise, return **-1**.

---

## 📥 Input
- An integer array `arr[]`
- An integer `key`

## 📤 Output
- Return the **index of key** if present  
- Otherwise return **-1**

---

## 🔢 Constraints
- 1 ≤ arr.length ≤ 10⁵  
- -10⁹ ≤ arr[i] ≤ 10⁹  

---

## 🧪 Example 1
**Input:**

arr = [5, 6, 7, 8, 9, 10, 1, 2, 3]
key = 3


**Output:**

8


**Explanation:**  
The element `3` is present at index `8`.

---

## 🧪 Example 2
**Input:**

arr = [3, 5, 1, 2]
key = 6


**Output:**

-1


**Explanation:**  
The element `6` does not exist in the array.

---

## 💡 Explanation
Even though the array is rotated, we still need to locate the **target element**.

---

## 🛠️ Solution Approaches

---

### ✅ Solution 1: Linear Search
Steps:
1. Traverse the array from start to end.
2. If the element equals the key, return its index.
3. If not found, return -1.

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(1)`

✔ Simple implementation  
⚠️ Not optimal for large arrays

---

### ⭐ Optimized Idea (Binary Search)
Because the array was originally sorted, we can apply **modified binary search**:

- One half of the array is always sorted.
- Determine which half is sorted.
- Check if the key lies in that half.

**Time Complexity:** `O(log N)`  
**Space Complexity:** `O(1)`

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Linear Search | O(N) | O(1) | Correct |
| Modified Binary Search | O(log N) | O(1) | ⭐ Optimal |

