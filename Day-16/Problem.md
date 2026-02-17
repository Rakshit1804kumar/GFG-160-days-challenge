# Day 16 – Anagram Check

## 🧩 Problem Statement
Given two strings **s1** and **s2**, determine whether they are **anagrams** of each other.

Two strings are called anagrams if they contain the **same characters with the same frequency**, but possibly in a different order.

---

## 📥 Input
- A string **s1**
- A string **s2**

## 📤 Output
- Return **true** if both strings are anagrams  
- Otherwise return **false**

---

## 🔢 Constraints
- 1 ≤ s1.length, s2.length ≤ 10⁵
- Strings contain only lowercase English letters

---

## 🧪 Example 1
**Input:**

s1 = "listen"
s2 = "silent"


**Output:**

true


---

## 🧪 Example 2
**Input:**

s1 = "hello"
s2 = "bello"


**Output:**

false


---

## 💡 Explanation
Two strings are anagrams if:
- They have equal length
- Each character appears the same number of times in both strings

---

## 🛠️ Solution Approaches

---

### ✅ Solution 1: Sorting
- Convert strings to character arrays
- Sort both arrays
- Compare the sorted arrays

**Time Complexity:** `O(N log N)`  
**Space Complexity:** `O(N)`

---

### ✅ Solution 2: Frequency Count (Optimized)
- Create a frequency array of size 26
- Increment for characters in s1
- Decrement for characters in s2
- If all counts become zero → anagram

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(1)`

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Sorting | O(N log N) | O(N) | Correct |
| Frequency Array | O(N) | O(1) | ⭐ Optimal |
 
