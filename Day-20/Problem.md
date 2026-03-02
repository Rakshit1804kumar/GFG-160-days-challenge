# Day 20 – Strings Rotations of Each Other

## 🧩 Problem Statement
Given two strings **s1** and **s2**, check whether **s2 is a rotation of s1**.

Two strings are rotations of each other if they contain the same characters in the same order, but starting from a different position.

---

## 📥 Input
- A string **s1**
- A string **s2**

## 📤 Output
- Return **true** if s2 is a rotation of s1  
- Otherwise return **false**

---

## 🔢 Constraints
- 1 ≤ s1.length, s2.length ≤ 10⁵
- Strings contain lowercase English letters

---

## 🧪 Example 1
**Input:**

s1 = "abcd"
s2 = "cdab"


**Output:**

true


**Explanation:**
"cdab" is a rotation of "abcd"

---

## 🧪 Example 2
**Input:**

s1 = "aab"
s2 = "aba"


**Output:**

true


---

## 🧪 Example 3
**Input:**

s1 = "abc"
s2 = "acb"


**Output:**

false


---

## 💡 Explanation
If we concatenate the string with itself:

s1 + s1

All possible rotations of **s1** will be present as substrings.

So, we just need to check if **s2 is a substring of (s1 + s1)**.

---

## 🛠️ Solution Approaches

---

### ❌ Solution 1: Concatenation + Contains (TLE)
- Check if lengths are equal
- Create new string: `s1 + s1`
- Check if it contains `s2`

**Time Complexity:** `O(N²)` (in worst case)  
**Space Complexity:** `O(N)`

**Issue:**  
String `.contains()` may internally take `O(N²)` time → **TLE for large inputs**

---

### ✅ Solution 2: KMP Pattern Searching (Optimized)
- Create `text = s1 + s1`
- Search `s2` in text using **KMP algorithm**
- Use LPS array to skip unnecessary comparisons

**Time Complexity:** `O(N)`  
**Space Complexity:** `O(N)`

---

## ⏱️ Complexity Summary

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Concatenation + Contains | O(N²) | O(N) | ❌ TLE |
| KMP Algorithm | O(N) | O(N) | ⭐ Optimal |
