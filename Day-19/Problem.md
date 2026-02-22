# Day 19 – Minimum Characters to Add for Palindrome

## 🧩 Problem Statement
Given a string **s**, find the **minimum number of characters** that must be added at the **front** of the string to make it a **palindrome**.

---

## 📥 Input
- A string **s**

## 📤 Output
- Return the **minimum number of characters** to be added at the front

---

## 🔢 Constraints
- 1 ≤ s.length ≤ 10⁵
- String contains lowercase English letters

---

## 🧪 Example 1
**Input:**

s = "abc"


**Output:**

2


**Explanation:**
Add "cb" at front → "cbabc"

---

## 🧪 Example 2
**Input:**

s = "aacecaaa"


**Output:**

1


**Explanation:**
Add "a" at front → "aaacecaaa"

---

## 💡 Explanation
We need to find the **longest prefix of the string which is already a palindrome**.  
The remaining suffix must be added in reverse at the front.

---

## 🛠️ Solution Approaches

---

### ⚠️ Solution 1: Naive Prefix Matching
- Reverse the string
- Combine as `s + "*" + reverse(s)`
- Try to find longest prefix match manually

**Time Complexity:** `O(N²)`  
**Space Complexity:** `O(N)`

**Issue:**  
Manual matching may fail or be inefficient → not reliable for large inputs

---

### ✅ Solution 2: KMP (LPS Array – Optimal)
- Reverse the string → `rev`
- Create combined string:

s + "*" + rev

- Compute **LPS (Longest Prefix Suffix) array**
- The last value of LPS gives longest palindromic prefix

**Answer:**

s.length() - lps[last index]


**Time Complexity:** `O(N)`  
**Space Complexity:** `O(N)`

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Naive Matching | O(N²) | O(N) | ⚠️ Not Reliable |
| KMP (LPS) | O(N) | O(N) | ⭐ Optimal |

