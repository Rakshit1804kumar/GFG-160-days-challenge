# Day 29 – Sorted and Rotated Minimum

## 🧩 Problem Statement
An array is originally **sorted in increasing order** but then **rotated** at some pivot.

Given such an array `arr[]`, find the **minimum element** in the array.

---

## 📥 Input
- An integer array `arr[]` of size **N**

## 📤 Output
- Return the **minimum element** in the array

---

## 🔢 Constraints
- 1 ≤ N ≤ 10⁵  
- -10⁹ ≤ arr[i] ≤ 10⁹  

---

## 🧪 Example 1
**Input:**

arr = [5, 6, 1, 2, 3, 4]


**Output:**

1


**Explanation:**  
The array was originally `[1,2,3,4,5,6]` and rotated.

---

## 🧪 Example 2
**Input:**

arr = [3, 4, 5, 1, 2]


**Output:**

1


---

## 🧪 Example 3
**Input:**

arr = [1, 2, 3, 4]


**Output:**

1


**Explanation:**  
Array is already sorted and not rotated.

---

## 💡 Explanation
Even though the array is rotated, the **minimum element is the pivot point** where rotation occurred.

---

## 🛠️ Solution Approaches

---

### ⚠️ Solution 1: Sorting
Steps:
1. Sort the array.
2. Return the first element.

**Time Complexity:** `O(N log N)`  
**Space Complexity:** `O(1)`

✔ Simple  
⚠️ Not efficient because sorting is unnecessary.

---

### ✅ Solution 2: Linear Traversal
Steps:
1. Traverse the array.
2. Track the smallest element.

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(1)`

✔ Better than sorting  
✔ Passes all test cases

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Sorting | O(N log N) | O(1) | Works |
| Linear Scan | O(N) | O(1) | ⭐ Better |

