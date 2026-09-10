# ☕ Java Data Types

A **data type** defines what kind of value a variable can store and determines the operations that can be performed on it.

---

## 1. Types of Data Types

```text
Data Types
│
├── Primitive
│   ├── byte
│   ├── short
│   ├── int
│   ├── long
│   ├── float
│   ├── double
│   ├── char
│   └── boolean
│
└── Reference
    ├── String
    ├── Arrays
    ├── Classes
    └── Interfaces
```

---

## 2. Primitive Data Types

Java has **8 primitive data types**.

| Type      |           Size | Example             | Use                   |
| --------- | -------------: | ------------------- | --------------------- |
| `byte`    |         1 byte | `byte x = 100;`     | Small integers        |
| `short`   |        2 bytes | `short x = 1000;`   | Small/medium integers |
| `int`     |        4 bytes | `int x = 100000;`   | Most whole numbers    |
| `long`    |        8 bytes | `long x = 100000L;` | Large integers        |
| `float`   |        4 bytes | `float x = 10.5F;`  | Decimal values        |
| `double`  |        8 bytes | `double x = 10.5;`  | Precise decimals      |
| `char`    |        2 bytes | `char c = 'A';`     | Single character      |
| `boolean` | JVM-dependent* | `boolean b = true;` | `true` / `false`      |

> `char` uses 16-bit Unicode values.

---

## 3. Integer Ranges

```text
byte  → -128 to 127
short → -32,768 to 32,767
int   → -2³¹ to 2³¹ - 1
long  → -2⁶³ to 2⁶³ - 1
```

### Common choice

```text
Whole number → int
Large whole number → long
```

---

## 4. Floating-Point Types

```java
float f = 10.5F;
double d = 10.5;
```

By default, a decimal literal is `double`.

```java
float x = 10.5F;    // F required
double y = 10.5;    // default double
```

Use:

```text
F → float
L → long
```

---

## 5. char

`char` stores a **single 16-bit Unicode character**.

```java
char grade = 'A';
char symbol = '#';
```

Single quotes → `char`

```java
'A'
```

Double quotes → `String`

```java
"A"
```

---

## 6. boolean

Stores only:

```java
boolean isJavaEasy = true;
boolean isFinished = false;
```

Values are:

```text
true
false
```

Java does **not** treat `0` and `1` as boolean values.

---

## 7. Primitive vs Reference Types

### Primitive

Stores a value directly.

```java
int age = 21;
double cgpa = 7.9;
```

### Reference

Stores a reference to an object.

```java
String name = "Taniya";
```

Common reference types:

```text
String
Arrays
Classes
Interfaces
Objects
```

> `String` is **not a primitive data type**.

---

## 8. Default Values

Instance and static variables receive default values:

| Type                           | Default    |
| ------------------------------ | ---------- |
| `byte`, `short`, `int`, `long` | `0`        |
| `float`                        | `0.0f`     |
| `double`                       | `0.0d`     |
| `char`                         | `'\u0000'` |
| `boolean`                      | `false`    |
| Reference types                | `null`     |

### Important

**Local variables do NOT receive default values.**

```java
public static void main(String[] args) {
    int age;
    // System.out.println(age); // Compile-time error
}
```

You must initialize them first:

```java
int age = 21;
```

---

## 9. Type Compatibility

Smaller compatible types can generally be converted to larger types automatically.

```java
int x = 10;
double y = x;

System.out.println(y);  // 10.0
```

This is called **widening conversion**.

```text
byte → short → int → long → float → double
```

> `char` can also participate in numeric conversions.

---

## 10. Overflow

Primitive integer types have limited ranges.

```java
byte x = 127;
x++;

System.out.println(x);
```

Output:

```text
-128
```

The value wraps around because `byte` cannot store `128`.

---

## 11. Literals

Examples:

```java
int decimal = 100;
int binary = 0b1010;
int hexadecimal = 0xFF;
int octal = 077;

long bigNumber = 100000L;
float price = 10.5F;
double value = 10.5;
char letter = 'A';
boolean flag = true;
```

---

## 12. `var`

`var` allows **local variable type inference**.

```java
var age = 21;
var name = "Taniya";
```

Java determines:

```text
age  → int
name → String
```

Important:

* `var` is **not a data type**.
* Can be used for **local variables**.
* The variable's type is still fixed after inference.

```java
var age = 21;
// age = "Taniya";  // Error
```

---

## 13. Example Program

```java
public class DataTypesPractice {

    public static void main(String[] args) {

        byte b = 100;
        short s = 1000;
        int i = 100000;
        long l = 100000L;

        float f = 10.5F;
        double d = 20.5;

        char c = 'A';
        boolean flag = true;

        String name = "Taniya";

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(flag);
        System.out.println(name);
    }
}
```

---

# 🎯 Interview Quick Revision

### Q1. How many primitive data types are there in Java?

**8:** `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`.

### Q2. Is String a primitive data type?

**No.** `String` is a reference type/class.

### Q3. What is the default type of an integer literal?

`int`.

```java
100 → int
```

### Q4. What is the default type of a decimal literal?

`double`.

```java
10.5 → double
```

### Q5. Why is `10.5F` used?

Because decimal literals are `double` by default. `F` makes it a `float`.

### Q6. Why is `100L` used?

`L` explicitly makes the integer literal a `long`.

### Q7. Do local variables have default values?

**No.** They must be initialized before use.

### Q8. What is widening conversion?

Converting a smaller compatible type into a larger type automatically.

```java
int x = 10;
double y = x;
```

### Q9. What is `var`?

Local variable **type inference**, not a new data type.

### Q10. What happens when an integer exceeds its range?

It can **overflow**, producing a wrapped-around value for fixed-width integer arithmetic.

---

## ⚡ One-Minute Revision

```text
8 Primitive Types:
byte → short → int → long
float → double
char
boolean

Most common:
int      → whole numbers
long     → large integers
double   → decimals
char     → single character
boolean  → true/false

String → Reference type

L → long
F → float

Local variables → No default value
Instance/static fields → Default values

var → Local variable type inference
```
