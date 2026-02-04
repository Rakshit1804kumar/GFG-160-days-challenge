# Day 07 – Stock Buy and Sell (Multiple Transactions Allowed)

## 🧩 Problem Statement
Given an array **prices[]** where `prices[i]` represents the price of a stock on the **i-th day**, find the **maximum profit** that can be achieved.

You are allowed to **complete as many transactions as you like** (buy one stock and sell one stock multiple times).  
However, **you must sell the stock before buying again**.

---

## 📥 Input
- An integer array **prices[]** of size **N**

## 📤 Output
- Return the **maximum profit** that can be achieved

---

## 🔢 Constraints
- 1 ≤ N ≤ 10⁵  
- 0 ≤ prices[i] ≤ 10⁵  

---

## 🧪 Example 1
**Input:**
prices = [1, 5, 3, 8, 12]


**Output:**
13


**Explanation:**
- Buy at 1, sell at 5 → profit = 4  
- Buy at 3, sell at 12 → profit = 9  
- Total profit = 4 + 9 = **13**

---

## 🧪 Example 2
**Input:**
prices = [7, 6, 4, 3, 1]


**Output:**
0


**Explanation:**
- Prices are decreasing, so no profitable transaction is possible.

---

## 🛠️ Solution Approaches

---

### ❌ Solution 1: Recursive Brute Force (TLE)
- Try all possible pairs of buy and sell days.
- Recursively calculate profits for left and right subarrays.
- Take the maximum profit among all possibilities.

**Issue:**  
This approach checks **all combinations**, resulting in **exponential time complexity**, which leads to **Time Limit Exceeded (TLE)** for large inputs.

**Time Complexity:** `O(2^N)` (Exponential)  
**Space Complexity:** `O(N)` (Recursion stack)

---

### ✅ Solution 2: Greedy Approach (Optimized)
- Find every **local minimum** (buy point).
- Find the next **local maximum** (sell point).
- Add the difference to the total profit.
- Repeat until the end of the array.

This approach effectively captures **all profitable upward trends**.

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(1)`

---

### ✅ Solution 3: Simple Greedy (Peak-Valley Difference)
- Traverse the array once.
- Whenever `prices[i+1] > prices[i]`, add the difference to profit.
- This automatically sums all profitable upward movements.

**Key Idea:**  
All consecutive increasing differences together form the total maximum profit.

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(1)`

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Recursive Brute Force | Exponential | O(N) | ❌ TLE |
| Greedy (Min–Max) | O(N) | O(1) | ✅ Optimal |
| Greedy (Difference) | O(N) | O(1) | ✅ Optimal |
