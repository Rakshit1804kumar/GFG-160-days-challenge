# Day 13 – Smallest Positive Missing Number

## 🧩 Problem Statement
Given an unsorted integer array **arr[]**, find the **smallest positive missing number**.

The solution should run in **linear time** and use **constant extra space** if possible.

---

## 📥 Input
- An integer array **arr[]** of size **N**

## 📤 Output
- Return the **smallest positive missing number**

---

## 🔢 Constraints
- 1 ≤ N ≤ 10⁵  
- -10⁵ ≤ arr[i] ≤ 10⁵  

---

## 🧪 Example 1
**Input:**

arr = [1, 2, 3, 4, 5]


**Output:**

6


---

## 🧪 Example 2
**Input:**

arr = [0, -10, 1, 3, -20]


**Output:**

2


---

## 💡 Explanation
We need to find the smallest positive integer starting from **1** that is **not present** in the array.

---

## 🛠️ Solution Approaches

---

### ✅ Solution 1: Sorting Based Approach
- Sort the array
- Start checking from `1`
- Increment result when the number is found
- Stop when a number is missing

**Time Complexity:** `O(N log N)`  
**Space Complexity:** `O(1)`  

✔ Passes all test cases  
⚠️ Not optimal for very large inputs

---

### ✅ Solution 2: Cyclic Sort (Optimal)
- Place each number at its correct index (`value − 1`)
- Ignore negative numbers and numbers greater than `N`
- After rearrangement, scan the array
- The first index where `arr[i] ≠ i+1` gives the answer

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(1)`

✔ Passes all test cases  
✔ Optimal solution

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Sorting Approach | O(N log N) | O(1) | ✅ Correct |
| Cyclic Sort | O(N) | O(1) | ⭐ Optimal |
