# ☕ Java Variables

A **variable** is a named storage location used to store data during program execution.

## 1. Declaration & Initialization

### Declaration

```java
int age;
```

Declares a variable without assigning a value.

### Initialization

```java
age = 21;
```

Assigns a value to the variable.

### Both Together

```java
int age = 21;
```

---

## 2. Common Variables

```java
int age = 21;
double cgpa = 7.9;
char grade = 'A';
boolean isStudent = true;
String name = "Tannu";
```

| Type      | Example    | Purpose          |
| --------- | ---------- | ---------------- |
| `int`     | `21`       | Whole numbers    |
| `double`  | `7.9`      | Decimal numbers  |
| `char`    | `'A'`      | Single character |
| `boolean` | `true`     | True/false       |
| `String`  | `"Tannu"` | Text             |

> Detailed data types are covered in the next topic.

---

## 3. Changing Values

A variable can be reassigned:

```java
int age = 21;
age = 22;

System.out.println(age);
```

Output:

```text
22
```

---

## 4. Naming Rules

### Valid

```java
int age;
int studentAge;
String firstName;
int age2;
```

### Invalid

```java
int 2age;        // Cannot start with a number
int student-age; // '-' is not allowed
int class;       // Keyword cannot be used
```

### Convention

Use **camelCase**:

```java
studentAge
firstName
accountBalance
```

Java variable names are **case-sensitive**:

```java
int age = 21;
int Age = 22;
```

These are different variables.

---

## 5. Constants

Use `final` when a variable should not be reassigned.

```java
final double PI = 3.14159;
final int MAX_SIZE = 100;
```

Constants conventionally use **UPPER_SNAKE_CASE**.

---

## 6. Assignment vs Comparison

`=` → assignment

```java
int age = 21;
```

`==` → comparison

```java
age == 21
```

---

## 7. Example

```java
public class VariablePractice {

    public static void main(String[] args) {

        String name = "Tannu";
        int age = 21;
        String college = "PSIT";
        double cgpa = 7.9;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
        System.out.println("CGPA: " + cgpa);
    }
}
```

### Output

```text
Name: Tannu
Age: 21
College: PSIT
CGPA: 7.9
```

---

## 🎯 Interview Quick Revision

* **Variable:** Named storage location for data.
* **Declaration:** Specifies type and name.
* **Initialization:** Assigns the initial value.
* **Reassignment:** Changes the stored value.
* **`final`:** Prevents reassignment.
* **`=`:** Assignment operator.
* **`==`:** Equality comparison.
* Java is **case-sensitive**.
* Variables generally follow **camelCase** naming.
* Java keywords cannot be used as variable names.

### Quick Formula

```text
Data Type + Variable Name + Value

int age = 21;
```
