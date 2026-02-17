# Day 15 – Add Binary Strings

## 🧩 Problem Statement
Given two binary strings **s1** and **s2**, return their **sum** as a binary string.

The input strings may be large, so you must **not convert them directly into integers**.  
Perform addition the same way as manual binary addition.

---

## 📥 Input
- A binary string **s1**
- A binary string **s2**

## 📤 Output
- Return the binary sum of the two strings

---

## 🔢 Constraints
- 1 ≤ s1.length, s2.length ≤ 10⁵
- Strings contain only characters `'0'` and `'1'`

---

## 🧪 Example 1
**Input:**

s1 = "11"
s2 = "1"


**Output:**

100


---

## 🧪 Example 2
**Input:**

s1 = "1010"
s2 = "1011"


**Output:**

10101


---

## 💡 Explanation
Binary addition rules:

| A | B | Carry | Sum | New Carry |
|--|--|--|--|--|
| 0 | 0 | 0 | 0 | 0 |
| 0 | 1 | 0 | 1 | 0 |
| 1 | 1 | 0 | 0 | 1 |
| 1 | 1 | 1 | 1 | 1 |

We process digits from **right to left** and maintain a carry just like decimal addition.

---

## 🛠️ Solution Approach
1. Start from the last index of both strings
2. Add corresponding bits and carry
3. Append result bit to answer
4. Update carry
5. Reverse final string
6. Remove leading zeros (if any)

---

## ⏱️ Expected Complexity
- **Time Complexity:** `O(N)`  
- **Space Complexity:** `O(N)` (result string)

---

## 🔗 Problem Link (GeeksforGeeks)
https://www.geeksforgeeks.org/problems/add-binary-strings3805/1
