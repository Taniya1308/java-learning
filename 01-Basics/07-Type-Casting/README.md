# ☕ JAVA TYPE CASTING
==================================================

⭐ DEFINITION
--------------------------------------------------

Type Casting
    → converting a value from one data type to another

Example:

int x = 10;
double y = x;

int → double


TYPES
--------------------------------------------------

1. Widening Casting
    → smaller type → larger type
    → automatic

2. Narrowing Casting
    → larger type → smaller type
    → explicit


1. WIDENING CASTING ⭐
==================================================

Smaller type → larger type

Common order:

byte
  ↓
short
  ↓
int
  ↓
long
  ↓
float
  ↓
double


Example:

int x = 100;
double y = x;

→ automatic conversion
→ no explicit cast required


Examples:

byte → short
short → int
int → long
long → float
float → double
int → double


IMPORTANT
--------------------------------------------------

Widening generally avoids the information loss associated
with narrowing conversions.


2. NARROWING CASTING ⭐
==================================================

Larger type → smaller type

Requires explicit casting.

Syntax:

(targetType)value


Example:

double x = 10.8;
int y = (int)x;

Result:

y = 10


IMPORTANT
--------------------------------------------------

Casting a floating-point value to an integer
    → removes the fractional part
    → does NOT round


Examples:

10.9  → 10
10.1  → 10
-10.9 → -10


3. WIDENING vs NARROWING
==================================================

WIDENING
--------------------------------------------------

int x = 10;
double y = x;

→ automatic


NARROWING
--------------------------------------------------

double x = 10.5;
int y = (int)x;

→ explicit


Remember:

Widening  → automatic
Narrowing → explicit


4. CASTING SYNTAX
==================================================

(targetType)value


Examples:

int x = (int)10.5;

long x = (long)100.5;

float x = (float)10.5;

char x = (char)65;


5. CASTING DOES NOT CHANGE ORIGINAL VALUE
==================================================

double x = 10.8;

int y = (int)x;

x
    → 10.8

y
    → 10


The original variable remains unchanged.


6. INTEGER DIVISION + CASTING ⭐
==================================================

int a = 5;
int b = 2;

double result = a / b;

Result:

2.0


Why?

a / b
    → int / int
    → 2

Then:

2 → double
    → 2.0


CORRECT DECIMAL DIVISION
--------------------------------------------------

double result = (double)a / b;

Result:

2.5


IMPORTANT:

Cast BEFORE division if you want decimal division.


7. POSITION OF CAST MATTERS ⭐
==================================================

Example:

int a = 10;
int b = 4;


A:

double x = (double)(a / b);

Steps:

a / b
→ 10 / 4
→ 2

(double)2
→ 2.0


B:

double y = (double)a / b;

Steps:

(double)a
→ 10.0

10.0 / 4
→ 2.5


Therefore:

(double)(a / b)
    → 2.0

(double)a / b
    → 2.5


8. CHAR CASTING
==================================================

char is an integral type in Java.


CHAR → INT
--------------------------------------------------

char ch = 'A';

int x = ch;

→ 65


INT → CHAR
--------------------------------------------------

int x = 66;

char ch = (char)x;

→ 'B'


Useful for:
→ character problems
→ ASCII/Unicode concepts
→ DSA string/character problems


9. DATA LOSS
==================================================

Narrowing may cause:

→ fractional part loss
→ precision loss
→ overflow/wrapping


Example:

double x = 99.99;
int y = (int)x;

y
→ 99


10. BYTE RANGE EXAMPLE
==================================================

byte range:

-128 to 127


Example:

int x = 130;

byte b = (byte)x;


130 cannot be represented directly in byte,
so narrowing can produce a different value.


11. CASTING vs PARSING ⭐
==================================================

CASTING
--------------------------------------------------

Converts compatible types.

double x = 10.5;

int y = (int)x;


PARSING
--------------------------------------------------

Converts String into a numeric/primitive value.

int x = Integer.parseInt("100");


Remember:

(int)10.5
    → casting

Integer.parseInt("10")
    → parsing


12. IMPLICIT vs EXPLICIT
==================================================

IMPLICIT CASTING
--------------------------------------------------

→ automatic
→ widening

Example:

int x = 10;
double y = x;


EXPLICIT CASTING
--------------------------------------------------

→ programmer specifies conversion
→ narrowing

Example:

double x = 10.5;
int y = (int)x;


13. TYPE PROMOTION IN EXPRESSIONS
==================================================

Java promotes smaller numeric types during arithmetic.

Example:

byte a = 10;
byte b = 20;

int c = a + b;


Result type of:

a + b
    → int


Important:

byte, short and char are generally promoted to int
during arithmetic operations.


14. IMPORTANT EXAMPLES
==================================================

Example 1:

int x = 10;
double y = x;

y → 10.0


Example 2:

double x = 10.99;
int y = (int)x;

y → 10


Example 3:

System.out.println(5 / 2);

→ 2


Example 4:

System.out.println((double)5 / 2);

→ 2.5


Example 5:

System.out.println((double)(5 / 2));

→ 2.0


Example 6:

char ch = 'A';
int x = ch;

→ 65


Example 7:

int x = 66;
char ch = (char)x;

→ B


15. COMMON MISTAKES ⭐
==================================================

❌ Assuming narrowing is automatic.

double x = 10.5;
int y = x;

→ compile-time error


Correct:

int y = (int)x;


❌ Expecting rounding:

(int)10.9
→ 10

NOT 11


❌ Casting after integer division:

(double)(5 / 2)
→ 2.0

Correct:

(double)5 / 2
→ 2.5


❌ Confusing casting with parsing.

(int)10.5
→ casting

Integer.parseInt("10")
→ parsing


❌ Thinking casting changes the original variable.

double x = 10.9;
int y = (int)x;

x is still 10.9.


16. PRACTICE QUESTIONS
==================================================

LEVEL 1
--------------------------------------------------

Q1.

int x = 10;
double y = x;
System.out.println(y);

→ Find output.


Q2.

double x = 10.9;
int y = (int)x;
System.out.println(y);

→ Find output.


Q3.

int a = 5;
int b = 2;
double result = a / b;
System.out.println(result);

→ Find output.


Q4.

int a = 5;
int b = 2;
double result = (double)a / b;
System.out.println(result);

→ Find output.


Q5.

char ch = 'A';
int x = ch;
System.out.println(x);

→ Find output.


LEVEL 2
--------------------------------------------------

Q6.

int x = 10;
double y = 3;

System.out.println((int)(x / y));

→ Find output.


Q7.

double x = 10.99;
int a = (int)x;
double b = a;

System.out.println(b);

→ Find output.


Q8.

int a = 10;
int b = 4;

double x = (double)(a / b);
double y = (double)a / b;

System.out.println(x);
System.out.println(y);

→ Find output.


Q9.

int x = 66;
char ch = (char)x;

System.out.println(ch);

→ Find output.


Q10.

Find the difference between:

(int)(5 / 2.0)

and

(int)5 / 2.0


CODING PRACTICE
--------------------------------------------------

1. Convert int → double.

2. Convert double → int.

3. Convert char → int.

4. Convert int → char.

5. Take two integers and calculate their average
   as a decimal.

6. Take a decimal number and print only its integer part.

7. Demonstrate int → long → double.

8. Demonstrate double → int.

9. Show the difference between:
   5 / 2
   (double)5 / 2

10. Take marks as int and calculate percentage as double.


17. INTERVIEW QUESTIONS ⭐
==================================================

Q1. What is type casting?
→ Converting a value from one data type to another.

Q2. What are the two main types?
→ Widening and narrowing.

Q3. What is widening?
→ Smaller type → larger type.

Q4. Is widening automatic?
→ Generally yes.

Q5. What is narrowing?
→ Larger type → smaller type.

Q6. Is narrowing automatic?
→ No, explicit casting is normally required.

Q7. What is the syntax?
→ (type)value

Q8. What happens when double is cast to int?
→ Fractional part is discarded.

Q9. Difference between casting and parsing?
→ Casting converts compatible types; parsing converts
  textual data such as String into another type.

Q10. Why does 5 / 2 produce 2?
→ Both operands are int.

Q11. How can 5 / 2 produce 2.5?
→ Make at least one operand floating-point:

(double)5 / 2


Q12. What is type promotion?
→ Smaller numeric types may be promoted to int or
  another wider type during expressions.


18. CHEAT SHEET ⭐
==================================================

WIDENING
--------------------------------------------------

byte → short → int → long → float → double

→ automatic


NARROWING
--------------------------------------------------

double → float → long → int → short → byte

→ explicit cast


SYNTAX
--------------------------------------------------

(type)value


EXAMPLES
--------------------------------------------------

int → double
    double d = i;

double → int
    int i = (int)d;

char → int
    int x = ch;

int → char
    char ch = (char)x;


DIVISION
--------------------------------------------------

5 / 2
    → 2

(double)5 / 2
    → 2.5

(double)(5 / 2)
    → 2.0


19. ONE-MINUTE REVISION
==================================================

Type Casting
    → conversion between data types

Widening
    → smaller → larger
    → automatic

Narrowing
    → larger → smaller
    → explicit

Syntax
    → (type)value

double → int
    → fractional part discarded

char → int
    → numeric character value

int → char
    → character corresponding to the value

Casting
    → type conversion

Parsing
    → String conversion

Important:
    → cast BEFORE division for decimal result


20. BEFORE MOVING TO NEXT TOPIC
==================================================

[ ] Explain type casting
[ ] Explain widening
[ ] Explain narrowing
[ ] Write explicit casts
[ ] Predict double → int results
[ ] Understand char ↔ int
[ ] Understand integer division
[ ] Know where to place a cast
[ ] Explain casting vs parsing
[ ] Understand type promotion
[ ] Solve all practice questions
[ ] Write basic casting programs


⭐ CORE IDEA
==================================================

WIDENING:
small → large → automatic

NARROWING:
large → small → explicit

CAST:
(type)value

MOST IMPORTANT DSA EXAMPLE:

int a = 5;
int b = 2;

(double)a / b
    → 2.5

(double)(a / b)
    → 2.0


REMEMBER:

CASTING CHANGES THE TYPE OF A VALUE/EXPRESSION,
NOT THE ORIGINAL VARIABLE.