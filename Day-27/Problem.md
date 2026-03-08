# Day 27 – Merge Without Extra Space

## 🧩 Problem Statement
Given two **sorted arrays** `a[]` and `b[]` of sizes **n** and **m**, merge them such that:

- Both arrays remain **sorted**
- The smallest **n elements** are in array `a`
- The remaining **m elements** are in array `b`
- **No extra space** should be used ideally.

---

## 📥 Input
- Two sorted arrays:

a[] of size n
b[] of size m


## 📤 Output
- The arrays should be modified in-place such that they remain sorted after merging.

---

## 🔢 Constraints
- 1 ≤ n, m ≤ 10⁵  
- -10⁹ ≤ a[i], b[i] ≤ 10⁹  

---

## 🧪 Example 1
**Input:**

a = [1, 3, 5, 7]
b = [0, 2, 6, 8, 9]


**Output:**

a = [0, 1, 2, 3]
b = [5, 6, 7, 8, 9]


---

## 🧪 Example 2
**Input:**

a = [10, 12]
b = [5, 18, 20]


**Output:**

a = [5, 10]
b = [12, 18, 20]


---

## 💡 Explanation
The goal is to merge two sorted arrays without using extra space while maintaining the sorted order.

---

## 🛠️ Solution Approaches

---

### ⚠️ Solution 1: Using Extra Array
Steps:
1. Create a temporary array of size `n + m`
2. Copy elements of both arrays
3. Sort the combined array
4. Copy back first `n` elements into `a`
5. Copy remaining `m` elements into `b`

**Time Complexity:** `O((n + m) log(n + m))`  
**Space Complexity:** `O(n + m)`

⚠️ Uses extra space

---

### ⭐ Solution 2: Swap + Sort Approach
Steps:
1. Compare the largest element of `a` with the smallest element of `b`
2. Swap if needed
3. Continue until no more swaps are needed
4. Sort both arrays again

**Time Complexity:** `O((n + m) log n)`  
**Space Complexity:** `O(1)`

✔ Does not use extra array  
✔ Better space optimization

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Extra Array | O((n+m) log(n+m)) | O(n+m) | Correct |
| Swap + Sort | O((n+m) log n) | O(1) | ⭐ Better |
