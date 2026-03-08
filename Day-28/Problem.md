# Day 28 – Number of Occurrences

## 🧩 Problem Statement
Given a **sorted array** `arr[]` and a number `target`, find the **number of occurrences** of the target element in the array.

If the target element does not appear in the array, return **0**.

---

## 📥 Input
- A sorted integer array `arr[]`
- An integer `target`

## 📤 Output
- Return the **count of occurrences** of `target` in the array.

---

## 🔢 Constraints
- 1 ≤ arr.length ≤ 10⁵  
- -10⁹ ≤ arr[i] ≤ 10⁹  
- Array is **sorted in non-decreasing order**

---

## 🧪 Example 1
**Input:**

arr = [1, 1, 2, 2, 2, 2, 3]
target = 2


**Output:**

4


**Explanation:**
The number `2` appears **4 times** in the array.

---

## 🧪 Example 2
**Input:**

arr = [1, 1, 2, 2, 2, 2, 3]
target = 4


**Output:**

0


**Explanation:**
The number `4` does not exist in the array.

---

## 💡 Explanation
We need to count how many times the **target element appears** in the array.

---

## 🛠️ Solution Approach

### ✅ Solution 1: Linear Traversal
Steps:
1. Traverse the array from start to end.
2. Increment count whenever `arr[i] == target`.

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(1)`

✔ Simple and easy implementation  
⚠️ Not optimal for sorted arrays

---

### ⭐ Optimized Idea (Binary Search)
Since the array is **sorted**, we can use binary search to find:
- **First occurrence**
- **Last occurrence**

Then compute:

count = lastIndex - firstIndex + 1


**Time Complexity:** `O(log N)`  
**Space Complexity:** `O(1)`

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Linear Traversal | O(N) | O(1) | Correct |
| Binary Search | O(log N) | O(1) | ⭐ Optimal |

