# Day 23 – Count Inversions

## 🧩 Problem Statement
Given an array **arr[]**, count the number of **inversions** in the array.

An **inversion** is a pair of indices **(i, j)** such that:

- `i < j`
- `arr[i] > arr[j]`

In simple terms, an inversion indicates how far the array is from being sorted.

---

## 📥 Input
- An integer array **arr[]** of size **N**

## 📤 Output
- Return the **number of inversions**

---

## 🔢 Constraints
- 1 ≤ N ≤ 10⁵  
- 1 ≤ arr[i] ≤ 10⁹  

---

## 🧪 Example 1
**Input:**

arr = [2, 4, 1, 3, 5]


**Output:**

3


**Explanation:**
Inversions are:

(2,1)
(4,1)
(4,3)


---

## 🧪 Example 2
**Input:**

arr = [5, 4, 3, 2, 1]


**Output:**

10


**Explanation:**
Every pair forms an inversion.

---

## 💡 Explanation
An inversion represents a situation where a larger element appears before a smaller one in the array.

A **sorted array has 0 inversions**.

---

## 🛠️ Solution Approaches

---

### ❌ Solution 1: Brute Force
- Check every pair `(i, j)`
- If `arr[i] > arr[j]`, increment inversion count

**Time Complexity:** `O(N²)`  
**Space Complexity:** `O(1)`

⚠️ Not efficient for large inputs

---

### ⭐ Solution 2: Merge Sort (Optimized)
Use **modified merge sort** to count inversions.

Idea:
- Divide array into halves
- Count inversions in left half
- Count inversions in right half
- Count cross inversions during merge

When merging:

if left[i] > right[j]

then all remaining elements in left subarray form inversions.

**Time Complexity:** `O(N log N)`  
**Space Complexity:** `O(N)`

✔ Efficient for large inputs

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Brute Force | O(N²) | O(1) | ❌ Slow |
| Merge Sort | O(N log N) | O(N) | ⭐ Optimal |
