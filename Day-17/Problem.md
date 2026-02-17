# Day 17 – First Non-Repeating Character

## 🧩 Problem Statement
Given a string **s** consisting of lowercase English letters, find the **first character that does not repeat** in the string.

If every character repeats, return **'$'**.

---

## 📥 Input
- A string **s**

## 📤 Output
- Return the first non-repeating character
- Return **'$'** if no such character exists

---

## 🔢 Constraints
- 1 ≤ s.length ≤ 10⁵
- String contains only lowercase English letters

---

## 🧪 Example 1
**Input:**

s = "geeksforgeeks"


**Output:**

f


---

## 🧪 Example 2
**Input:**

s = "aabbcc"


**Output:**

$


---

## 💡 Explanation
We must return the **first character whose frequency is exactly 1** while preserving original order.

---

## 🛠️ Solution Approaches

---

### ❌ Solution 1: Brute Force
- For each character, check entire string for duplicates
- If no duplicate found → return it

**Time Complexity:** `O(N²)`  
**Space Complexity:** `O(1)`

---

### ✅ Solution 2: Frequency Array (Optimized)
- Count frequency of each character using array of size 26
- Traverse string again and return first character with frequency 1

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(1)`

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Brute Force | O(N²) | O(1) | Works but Slow |
| Frequency Array | O(N) | O(1) | ⭐ Optimal |

---
