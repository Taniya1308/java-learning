# Java Introduction ☕

## What is Java?

Java is a high-level, class-based, object-oriented and platform-independent programming language.

It follows the principle:

> **Write Once, Run Anywhere (WORA)**

Java was originally developed by Sun Microsystems and released in 1995.

---

## Why is Java Platform Independent?

Java source code is first compiled into bytecode.

```text
Java Source Code
       ↓
     javac
       ↓
   Bytecode
   (.class)
       ↓
      JVM
       ↓
Machine Code
```

The bytecode can run on different operating systems as long as a compatible JVM is available.

---

## JVM

JVM stands for **Java Virtual Machine**.

It executes Java bytecode and provides the runtime environment for Java programs.

Responsibilities include:

* Executing bytecode
* Memory management
* Garbage collection
* Runtime execution

---

## JRE

JRE stands for **Java Runtime Environment**.

Conceptually:

```text
JRE = JVM + Java Runtime Libraries
```

It provides the environment required to run Java applications.

---

## JDK

JDK stands for **Java Development Kit**.

It provides tools required to develop Java applications.

Conceptually:

```text
JDK = JRE + Development Tools
```

Examples of development tools include:

* `javac` — Java compiler
* `java` — Java launcher
* `javadoc` — documentation generator
* `jar` — Java archive tool

---

## JDK vs JRE vs JVM

| Component | Purpose                   |
| --------- | ------------------------- |
| JDK       | Develop Java applications |
| JRE       | Run Java applications     |
| JVM       | Execute Java bytecode     |

Remember:

```text
JDK
 ↓
JRE
 ↓
JVM
```

---

## First Java Program

```java
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

### Output

```text
Hello, Java!
```

---

## Important Points

* Java is object-oriented.
* Java is platform independent through bytecode and the JVM.
* Java source files use the `.java` extension.
* Compiled Java bytecode uses the `.class` extension.
* `javac` compiles Java source code.
* `java` runs a Java application.
* The `main()` method is the entry point of a standard Java application.

---

## Java Execution Flow

```text
HelloWorld.java
      ↓
    javac
      ↓
HelloWorld.class
      ↓
     JVM
      ↓
    Output
```
