# Day 06 – Majority Element (More Than N/3 Times)

## 🧩 Problem Statement
Given an integer array **Arr[]** of size **N**, find all elements that appear **more than ⌊N/3⌋ times** in the array.

Return the result in **sorted order**.  
If no such element exists, return an **empty list**.

---

## 📥 Input
- An integer **N** representing the size of the array  
- An integer array **Arr[]** of **N** elements  

## 📤 Output
- A list of all elements that appear **more than N/3 times**, sorted in ascending order

---

## 🔢 Constraints
- 1 ≤ N ≤ 10⁵  
- -10⁶ ≤ Arr[i] ≤ 10⁶  

---

## 🧪 Example 1
**Input:**
N = 7
Arr = [3, 2, 3, 2, 2, 1, 2]


**Output:**
[2]


---

## 🧪 Example 2
**Input:**
N = 5
Arr = [1, 2, 3, 4, 5]


**Output:**
[]


---

## 💡 Explanation
- In Example 1, the element **2** appears **4 times**, which is more than ⌊7/3⌋ = 2.
- In Example 2, no element appears more than ⌊5/3⌋ = 1 times.

---

## 🛠️ Solution Approaches

### ✅ Solution 1: Brute Force Approach
- For each element, count its frequency by scanning the array.
- If frequency is greater than **N/3**, add it to the result list.
- Avoid duplicates and sort the result.

**Time Complexity:** `O(N²)`  
**Space Complexity:** `O(1)` (excluding output list)

---

### ✅ Solution 2: HashMap (Optimized)
- Use a **HashMap** to store the frequency of each element.
- Traverse the map to find elements appearing more than **N/3** times.
- Sort the result before returning.

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(N)`

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity |
|--------|-----------------|------------------|
| Brute Force | O(N²) | O(1) |
| HashMap | O(N) | O(N) |
