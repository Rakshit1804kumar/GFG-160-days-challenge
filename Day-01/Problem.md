# Day 01 – Second Largest Element

## 🧩 Problem Statement
Given an array of integers, find the **second largest distinct element** in the array.  
If the second largest element does not exist, return **-1**.

## 📥 Input
- An integer **N** representing the size of the array
- An array **Arr[]** of **N** integers

## 📤 Output
- Return the **second largest distinct element**
- Return **-1** if no such element exists

## 🔢 Constraints
- 2 ≤ N ≤ 10⁵
- -10⁶ ≤ Arr[i] ≤ 10⁶

## 🧪 Example 1
**Input:**
N = 5
Arr = [12, 35, 1, 10, 34]

**Output:**
34


## 🧪 Example 2
**Input:**
N = 3
Arr = [10, 10, 10]

**Output:**
-1


## 💡 Explanation
- In Example 1, the largest element is **35**, and the second largest distinct element is **34**.
- In Example 2, all elements are the same, so a second largest element does not exist.

## ⏱️ Expected Complexity
- **Time Complexity:** O(N)
- **Space Complexity:** O(1)
 
