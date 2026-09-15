# ☕ JAVA INPUT & OUTPUT
==================================================

⭐ BASICS
--------------------------------------------------

Java I/O mainly means:
→ Taking input
→ Processing data
→ Producing output

Basic flow:

INPUT → PROCESS → OUTPUT


1. OUTPUT
==================================================

System.out.print()
    → prints on same line

System.out.println()
    → prints + moves to next line

System.out.printf()
    → formatted output


Example:

System.out.print("Hello");
System.out.println(" Java");
System.out.printf("Age = %d%n", 20);


2. SYSTEM
==================================================

System.in
    → standard input
    → usually keyboard

System.out
    → standard output
    → usually console

System.err
    → error output


3. SCANNER ⭐
==================================================

Used for easy user input.

Import:

import java.util.Scanner;

Create:

Scanner sc = new Scanner(System.in);


4. SCANNER METHODS
==================================================

nextInt()
    → int

nextLong()
    → long

nextFloat()
    → float

nextDouble()
    → double

nextBoolean()
    → boolean

next()
    → one word/token

nextLine()
    → complete line

next().charAt(0)
    → char


5. BASIC INPUT
==================================================

int n = sc.nextInt();

long n = sc.nextLong();

double x = sc.nextDouble();

float x = sc.nextFloat();

boolean b = sc.nextBoolean();

String word = sc.next();

String line = sc.nextLine();

char ch = sc.next().charAt(0);


6. next() vs nextLine() ⭐
==================================================

next()
    → reads one token
    → stops at whitespace

Input:
Hello World

next()
    → "Hello"


nextLine()
    → reads complete line

Input:
Hello World

nextLine()
    → "Hello World"


7. nextInt() + nextLine() ⭐
==================================================

Problem:

int age = sc.nextInt();
String name = sc.nextLine();

nextInt() leaves the newline character.

Fix:

int age = sc.nextInt();
sc.nextLine();
String name = sc.nextLine();


RULE:

After nextInt(), nextLong(), nextDouble(), etc.
→ use nextLine() before reading a complete line.


8. CHAR vs STRING
==================================================

char:
    'A'

String:
    "A"

char ch = sc.next().charAt(0);

String s = sc.next();


9. MULTIPLE INPUTS
==================================================

Input:

10 20 30

Code:

int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();


Whitespace can be:
→ space
→ tab
→ newline

Scanner's numeric methods handle whitespace automatically.


10. INTEGER DIVISION ⭐
==================================================

5 / 2
    → 2

5 / 2.0
    → 2.5

5.0 / 2
    → 2.5

Reason:
→ int / int gives integer result.


11. MODULO %
==================================================

% gives remainder.

10 % 3
    → 1

10 % 5
    → 0

7 % 2
    → 1


COMMON USE:

Even:
    n % 2 == 0

Odd:
    n % 2 != 0

Divisible:
    n % x == 0


12. STRING CONCATENATION
==================================================

"Age: " + 20
    → Age: 20

10 + 20
    → 30

"Java" + 10 + 20
    → Java1020

10 + 20 + "Java"
    → 30Java

Reason:
→ evaluation is left-to-right.


13. PRINTF ⭐
==================================================

%d
    → integer

%f
    → floating-point

%.2f
    → 2 decimal places

%c
    → char

%s
    → String

%b
    → boolean

%n
    → new line


Example:

double marks = 95.6789;

System.out.printf("%.2f%n", marks);

Output:
95.68


14. ESCAPE SEQUENCES
==================================================

\n
    → new line

\t
    → tab

\"
    → double quote

\'
    → single quote

\\
    → backslash


Example:

System.out.println("Hello\nJava");


15. TYPE CONVERSION
==================================================

String → int:

int n = Integer.parseInt("100");

String → long:

long n = Long.parseLong("100");

String → double:

double x = Double.parseDouble("10.5");

String → float:

float x = Float.parseFloat("10.5");


PARSING
    → String → another type

CASTING
    → compatible type → another type

Example:

double x = 10.5;
int y = (int)x;
    → 10


16. INPUT VALIDATION
==================================================

hasNextInt()
    → checks whether next input is int

hasNextDouble()
    → checks whether next input is double

hasNext()
    → checks whether input exists


Example:

if(sc.hasNextInt()) {
    int n = sc.nextInt();
}


17. COMMON MISTAKES ⭐
==================================================

❌ Forgetting import:

import java.util.Scanner;


❌ Using next() for a sentence

Use:
    nextLine()


❌ Using nextLine() immediately after nextInt()

Fix:
    sc.nextLine();


❌ Expecting:

5 / 2 → 2.5

Actual:
    2


❌ Confusing:

'A' → char

"A" → String


❌ Giving invalid input:

int n = sc.nextInt();

Input:
abc

→ InputMismatchException


18. SCANNER vs BUFFEREDREADER
==================================================

Scanner:
→ easy to use
→ beginner-friendly
→ convenient type methods
→ slower for very large input

BufferedReader:
→ faster
→ reads text
→ commonly used in competitive programming
→ requires parsing numbers


Scanner:

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();


BufferedReader:

BufferedReader br =
    new BufferedReader(new InputStreamReader(System.in));

int n = Integer.parseInt(br.readLine());


19. IMPORTANT I/O CLASSES
==================================================

System
    → standard I/O

Scanner
    → easy input

BufferedReader
    → buffered text input

InputStreamReader
    → byte stream → character stream

PrintWriter
    → convenient output


20. COMPLETE BASIC PROGRAM
==================================================

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println(sum);

        sc.close();
    }
}


21. PRACTICE QUESTIONS ⭐
==================================================

BEGINNER
--------------------------------------------------

1. Print Hello World.
2. Input two numbers and print their sum.
3. Print sum, difference, product, quotient and remainder.
4. Input name and age and print them.
5. Calculate rectangle area.
6. Calculate circle area.
7. Convert Celsius to Fahrenheit.
8. Calculate average of 3 numbers.
9. Check even/odd.
10. Check divisibility.

INTERMEDIATE
--------------------------------------------------

11. Input a full name using nextLine().
12. Calculate percentage of 5 subjects.
13. Calculate simple interest.
14. Convert seconds into hours/minutes/seconds.
15. Extract digits of a 3-digit number.
16. Swap two numbers.
17. Find ASCII value of a character.
18. Format a decimal using printf().
19. Predict output of + with String.
20. Practice nextInt() + nextLine().


22. OUTPUT PREDICTION ⭐
==================================================

System.out.println(10 + 20);
→ 30

System.out.println("10" + 20);
→ 1020

System.out.println("Java" + 10 + 20);
→ Java1020

System.out.println(10 + 20 + "Java");
→ 30Java

System.out.println(5 / 2);
→ 2

System.out.println(5 / 2.0);
→ 2.5

System.out.println(10 % 3);
→ 1


23. INTERVIEW QUESTIONS ⭐
==================================================

Q1. What is Scanner?
→ Class used to take input.

Q2. Which package contains Scanner?
→ java.util

Q3. print() vs println()?
→ println() moves to next line.

Q4. next() vs nextLine()?
→ next() reads one token; nextLine() reads a full line.

Q5. Why does nextInt() + nextLine() cause a problem?
→ nextInt() leaves the newline.

Q6. How to read char?
→ sc.next().charAt(0)

Q7. What is integer division?
→ Division of integral operands producing an integral result.

Q8. What does % do?
→ Returns remainder.

Q9. What is parsing?
→ Converting String into another data type.

Q10. Scanner vs BufferedReader?
→ Scanner is easier; BufferedReader is generally faster.


24. CHEAT SHEET ⭐
==================================================

INPUT
--------------------------------------------------

int       → nextInt()
long      → nextLong()
float     → nextFloat()
double    → nextDouble()
boolean   → nextBoolean()
word      → next()
line      → nextLine()
char      → next().charAt(0)


OUTPUT
--------------------------------------------------

print()
println()
printf()


PRINTF
--------------------------------------------------

%d     → integer
%f     → decimal
%.2f   → 2 decimal places
%c     → char
%s     → String
%b     → boolean
%n     → new line


OPERATORS TO REMEMBER
--------------------------------------------------

/   → division
%   → remainder
+   → addition / concatenation
-   → subtraction
*   → multiplication


25. ONE-MINUTE REVISION
==================================================

import java.util.Scanner;

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
double x = sc.nextDouble();
String word = sc.next();
String line = sc.nextLine();
char ch = sc.next().charAt(0);

System.out.println(n);
System.out.printf("%.2f%n", x);

Important:
→ next() = one word
→ nextLine() = complete line
→ numeric input + nextLine() = handle newline
→ int / int = integer division
→ % = remainder
→ char = 'A'
→ String = "A"


26. BEFORE MOVING ON
==================================================

[ ] Understand print(), println(), printf()
[ ] Use Scanner
[ ] Take all basic data types as input
[ ] Understand next() vs nextLine()
[ ] Handle nextInt() + nextLine()
[ ] Understand integer division
[ ] Use %
[ ] Use String concatenation
[ ] Use printf formatting
[ ] Convert String to numbers
[ ] Solve basic I/O programs
[ ] Predict basic Java output
[ ] Know Scanner vs BufferedReader


⭐ CORE PATTERN
==================================================

INPUT
  ↓
PROCESS
  ↓
OUTPUT

Most beginner Java problems follow this pattern.