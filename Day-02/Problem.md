# Day 02 – Move All Zeroes to End

## 🧩 Problem Statement
Given an array **Arr[]** of size **N**, move all the **zeroes** present in the array to the **end** while maintaining the **relative order of non-zero elements**.

The operation should be performed **in-place**.

## 📥 Input
- An integer **N** denoting the size of the array
- An array **Arr[]** of **N** integers

## 📤 Output
- The modified array with all zeroes moved to the end

## 🔢 Constraints
- 1 ≤ N ≤ 10⁵
- 0 ≤ Arr[i] ≤ 10⁵

## 🧪 Example 1
**Input:**
N = 5
Arr = [0, 1, 0, 3, 12]


**Output:**
[1, 3, 12, 0, 0]


## 🧪 Example 2
**Input:**
N = 4
Arr = [0, 0, 0, 1]


**Output:**
[1, 0, 0, 0]


## 💡 Explanation
- All non-zero elements are shifted to the left in the same order.
- All zeroes are moved to the end of the array.

## ⏱️ Expected Complexity
- **Time Complexity:** O(N)
- **Space Complexity:** O(1)

## 🔗 Problem Link (GeeksforGeeks)
https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1
