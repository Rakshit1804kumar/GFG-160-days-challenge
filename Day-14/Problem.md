# Day 14 – Implement Atoi (String to Integer)

## 🧩 Problem Statement
Implement the function **atoi()** which converts a string to a **32-bit signed integer**.

The algorithm for `myAtoi(string s)` is as follows:

1. Ignore leading whitespace
2. Check for optional sign (`+` or `-`)
3. Read digits until a non-digit character is found
4. Clamp the value within the 32-bit signed integer range:
   - Minimum: −2³¹
   - Maximum:  2³¹ − 1

If no valid conversion can be performed, return **0**.

---

## 📥 Input
- A string **s**

## 📤 Output
- Return the integer representation of the string

---

## 🔢 Constraints
- 0 ≤ s.length ≤ 10⁵
- String may contain alphabets, digits, spaces, `+`, `-`, `.`, etc.

---

## 🧪 Example 1
**Input:**

s = "42"


**Output:**

42


---

## 🧪 Example 2
**Input:**

s = " -42"


**Output:**

-42


---

## 🧪 Example 3
**Input:**

s = "4193 with words"


**Output:**

4193


---

## 🧪 Example 4
**Input:**

s = "words and 987"


**Output:**

0


---

## 🧪 Example 5
**Input:**

s = "-91283472332"


**Output:**

-2147483648


---

## 💡 Explanation
- Ignore leading spaces
- Detect sign
- Convert digits into number
- Stop at first invalid character
- Handle overflow using integer limits

---

## 🛠️ Solution Approach
We simulate integer parsing manually:

1. Skip leading spaces
2. Detect sign
3. Convert digit characters to number
4. Check overflow before storing
5. Return final signed integer

---

## ⏱️ Expected Complexity
- **Time Complexity:** `O(N)`
- **Space Complexity:** `O(1)`

