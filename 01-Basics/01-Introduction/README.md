# ☕ Java Introduction

Java is a **high-level, class-based, object-oriented, statically typed, platform-independent programming language**.

It follows the principle:

> **Write Once, Run Anywhere (WORA)**

---

## 1. Key Features of Java

* **Object-Oriented** — supports Encapsulation, Inheritance, Polymorphism and Abstraction.
* **Platform Independent** — Java code is compiled into bytecode, which runs on JVMs available for different platforms.
* **Simple** — avoids complex features such as explicit pointer arithmetic.
* **Secure** — provides bytecode verification, runtime checks and controlled memory access.
* **Robust** — strong type checking, exception handling and automatic memory management.
* **Multithreaded** — supports concurrent execution using threads.
* **Portable** — bytecode can run on different systems with a compatible JVM.
* **High Performance** — JVM uses JIT compilation to improve execution speed.

---

## 2. JDK vs JRE vs JVM

```text
JDK
 └── JRE
      └── JVM
```

| Component | Purpose                           |
| --------- | --------------------------------- |
| **JDK**   | Develop and run Java applications |
| **JRE**   | Provides runtime environment      |
| **JVM**   | Executes Java bytecode            |

### JDK

**Java Development Kit** provides tools required for Java development.

Important tools:

```text
javac → compiler
java  → runs Java application
javadoc → generates documentation
jar → creates Java archives
```

### JRE

**Java Runtime Environment** provides the environment required to run Java applications.

Conceptually:

```text
JRE = JVM + Java Runtime Libraries
```

### JVM

**Java Virtual Machine** executes Java bytecode and manages runtime operations such as memory management and garbage collection.

---

## 3. Java Execution Flow

```text
HelloWorld.java
      ↓
    javac
      ↓
HelloWorld.class
   (Bytecode)
      ↓
     JVM
      ↓
 Machine Code
      ↓
   Execution
```

### Important

* `.java` → source code
* `.class` → bytecode
* `javac` → compiles source code
* `java` → launches the application
* JVM → executes bytecode

---

## 4. Why is Java Platform Independent?

The **bytecode is platform independent**, while the **JVM is platform dependent**.

```text
             Bytecode
                ↓
       ┌────────┼────────┐
       ↓        ↓        ↓
   Windows JVM Linux JVM macOS JVM
       ↓        ↓        ↓
    Windows    Linux     macOS
```

Therefore, the same Java bytecode can run on different operating systems using their respective JVMs.

---

## 5. Is Java Compiled or Interpreted?

Java uses **both compilation and runtime execution techniques**.

```text
Source Code
    ↓
  javac
    ↓
 Bytecode
    ↓
   JVM
  ↙   ↘
Interpreter + JIT Compiler
       ↓
  Machine Code
```

**JIT (Just-In-Time) Compiler** compiles frequently executed bytecode into native machine code at runtime to improve performance.

---

## 6. Basic Java Program

```java
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

### `main()` breakdown

```text
public  → accessible to JVM
static  → can be called without creating an object
void    → returns nothing
main    → application entry point
String[] args → command-line arguments
```

---

## 7. JVM Memory — Basic View

```text
JVM Memory
├── Heap
├── Stack
├── Method Area
├── PC Register
└── Native Method Stack
```

* **Heap** → objects and arrays
* **Stack** → method calls and local variables
* **Method Area** → class-level information
* **PC Register** → current instruction for each thread
* **Native Method Stack** → native method execution

---

## 8. Garbage Collection

Java provides **automatic memory management** through Garbage Collection (GC).

When an object is no longer reachable, it becomes **eligible for garbage collection**.

```java
Student s = new Student();
s = null;
```

The object may now be eligible for GC.

> Eligible for GC does not mean it is immediately deleted.

---

## 9. Important Java Concepts

* **Statically Typed** → variable types are checked at compile time.
* **Strongly Typed** → Java enforces type compatibility.
* **Reference** → used to access objects; Java does not provide explicit pointer arithmetic.
* **Class** → blueprint for creating objects.
* **Object** → instance of a class.
* **Package** → organizes related classes and interfaces.
* **Keyword** → reserved word such as `class`, `static`, `final`, `if`.
* **Identifier** → name given to classes, methods, variables, etc.

---

## 10. Important Interview Questions

Before moving ahead, know the answers to:

1. What is Java?
2. What are the features of Java?
3. Why is Java platform independent?
4. What is bytecode?
5. What is JVM?
6. Difference between JDK, JRE and JVM?
7. What does `javac` do?
8. Is Java compiled or interpreted?
9. What is JIT?
10. Why is `main()` static?
11. Why is `main()` public?
12. What is `String[] args`?
13. What is garbage collection?
14. Does Java support pointers?
15. What are the main JVM memory areas?

---

## ⚡ Quick Revision

```text
Java
 ↓
High-level + OOP + Statically Typed
 ↓
.java
 ↓
javac
 ↓
.class (Bytecode)
 ↓
JVM
 ↓
Execution
```

### Remember

> **JDK → Development**
> **JRE → Runtime**
> **JVM → Execution**
> **Bytecode → Platform Independent**
> **JVM → Platform Dependent**
