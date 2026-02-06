# Day 09 – Minimize the Maximum Difference Between Heights

## 🧩 Problem Statement
Given an array **arr[]** representing the heights of towers and an integer **K**,  
you must either **increase or decrease** the height of every tower by exactly **K** (only once).

After modifying the heights, minimize the **difference between the maximum and minimum heights**.

Note:
- The height of a tower cannot become negative.

---

## 📥 Input
- An integer **N** representing number of towers
- An integer **K**
- An integer array **arr[]** representing heights

## 📤 Output
- Return the **minimum possible difference** between the tallest and shortest tower

---

## 🔢 Constraints
- 1 ≤ N ≤ 10⁵  
- 1 ≤ K ≤ 10⁵  
- 1 ≤ arr[i] ≤ 10⁵  

---

## 🧪 Example 1
**Input:**
N = 4
K = 2
arr = [1, 5, 8, 10]


**Output:**
5


**Explanation:**
Modified array → [3, 3, 6, 8]  
Difference = 8 − 3 = 5

---

## 🧪 Example 2
**Input:**
N = 5
K = 3
arr = [3, 9, 12, 16, 20]


**Output:**
11


---

## 💡 Explanation
To minimize the difference:
- Increase smaller elements by K
- Decrease larger elements by K
- Choose a partition where left side increases and right side decreases
- Track minimum and maximum values carefully

---

## 🛠️ Solution Approach (Greedy + Sorting)

### Steps:
1. Sort the array
2. Initial difference = max − min
3. Assume smallest increases and largest decreases
4. Traverse and update min & max for each partition
5. Track minimum possible difference

---

## ⏱️ Expected Complexity
- **Time Complexity:** `O(N log N)` (sorting)
- **Space Complexity:** `O(1)`
 
