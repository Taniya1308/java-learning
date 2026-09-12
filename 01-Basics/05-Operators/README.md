# ☕ Java Operators

**Operators** are special symbols used to perform operations on variables and values.

Example:

```java
int a = 10;
int b = 5;

int sum = a + b;
```

Here, `+` is an **operator**.

---

# 1. Types of Operators in Java

Java operators can be divided into:

```text
Operators
│
├── 1. Arithmetic Operators
├── 2. Unary Operators
├── 3. Assignment Operators
├── 4. Relational Operators
├── 5. Logical Operators
├── 6. Bitwise Operators
├── 7. Shift Operators
├── 8. Ternary Operator
└── 9. instanceof Operator
```

---

# 2. Arithmetic Operators ⭐

Arithmetic operators are used for mathematical calculations.

| Operator | Meaning             |
| -------- | ------------------- |
| `+`      | Addition            |
| `-`      | Subtraction         |
| `*`      | Multiplication      |
| `/`      | Division            |
| `%`      | Modulus / Remainder |

Example:

```java
int a = 10;
int b = 3;

System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3
System.out.println(a % b); // 1
```

### ⭐ Integer Division

When both operands are integers, Java performs integer division.

```java
System.out.println(10 / 3);
```

Output:

```text
3
```

The decimal part is discarded.

But:

```java
System.out.println(10.0 / 3);
```

Output will be approximately:

```text
3.3333333333333335
```

### Important

```java
int a = 5;
int b = 2;

double result = a / b;
```

Result:

```text
2.0
```

Not `2.5`.

Because `a / b` is calculated as integer division **before** being assigned to `double`.

Correct:

```java
double result = (double) a / b;
```

---

# 3. Modulus Operator `%` ⭐

The `%` operator returns the remainder.

```java
System.out.println(10 % 3);
```

Output:

```text
1
```

Useful for:

```text
Checking even/odd
Finding digits
Circular calculations
Divisibility
Pattern problems
```

### Even/Odd

```java
int n = 10;

if (n % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

### Last Digit

```java
int n = 1234;

System.out.println(n % 10);
```

Output:

```text
4
```

---

# 4. Unary Operators ⭐

Unary operators work on **one operand**.

Common unary operators:

```text
+
-
++
--
!
~
```

---

## Unary `+`

```java
int a = 10;

System.out.println(+a);
```

Output:

```text
10
```

---

## Unary `-`

```java
int a = 10;

System.out.println(-a);
```

Output:

```text
-10
```

---

# 5. Increment `++` ⭐⭐⭐

The `++` operator increases a value by `1`.

```java
int a = 5;

a++;

System.out.println(a);
```

Output:

```text
6
```

There are two forms:

```text
Pre-increment
Post-increment
```

---

## Pre-Increment

```java
++a;
```

First increment, then use the value.

Example:

```java
int a = 5;

int b = ++a;

System.out.println(a);
System.out.println(b);
```

Output:

```text
6
6
```

---

## Post-Increment

```java
a++;
```

First use the value, then increment.

```java
int a = 5;

int b = a++;

System.out.println(a);
System.out.println(b);
```

Output:

```text
6
5
```

### ⭐ Remember

```text
++a → increment first → use later

a++ → use first → increment later
```

---

# 6. Decrement `--`

The `--` operator decreases a value by `1`.

### Pre-Decrement

```java
int a = 5;

int b = --a;

System.out.println(a);
System.out.println(b);
```

Output:

```text
4
4
```

### Post-Decrement

```java
int a = 5;

int b = a--;

System.out.println(a);
System.out.println(b);
```

Output:

```text
4
5
```

### Remember

```text
--a → decrement first

a-- → use first, decrement later
```

---

# 7. Assignment Operators ⭐

Assignment operators assign values to variables.

Basic assignment:

```java
int a = 10;
```

Here:

```text
= → assignment operator
```

### Compound Assignment Operators

| Operator | Equivalent  |
| -------- | ----------- |
| `+=`     | `a = a + b` |
| `-=`     | `a = a - b` |
| `*=`     | `a = a * b` |
| `/=`     | `a = a / b` |
| `%=`     | `a = a % b` |

Example:

```java
int a = 10;

a += 5;
System.out.println(a); // 15

a -= 3;
System.out.println(a); // 12

a *= 2;
System.out.println(a); // 24

a /= 4;
System.out.println(a); // 6

a %= 4;
System.out.println(a); // 2
```

---

# 8. Relational Operators ⭐⭐⭐

Relational operators compare two values.

The result is always:

```text
true
```

or

```text
false
```

Operators:

| Operator | Meaning                  |
| -------- | ------------------------ |
| `==`     | Equal to                 |
| `!=`     | Not equal to             |
| `>`      | Greater than             |
| `<`      | Less than                |
| `>=`     | Greater than or equal to |
| `<=`     | Less than or equal to    |

Example:

```java
int a = 10;
int b = 20;

System.out.println(a == b); // false
System.out.println(a != b); // true
System.out.println(a > b);  // false
System.out.println(a < b);  // true
System.out.println(a >= b); // false
System.out.println(a <= b); // true
```

### ⭐ Important

Do not confuse:

```java
=
```

with:

```java
==
```

```text
=  → assignment

== → comparison
```

Example:

```java
int a = 10;
```

means assign `10` to `a`.

But:

```java
a == 10
```

means check whether `a` is equal to `10`.

---

# 9. Logical Operators ⭐⭐⭐

Logical operators are mainly used with boolean expressions.

| Operator | Meaning     |   |            |
| -------- | ----------- | - | ---------- |
| `&&`     | Logical AND |   |            |
| `        |             | ` | Logical OR |
| `!`      | Logical NOT |   |            |

---

## AND `&&`

Returns `true` only when **both conditions are true**.

```java
int age = 22;

System.out.println(age >= 18 && age <= 60);
```

Output:

```text
true
```

Truth table:

```text
A     B      A && B

T     T        T
T     F        F
F     T        F
F     F        F
```

### Example

```java
int age = 20;
boolean hasID = true;

if (age >= 18 && hasID) {
    System.out.println("Allowed");
}
```

---

# 10. OR `||`

Returns `true` when **at least one condition is true**.

```java
int marks = 85;

System.out.println(marks > 90 || marks >= 80);
```

Output:

```text
true
```

Truth table:

```text
A     B      A || B

T     T        T
T     F        T
F     T        T
F     F        F
```

---

# 11. NOT `!`

The `!` operator reverses a boolean value.

```java
boolean result = true;

System.out.println(!result);
```

Output:

```text
false
```

Example:

```java
boolean loggedIn = false;

if (!loggedIn) {
    System.out.println("Please login");
}
```

---

# 12. Short-Circuit Operators ⭐⭐⭐

Java's:

```text
&&
||
```

are **short-circuit logical operators**.

### `&&`

If the first condition is `false`, Java does not evaluate the second condition.

```java
false && something
```

The result must already be:

```text
false
```

### `||`

If the first condition is `true`, Java does not evaluate the second condition.

```java
true || something
```

The result must already be:

```text
true
```

Example:

```java
int x = 10;

if (x > 20 && ++x > 10) {
    System.out.println("Yes");
}

System.out.println(x);
```

Output:

```text
10
```

Why?

```text
x > 20 → false
```

Therefore Java does not evaluate:

```java
++x > 10
```

This is called **short-circuit evaluation**.

---

# 13. Bitwise Operators ⭐⭐

Bitwise operators work directly on the bits of integer types.

Operators:

```text
&   AND
|   OR
^   XOR
~   NOT
```

Example:

```java
int a = 5;  // 0101
int b = 3;  // 0011
```

### Bitwise AND `&`

```text
0101
0011
----
0001
```

Therefore:

```java
System.out.println(5 & 3);
```

Output:

```text
1
```

---

## Bitwise OR `|`

```text
0101
0011
----
0111
```

Output:

```text
7
```

---

## Bitwise XOR `^`

XOR returns `1` when the bits are different.

```text
0101
0011
----
0110
```

Output:

```text
6
```

### XOR Rules

```text
0 ^ 0 = 0
0 ^ 1 = 1
1 ^ 0 = 1
1 ^ 1 = 0
```

---

# 14. Bitwise NOT `~`

`~` flips every bit.

```java
System.out.println(~5);
```

Output:

```text
-6
```

This can look surprising because Java uses **two's complement representation** for signed integers.

For interview purposes, remember:

```text
~n = -(n + 1)
```

Therefore:

```text
~5 = -6
```

---

# 15. Shift Operators ⭐⭐

Java provides three shift operators:

```text
<<  Left shift
>>  Signed right shift
>>> Unsigned right shift
```

---

## Left Shift `<<`

Moves bits to the left.

```java
int x = 5;

System.out.println(x << 1);
```

Output:

```text
10
```

For suitable positive integers:

```text
x << 1 ≈ x × 2
x << 2 ≈ x × 4
```

---

## Right Shift `>>`

Moves bits to the right while preserving the sign bit.

```java
int x = 10;

System.out.println(x >> 1);
```

Output:

```text
5
```

For suitable positive integers:

```text
x >> 1 ≈ x / 2
x >> 2 ≈ x / 4
```

---

## Unsigned Right Shift `>>>`

Fills the left side with zeros.

This is particularly important when working with negative numbers.

```java
int x = -8;

System.out.println(x >>> 1);
```

Unlike `>>`, it does not preserve the sign bit.

### ⭐ Interview Difference

```text
>>  → signed right shift

>>> → unsigned right shift
```

---

# 16. Ternary Operator ⭐⭐⭐

The ternary operator is a short form of `if-else`.

Syntax:

```java
condition ? valueIfTrue : valueIfFalse;
```

Example:

```java
int age = 20;

String result = age >= 18 ? "Adult" : "Minor";

System.out.println(result);
```

Output:

```text
Adult
```

Equivalent `if-else`:

```java
String result;

if (age >= 18) {
    result = "Adult";
} else {
    result = "Minor";
}
```

---

# 17. Ternary Operator for Two Numbers

Find the maximum of two numbers:

```java
int a = 10;
int b = 20;

int max = a > b ? a : b;

System.out.println(max);
```

Output:

```text
20
```

---

# 18. Ternary Operator for Three Numbers ⭐⭐⭐

You can nest ternary operators.

```java
int a = 10;
int b = 25;
int c = 15;

int max = (a > b)
        ? (a > c ? a : c)
        : (b > c ? b : c);

System.out.println(max);
```

Output:

```text
25
```

### Another readable approach

```java
int max = a > b ? a : b;
max = max > c ? max : c;

System.out.println(max);
```

For beginners, this second approach is easier to read.

### ⚠️ Interview Point

Ternary operators can become difficult to read when heavily nested.

Do not force ternary into complicated logic just to make code shorter.

Readable code is more important than fewer lines.

---

# 19. `instanceof` Operator ⭐⭐

`instanceof` checks whether an object belongs to a particular class or type.

Example:

```java
String name = "Taniya";

System.out.println(name instanceof String);
```

Output:

```text
true
```

Another example:

```java
Object obj = "Java";

if (obj instanceof String) {
    System.out.println("It is a String");
}
```

Output:

```text
It is a String
```

### Important

`instanceof` is mainly used with **reference types/objects**, not primitive values.

---

# 20. Operator Precedence ⭐⭐⭐

When multiple operators appear in an expression, Java follows operator precedence.

Example:

```java
int result = 10 + 5 * 2;
```

Output:

```text
20
```

Not:

```text
30
```

Because multiplication has higher precedence than addition.

```text
5 * 2 = 10
10 + 10 = 20
```

### Common Precedence Order

For the operators you need most:

```text
()
++
--
!
*
/
%
+
-
<
>
<=
>=
==
!=
&&
||
?:
=
```

A simplified way to remember:

```text
Parentheses
    ↓
Unary
    ↓
Multiplication / Division / Modulus
    ↓
Addition / Subtraction
    ↓
Relational
    ↓
Equality
    ↓
Logical AND
    ↓
Logical OR
    ↓
Ternary
    ↓
Assignment
```

### ⭐ Use Parentheses

Instead of relying on complicated precedence:

```java
int result = (a + b) * c;
```

Parentheses make your intention clear.

---

# 21. Operator Associativity ⭐⭐

Associativity determines the direction in which operators of the same precedence are evaluated.

Most arithmetic operators are evaluated:

```text
Left → Right
```

Example:

```java
int result = 20 / 5 * 2;
```

Evaluation:

```text
20 / 5 = 4
4 * 2 = 8
```

Result:

```text
8
```

Assignment operators generally associate:

```text
Right → Left
```

Example:

```java
int a, b, c;

a = b = c = 10;
```

Conceptually:

```text
c = 10
b = c
a = b
```

---

# 22. Unary + Arithmetic Example ⭐⭐⭐

Predict the output:

```java
int a = 5;

int result = ++a + a++;

System.out.println(a);
System.out.println(result);
```

Step-by-step:

```text
Initial a = 5

++a → a becomes 6, value used = 6

a++ → value used = 6, then a becomes 7

result = 6 + 6 = 12
```

Output:

```text
7
12
```

### ⚠️ Important

Do not write complicated expressions with multiple `++` or `--` operators in production code.

They may be useful for interview questions, but clear code is better.

---

# 23. String + Operator ⭐⭐⭐

The `+` operator can also perform String concatenation.

```java
System.out.println("Hello " + "Java");
```

Output:

```text
Hello Java
```

If one operand is a String, the operation can become String concatenation.

```java
System.out.println("Value: " + 10 + 20);
```

Output:

```text
Value: 1020
```

Because evaluation happens from left to right:

```text
"Value: " + 10
        ↓
"Value: 10"

"Value: 10" + 20
        ↓
"Value: 1020"
```

Use parentheses when you want arithmetic first:

```java
System.out.println("Value: " + (10 + 20));
```

Output:

```text
Value: 30
```

---

# 24. Type Casting with Operators ⭐⭐

Operators can cause type conversions.

### Widening

```java
int a = 10;

double b = a;
```

`int` is automatically converted to `double`.

### Narrowing

```java
double a = 10.5;

int b = (int) a;
```

Output:

```text
10
```

The decimal portion is discarded.

### Important

```java
int a = 10;
int b = 3;

double result = (double) a / b;
```

Output:

```text
3.3333333333333335
```

---

# 25. Common Operator Mistakes ⭐⭐⭐

### Mistake 1: Using `=` instead of `==`

Wrong:

```java
if (a = 10)
```

Correct:

```java
if (a == 10)
```

---

### Mistake 2: Integer Division

```java
int a = 5;
int b = 2;

System.out.println(a / b);
```

Output:

```text
2
```

Not `2.5`.

---

### Mistake 3: Confusing `++a` and `a++`

```text
++a → increment first

a++ → use first
```

---

### Mistake 4: Confusing `&&` and `&`

```text
&& → logical AND + short-circuit

&  → bitwise AND
```

---

### Mistake 5: Confusing `||` and `|`

```text
|| → logical OR + short-circuit

|  → bitwise OR
```

---

### Mistake 6: Ignoring Operator Precedence

```java
int result = 10 + 5 * 2;
```

Result:

```text
20
```

Use:

```java
int result = (10 + 5) * 2;
```

if you want:

```text
30
```

---

# 26. Practice Program

Create:

```text
03-Operators/

├── README.md
└── OperatorPractice.java
```

Practice these in `OperatorPractice.java`:

```text
1. Arithmetic operations
2. Integer division
3. Decimal division
4. Modulus
5. Check even/odd using %
6. Find last digit using %
7. Unary + and -
8. Pre-increment
9. Post-increment
10. Pre-decrement
11. Post-decrement
12. Assignment operators
13. Relational operators
14. Logical AND
15. Logical OR
16. Logical NOT
17. Short-circuit && and ||
18. Bitwise AND
19. Bitwise OR
20. Bitwise XOR
21. Bitwise NOT
22. Left shift
23. Right shift
24. Unsigned right shift
25. Ternary operator
26. Maximum of two numbers using ternary
27. Maximum of three numbers using ternary
28. instanceof
29. Operator precedence
30. String + arithmetic
31. Type casting with operators
```

---

# 27. ⭐ Predict Before Running

### Question 1

```java
int a = 5;

System.out.println(a++);
System.out.println(a);
```

Predict the output.

---

### Question 2

```java
int a = 5;

System.out.println(++a);
System.out.println(a);
```

---

### Question 3

```java
int a = 10;
int b = 3;

System.out.println(a / b);
System.out.println(a % b);
```

---

### Question 4

```java
System.out.println(10 + 20 + "Java");
```

What is the output?

---

### Question 5

```java
System.out.println("Java" + 10 + 20);
```

What is the output?

---

### Question 6

```java
System.out.println("Java" + (10 + 20));
```

---

### Question 7

```java
int a = 10;

if (a > 5 && ++a > 10) {
    System.out.println("Yes");
}

System.out.println(a);
```

Why does `a` become `11`?

---

### Question 8

```java
int a = 10;

if (a < 5 && ++a > 10) {
    System.out.println("Yes");
}

System.out.println(a);
```

Why does `a` remain `10`?

---

### Question 9

```java
System.out.println(5 & 3);
System.out.println(5 | 3);
System.out.println(5 ^ 3);
```

Predict all outputs.

---

### Question 10

```java
System.out.println(10 + 5 * 2);
```

Why is the answer `20` and not `30`?

---

# 🎯 Important Interview Questions

## Basics

1. What is an operator in Java?

2. What are the different types of operators in Java?

3. What is the difference between `=` and `==`?

4. What are arithmetic operators?

5. What is the modulus operator?

6. Where is `%` commonly used?

---

## ⭐ Must Know

7. Difference between `++a` and `a++`?

8. Difference between `--a` and `a--`?

9. What is integer division?

10. Why does `5 / 2` produce `2` instead of `2.5`?

11. How can you get decimal division?

12. What is operator precedence?

13. What is operator associativity?

14. What is short-circuit evaluation?

15. Difference between `&&` and `&`?

16. Difference between `||` and `|`?

17. Difference between `==` and `.equals()`?

18. What is the ternary operator?

19. Can ternary operators be nested?

20. What is the `instanceof` operator?

---

## Bitwise & Shift Operators

21. What is a bitwise operator?

22. Difference between `&` and `&&`?

23. Difference between `|` and `||`?

24. What does XOR `^` do?

25. What is the result of `5 ^ 3`?

26. What does `~` do?

27. Why does `~5` give `-6`?

28. What is the difference between `>>` and `>>>`?

29. What does `<<` do?

30. What is the relationship between left shift and multiplication by powers of 2?

---

## Ternary Operator

31. What is the syntax of the ternary operator?

32. How do you find the maximum of two numbers using ternary?

33. How do you find the maximum of three numbers using ternary?

34. When should you avoid nested ternary operators?

---

## Output-Based Questions ⭐⭐⭐

35. What is the output?

```java
int a = 5;
int b = ++a;

System.out.println(a);
System.out.println(b);
```

36. What is the output?

```java
int a = 5;
int b = a++;

System.out.println(a);
System.out.println(b);
```

37. What is the output?

```java
System.out.println(10 / 3);
```

38. What is the output?

```java
System.out.println(10.0 / 3);
```

39. What is the output?

```java
System.out.println("A" + 10 + 20);
```

40. What is the output?

```java
System.out.println("A" + (10 + 20));
```

41. What is the output?

```java
System.out.println(10 + 20 + "A");
```

42. What is the output?

```java
System.out.println(10 + 5 * 2);
```

---

# 🧠 Operator Cheat Sheet

```text
Arithmetic
+   -   *   /   %

Unary
+   -   ++   --   !   ~

Assignment
=   +=   -=   *=   /=   %=

Relational
==   !=   >   <   >=   <=

Logical
&&   ||   !

Bitwise
&   |   ^   ~

Shift
<<   >>   >>>

Ternary
?:

Type checking
instanceof
```

---

# ⚡ One-Minute Revision

```text
Operators
    ↓
Arithmetic
+  -  *  /  %

Unary
++  --  !  ~  +  -

Assignment
=  +=  -=  *=  /=  %=

Relational
==  !=  >  <  >=  <=

Logical
&&  ||  !

Bitwise
&  |  ^  ~

Shift
<<  >>  >>>

Ternary
condition ? trueValue : falseValue

instanceof
→ checks object/type relationship
```

### ⭐ Remember

```text
=       → assignment
==      → comparison

++a     → increment first
a++     → use first

&&      → logical AND + short-circuit
&       → bitwise AND

||      → logical OR + short-circuit
|       → bitwise OR

5 / 2   → 2
5.0 / 2 → 2.5

"Java" + 10 + 20
→ Java1020

"Java" + (10 + 20)
→ Java30

<<      → left shift
>>      → signed right shift
>>>     → unsigned right shift

?:      → ternary operator
```

---

# 🚀 Before Moving to the Next Topic

You should be able to explain these **without looking at your notes**:

> **Arithmetic operators + `%` + pre/post increment + assignment operators + relational operators + logical operators + short-circuiting + bitwise operators + shift operators + ternary operator + operator precedence.**

You should also be able to solve output questions involving:

```text
++ / --
&& / ||
% 
integer division
String + numbers
operator precedence
ternary operator
```

If you cannot predict these outputs confidently, **do not just move to the next topic**. Operators are used everywhere in Java, especially in conditions, loops, arrays, DSA, and interview output questions.
