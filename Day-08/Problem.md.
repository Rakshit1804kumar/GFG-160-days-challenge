# Day 08 – Stock Buy and Sell (Max One Transaction Allowed)

## 🧩 Problem Statement
Given an array **prices[]** where `prices[i]` represents the price of a stock on the **i-th day**, find the **maximum profit** that can be achieved using **only one transaction**.

You may **buy once and sell once only**.  
If no profit can be made, return **0**.

---

## 📥 Input
- An integer array **prices[]** of size **N**

## 📤 Output
- Return the **maximum possible profit**

---

## 🔢 Constraints
- 1 ≤ N ≤ 10⁵  
- 0 ≤ prices[i] ≤ 10⁵  

---

## 🧪 Example 1
**Input:**
prices = [7, 1, 5, 3, 6, 4]


**Output:**
5


**Explanation:**
- Buy at price = 1 (day 2)
- Sell at price = 6 (day 5)
- Profit = 6 − 1 = **5**

---

## 🧪 Example 2
**Input:**
prices = [7, 6, 4, 3, 1]


**Output:**
0


**Explanation:**
- Prices continuously decrease → No profitable transaction possible

---

## 🛠️ Solution Approaches

---

### ❌ Solution 1: Brute Force (TLE)
- Check profit for every pair of buy and sell days.
- Keep track of maximum difference.

**Time Complexity:** `O(N²)`  
**Space Complexity:** `O(1)`

**Issue:**  
For large inputs (N up to 10⁵), this approach exceeds time limits → **TLE**

---

### ✅ Solution 2: Optimized (Single Pass / Greedy)
- Keep track of the **minimum stock price so far**
- For each day, calculate possible profit
- Update maximum profit

**Idea:**  
Always sell at current day and buy at the cheapest day before it.

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(1)`

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Brute Force | O(N²) | O(1) | ❌ TLE |
| Optimized Greedy | O(N) | O(1) | ✅ Optimal |

 
