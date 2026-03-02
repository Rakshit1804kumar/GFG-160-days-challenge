
# Day 21 – Sort 0s, 1s and 2s

## 🧩 Problem Statement
Given an array **arr[]** consisting only of **0s, 1s, and 2s**, sort the array in **ascending order**.

---

## 📥 Input
- An integer array **arr[]** of size **N**

## 📤 Output
- The sorted array (in-place)

---

## 🔢 Constraints
- 1 ≤ N ≤ 10⁵  
- arr[i] ∈ {0, 1, 2}

---

## 🧪 Example 1
**Input:**

arr = [0, 2, 1, 2, 0]


**Output:**

[0, 0, 1, 2, 2]


---

## 🧪 Example 2
**Input:**

arr = [2, 2, 0, 1, 1, 0]


**Output:**

[0, 0, 1, 1, 2, 2]


---

## 💡 Explanation
We need to rearrange the array so that:
- All **0s come first**
- Then all **1s**
- Then all **2s**

---

## 🛠️ Solution Approaches

---

### ✅ Solution 1: Built-in Sort
- Use `Arrays.sort(arr)`

**Time Complexity:** `O(N log N)`  
**Space Complexity:** `O(1)`

✔ Passes all test cases  
⚠️ Not optimal for this problem

---

### ✅ Solution 2: Counting Approach
- Count number of 0s, 1s, and 2s
- Overwrite array using counts

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(1)`

✔ Passes all test cases  
✔ Efficient solution

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Built-in Sort | O(N log N) | O(1) | Correct |
| Counting Approach | O(N) | O(1) | ⭐ Optimal |
