# Day 18 – KMP Algorithm for Pattern Searching

## 🧩 Problem Statement
Given two strings:
- **txt** (text)
- **pat** (pattern)

Find all occurrences of the pattern in the text and return their **starting indices**.

Use an efficient algorithm better than brute force.

---

## 📥 Input
- A string **txt**
- A string **pat**

## 📤 Output
- Return a list of starting indices where pattern is found in text

---

## 🔢 Constraints
- 1 ≤ txt.length, pat.length ≤ 10⁵
- Strings contain lowercase English letters

---

## 🧪 Example 1
**Input:**

txt = "abcababcab"
pat = "ab"


**Output:**

[0, 3, 5, 8]


---

## 🧪 Example 2
**Input:**

txt = "aaaaa"
pat = "aa"


**Output:**

[0, 1, 2, 3]


---

## 💡 Explanation
We need to efficiently search for a pattern in a text without re-checking characters unnecessarily.

---

## 🛠️ Solution Approaches

---

### ❌ Solution 1: Brute Force
- Check pattern at every index of text
- Compare characters one by one

**Time Complexity:** `O(N * M)`  
**Space Complexity:** `O(1)`

**Issue:**  
Repeated comparisons → inefficient for large inputs

---

### ✅ Solution 2: KMP Algorithm (Optimized)
- Preprocess pattern to create **LPS (Longest Prefix Suffix) array**
- Use LPS to skip unnecessary comparisons
- Avoid re-checking matched characters

---

### 🔑 Key Concepts

#### 1. LPS Array
- LPS[i] = longest prefix which is also suffix for substring `[0...i]`
- Helps decide how much to skip

#### 2. Pattern Matching
- Use two pointers:
  - `i` → text
  - `j` → pattern
- If mismatch occurs:
  - Jump using LPS instead of restarting

---

## ⏱️ Expected Complexity
- **Time Complexity:** `O(N + M)`  
- **Space Complexity:** `O(M)` (LPS array)

---

## ⏱️ Complexity Summary          

| Solution | Time Complexity | Space Complexity | Status |
|--------|-----------------|------------------|--------|
| Brute Force | O(N × M) | O(1) | Slow |
| KMP Algorithm | O(N + M) | O(M) | ⭐ Optimal |

 
