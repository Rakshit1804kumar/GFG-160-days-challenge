# Day 32 – K-th Element of Two Sorted Arrays

## 🧩 Problem Statement
Given two **sorted arrays** `a[]` and `b[]` and an integer `k`, find the **k-th smallest element** in the combined sorted order of both arrays.

The arrays remain separate; we conceptually merge them to determine the k-th element.

---

## 📥 Input
- A sorted array `a[]` of size `n`
- A sorted array `b[]` of size `m`
- An integer `k`

## 📤 Output
- Return the **k-th smallest element** from the merged array.

---

## 🔢 Constraints
- 1 ≤ n, m ≤ 10⁵  
- 1 ≤ k ≤ n + m  
- -10⁹ ≤ a[i], b[i] ≤ 10⁹  

---

## 🧪 Example 1
**Input:**

a = [2, 3, 6, 7, 9]
b = [1, 4, 8, 10]
k = 5


**Output:**

6


**Explanation:**  
Merged array → `[1, 2, 3, 4, 6, 7, 8, 9, 10]`  
The **5th element** is `6`.

---

## 🧪 Example 2
**Input:**

a = [100, 112, 256, 349, 770]
b = [72, 86, 113, 119, 265, 445, 892]
k = 7


**Output:**

256


---

## 💡 Explanation
The task is similar to merging two sorted arrays, but instead of returning the full merged array, we only need the **k-th smallest element**.

---

## 🛠️ Solution Approaches

### ⚠️ Solution 1: Merge + Sort
Steps:
1. Create a temporary array of size `n + m`
2. Copy elements of both arrays
3. Sort the array
4. Return `temp[k-1]`

**Time Complexity:** `O((n + m) log(n + m))`  
**Space Complexity:** `O(n + m)`

✔ Simple to implement  
⚠️ Uses extra space

---

### ⭐ Optimized Idea (Binary Search Partition)
Instead of merging arrays, use **binary search partition**:

- Partition both arrays so that

left elements = k

- Ensure:

max(leftA, leftB) ≤ min(rightA, rightB)


**Time Complexity:** `O(log(min(n, m)))`  
**Space Complexity:** `O(1)`

✔ Most optimal solution

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Merge + Sort | O((n+m) log(n+m)) | O(n+m) | Correct |
| Binary Search | O(log(min(n,m))) | O(1) | ⭐ Optimal |

