# ☕ Java Strings

A **String** is a sequence of characters. In Java, `String` is a **class/reference type**, not a primitive data type.

---

## 1. Creating Strings

### String Literal

```java
String s1 = "Java";
```

### Using `new`

```java
String s2 = new String("Java");
```

For normal usage, prefer the string literal.

---

## 2. String Pool ⭐

Java maintains a **String Pool** for string literals.

```java
String a = "Java";
String b = "Java";
```

Conceptually:

```text
a ─────┐
       ↓
    "Java"
       ↑
b ─────┘
```

Both references can point to the same pooled String object.

---

## 3. `new String()` ⭐

```java
String x = new String("Java");
String y = new String("Java");
```

`new` explicitly creates separate String objects.

```text
x → "Java"    ← Object 1
y → "Java"    ← Object 2
```

The content is the same, but the objects are different.

---

## 4. `==` vs `.equals()` ⭐⭐⭐

This is one of the most important String interview questions.

### `==`

For objects, `==` compares **references**.

### `.equals()`

`equals()` compares the **content** of Strings.

```java
String x = new String("Java");
String y = new String("Java");

System.out.println(x == y);
System.out.println(x.equals(y));
```

Output:

```text
false
true
```

Because:

```text
==        → Same object/reference?
.equals() → Same content?
```

### Important

For comparing String content, use:

```java
a.equals(b);
```

not:

```java
a == b;
```

---

## 5. String Immutability ⭐⭐⭐

Strings are **immutable**.

Once a String object is created, its content cannot be changed.

```java
String s = "Java";

s.concat(" Programming");

System.out.println(s);
```

Output:

```text
Java
```

`concat()` creates a new String.

```java
String s = "Java";

s = s.concat(" Programming");

System.out.println(s);
```

Output:

```text
Java Programming
```

### Remember

```text
String object → cannot be modified
Modification → creates a new String object
```

---

## 6. Important String Methods

### `length()`

```java
String s = "Java";
System.out.println(s.length());  // 4
```

### `charAt()`

```java
System.out.println(s.charAt(0)); // J
```

### `substring()`

```java
String s = "Java Programming";

System.out.println(s.substring(0, 4));
```

Output:

```text
Java
```

> Start index is inclusive, end index is exclusive.

### `toUpperCase()` / `toLowerCase()`

```java
s.toUpperCase();
s.toLowerCase();
```

### `contains()`

```java
s.contains("Java");
```

### `startsWith()` / `endsWith()`

```java
s.startsWith("Java");
s.endsWith("ing");
```

### `indexOf()`

```java
s.indexOf('a');
```

Returns the first occurrence.

### `lastIndexOf()`

```java
s.lastIndexOf('a');
```

Returns the last occurrence.

### `replace()`

```java
s.replace('a', 'x');
```

### `trim()`

Removes leading and trailing whitespace.

```java
"  Java  ".trim();
```

### `isEmpty()`

```java
"".isEmpty();       // true
```

### `isBlank()`

```java
"   ".isBlank();    // true
```

### `equals()`

```java
"Java".equals("Java");  // true
```

### `equalsIgnoreCase()`

```java
"java".equalsIgnoreCase("JAVA");  // true
```

---

## 7. String Concatenation

Use `+` to combine Strings.

```java
String firstName = "Taniya";
String lastName = "Sharma";

String fullName = firstName + " " + lastName;
```

### Important `+` behavior

```java
System.out.println(10 + 20);
```

Output:

```text
30
```

But:

```java
System.out.println("Result: " + 10 + 20);
```

Output:

```text
Result: 1020
```

Because String concatenation happens from left to right.

Use parentheses:

```java
System.out.println("Result: " + (10 + 20));
```

Output:

```text
Result: 30
```

---

## 8. StringBuilder ⭐

`StringBuilder` is **mutable** and is useful when repeatedly modifying/building Strings.

```java
StringBuilder sb = new StringBuilder("Java");

sb.append(" Programming");

System.out.println(sb);
```

Important methods:

```text
append()
insert()
delete()
reverse()
```

Example:

```java
StringBuilder sb = new StringBuilder("Java");

sb.append("!");
sb.reverse();

System.out.println(sb);
```

---

## 9. String vs StringBuilder vs StringBuffer

| Feature      | String             | StringBuilder          | StringBuffer               |
| ------------ | ------------------ | ---------------------- | -------------------------- |
| Mutable      | ❌                  | ✅                      | ✅                          |
| Modification | Creates new object | Modifies object        | Modifies object            |
| Synchronized | N/A                | ❌                      | ✅                          |
| Typical use  | Normal text        | Repeated modifications | Multithreaded modification |

> `StringBuilder` is generally preferred over `StringBuffer` when synchronization is not required.

---

## 10. String Conversion

### String → int

```java
String s = "123";

int number = Integer.parseInt(s);
```

### int → String

```java
int number = 123;

String s = String.valueOf(number);
```

---

## 11. Escape Characters

Common escape sequences:

```text
\n → New line
\t → Tab
\" → Double quote
\\ → Backslash
```

Example:

```java
System.out.println("Hello\nJava");
```

Output:

```text
Hello
Java
```

---

# 12. Practice Program

Create:

```text
04-Strings/
├── README.md
└── StringPractice.java
```

Practice these in `StringPractice.java`:

```text
1. Create Strings using literals and new
2. Print length
3. Access characters using charAt()
4. Extract substring
5. Convert case
6. Search using contains(), indexOf()
7. Use startsWith() and endsWith()
8. Replace characters
9. Remove whitespace
10. Compare Strings using == and equals()
11. Practice String concatenation
12. Convert String ↔ int
13. Use StringBuilder
14. Practice append(), insert(), delete(), reverse()
15. Test String immutability
```

### ⭐ Predict Before Running

```java
String a = "Java";
String b = "Java";

System.out.println(a == b);
System.out.println(a.equals(b));
```

Then:

```java
String x = new String("Java");
String y = new String("Java");

System.out.println(x == y);
System.out.println(x.equals(y));
```

Understand **why** the outputs are different.

---

# 🎯 Important Interview Questions

### Basics

1. What is a String in Java?
2. Is String a primitive or reference type?
3. How can you create a String?
4. What is the difference between String literal and `new String()`?
5. What is the String Pool?

### ⭐ Must Know

6. Why is String immutable?
7. What are the advantages of String immutability?
8. Difference between `==` and `.equals()`?
9. Why does `new String("Java")` make `==` return `false`?
10. What happens when you modify a String?
11. Why are Strings commonly used in the String Pool?
12. What is the difference between String, StringBuilder and StringBuffer?

### Methods

13. Difference between `length()` and `charAt()`?
14. How does `substring()` work?
15. Difference between `equals()` and `equalsIgnoreCase()`?
16. Difference between `isEmpty()` and `isBlank()`?
17. What does `indexOf()` return if the character isn't found?
18. Does `replace()` modify the original String?

### Conversion & Concatenation

19. How do you convert String to integer?
20. How do you convert integer to String?
21. How does `+` work with Strings?
22. What is the output of `"A" + 10 + 20`?
23. What is the output of `"A" + (10 + 20)`?

### StringBuilder

24. Why use StringBuilder?
25. Is StringBuilder mutable?
26. What are common StringBuilder methods?
27. Difference between StringBuilder and StringBuffer?
28. When would you prefer StringBuilder over String?

---

# ⚡ One-Minute Revision

```text
String
 ↓
Reference type / Class
 ↓
Immutable
 ↓
String Pool for literals

==        → reference comparison
.equals() → content comparison

String        → Immutable
StringBuilder → Mutable
StringBuffer  → Mutable + synchronized

Important methods:
length()
charAt()
substring()
contains()
indexOf()
lastIndexOf()
replace()
trim()
isEmpty()
isBlank()
equals()
equalsIgnoreCase()

Conversions:
String → int     → Integer.parseInt()
int → String     → String.valueOf()

Remember:
"Java" == "Java"                    → usually true
new String("Java") == new String("Java") → false
```

### 🚀 Before moving to Operators

You should be able to explain these **without looking at your notes**:

> **String Pool + immutability + `==` vs `.equals()` + StringBuilder + important String methods.**

If you can explain those five areas and complete your `StringPractice.java`, your String fundamentals are solid.
