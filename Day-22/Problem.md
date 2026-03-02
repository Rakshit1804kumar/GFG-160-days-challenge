# Day 22 – Find H-Index

## 🧩 Problem Statement
Given an array **citations[]** where `citations[i]` represents the number of citations a researcher received for their i-th paper, find the **H-Index**.

The **H-Index** is defined as the maximum value **H** such that the researcher has published **at least H papers** that have each been cited **at least H times**.

---

## 📥 Input
- An integer array **citations[]** of size **N**

## 📤 Output
- Return the **H-Index**

---

## 🔢 Constraints
- 1 ≤ N ≤ 10⁵  
- 0 ≤ citations[i] ≤ 10⁶  

---

## 🧪 Example 1
**Input:**

citations = [3, 0, 6, 1, 5]


**Output:**

3


---

## 🧪 Example 2
**Input:**

citations = [1, 3, 1]


**Output:**

1


---

## 💡 Explanation
We need to find the largest number **H** such that:
- At least **H papers have ≥ H citations**

---

## 🛠️ Solution Approaches

---

### ✅ Solution 1: Sorting + Counting
- Sort the array
- Traverse from the end
- Count how many papers satisfy condition

**Time Complexity:** `O(N log N)`  
**Space Complexity:** `O(1)`

✔ Easy to implement  
✔ Passes all test cases  

---

### ⭐ Solution 2: Counting Array (Optimized)
- Create frequency array of size `n+1`
- Count citations (cap values ≥ n into freq[n])
- Traverse from end and accumulate count
- Find maximum H such that count ≥ H

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(N)`

✔ Faster than sorting  
✔ Best for large inputs  

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Sorting Approach | O(N log N) | O(1) | Correct |
| Counting Array | O(N) | O(N) | ⭐ Optimal |
