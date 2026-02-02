# Day 05 – Next Permutation

## 🧩 Problem Statement
Given an array **Arr[]** of integers representing a permutation, rearrange the array into the **next lexicographically greater permutation**.

If no such permutation exists (i.e., the array is in descending order), rearrange it as the **lowest possible order** (sorted in ascending order).

The replacement must be done **in-place** with **constant extra memory**.

## 📥 Input
- An integer **N** representing the size of the array  
- An array **Arr[]** of **N** integers  

## 📤 Output
- The next permutation of the given array

## 🔢 Constraints
- 1 ≤ N ≤ 10⁵  
- 1 ≤ Arr[i] ≤ 10⁹  

## 🧪 Example 1
**Input:**
N = 3
Arr = [1, 2, 3]


**Output:**
[1, 3, 2]


## 🧪 Example 2
**Input:**
N = 3
Arr = [3, 2, 1]


**Output:**
[1, 2, 3]


## 🧪 Example 3
**Input:**
N = 3
Arr = [1, 1, 5]


**Output:**
[1, 5, 1]


## 💡 Explanation
- Find the first index from the right where **Arr[i] < Arr[i + 1]**.
- Swap it with the smallest element greater than it on the right side.
- Reverse the subarray to the right of index **i**.
- If no such index exists, reverse the entire array.

---

## 🛠️ Solution Approach (Optimized)

### Steps:
1. Traverse from right to find the first decreasing element.
2. Find the element just larger than it on the right.
3. Swap both elements.
4. Reverse the remaining array to get the next permutation.

---

## ⏱️ Expected Complexity
- **Time Complexity:** `O(N)`
- **Space Complexity:** `O(1)`

 
