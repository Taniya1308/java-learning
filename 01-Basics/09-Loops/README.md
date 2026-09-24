# 🔁 JAVA LOOPS
==================================================

Loops are used to execute a block of code repeatedly.

Instead of writing the same code multiple times,
we use a loop.

Example:

for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

Output:

1
2
3
4
5


WHY LOOPS?
--------------------------------------------------

Loops are used for:

→ Repetition
→ Counting
→ Summation
→ Searching
→ Array traversal
→ String traversal
→ Pattern printing
→ Number problems
→ DSA algorithms


TYPES OF LOOPS
--------------------------------------------------

1. for loop
2. while loop
3. do-while loop
4. enhanced for / for-each loop


FOR LOOP ⭐⭐⭐
--------------------------------------------------

Syntax:

for (initialization; condition; update) {
    // code
}

Example:

for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

Execution:

initialization
      ↓
condition
      ↓
body
      ↓
update
      ↓
condition again


FOR LOOP PARTS
--------------------------------------------------

Initialization:

int i = 1

→ executed once
→ gives starting value


Condition:

i <= 5

→ checked before every iteration
→ true → execute
→ false → stop


Update:

i++

→ changes loop variable

Common updates:

i++
i--
i += 2
i -= 2


FORWARD LOOP
--------------------------------------------------

for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}


BACKWARD LOOP
--------------------------------------------------

for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}


EVEN NUMBERS
--------------------------------------------------

for (int i = 2; i <= 10; i += 2) {
    System.out.println(i);
}


ODD NUMBERS
--------------------------------------------------

for (int i = 1; i <= 10; i += 2) {
    System.out.println(i);
}


WHILE LOOP ⭐⭐⭐
--------------------------------------------------

A while loop executes as long as its condition is true.

Syntax:

while (condition) {
    // code
}

Example:

int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}

Execution:

condition
    ↓
true
    ↓
body
    ↓
update
    ↓
condition again


IMPORTANT:
--------------------------------------------------

Always make sure the loop variable changes when necessary.

Wrong:

int i = 1;

while (i <= 5) {
    System.out.println(i);
}

This creates an infinite loop because i never changes.


DO-WHILE LOOP ⭐⭐
--------------------------------------------------

A do-while loop executes its body at least once.

Syntax:

do {
    // code
} while (condition);

Example:

int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);


WHILE VS DO-WHILE
--------------------------------------------------

while:

→ condition checked first
→ body may execute zero times


do-while:

→ body executes first
→ condition checked afterward
→ body executes at least once


FOR VS WHILE
--------------------------------------------------

for:

→ useful when iterations are countable/known


while:

→ useful when repetition depends mainly on a condition


DO-WHILE:

→ useful when code must execute at least once


FOR-EACH LOOP ⭐⭐
--------------------------------------------------

Used mainly for traversing arrays and collections.

Syntax:

for (dataType value : array) {
    // code
}

Example:

int[] arr = {10, 20, 30, 40};

for (int x : arr) {
    System.out.println(x);
}


NORMAL FOR VS FOR-EACH
--------------------------------------------------

Normal for:

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

Use when you need:

→ index
→ position
→ custom movement
→ reverse traversal


For-each:

for (int x : arr) {
    System.out.println(x);
}

Use when you mainly need:

→ values


BREAK ⭐⭐⭐
--------------------------------------------------

break immediately terminates the loop.

Example:

for (int i = 1; i <= 10; i++) {

    if (i == 5) {
        break;
    }

    System.out.println(i);
}

Output:

1
2
3
4

Remember:

break
→ STOP THE ENTIRE LOOP


CONTINUE ⭐⭐⭐
--------------------------------------------------

continue skips the current iteration.

Example:

for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}

Output:

1
2
4
5

Remember:

continue
→ SKIP CURRENT ITERATION


BREAK VS CONTINUE
--------------------------------------------------

break:

→ terminates entire loop


continue:

→ skips current iteration
→ loop continues


NESTED LOOPS ⭐⭐⭐
--------------------------------------------------

A loop inside another loop is called a nested loop.

Example:

for (int i = 1; i <= 3; i++) {

    for (int j = 1; j <= 2; j++) {
        System.out.println(i + " " + j);
    }
}

Output:

1 1
1 2
2 1
2 2
3 1
3 2


NESTED LOOP EXECUTION
--------------------------------------------------

For every iteration of the outer loop,
the inner loop completes all its iterations.

If:

outer loop = n
inner loop = n

total:

n × n = n²

Time complexity:

O(n²)


THREE NESTED LOOPS
--------------------------------------------------

If three loops each run n times:

n × n × n = n³

Time complexity:

O(n³)


INFINITE LOOP
--------------------------------------------------

A loop that never becomes false is an infinite loop.

Example:

while (true) {
    System.out.println("Hello");
}

Another example:

for (;;) {
    System.out.println("Hello");
}


LOOP + CONDITION
--------------------------------------------------

Loops are commonly combined with if statements.

Example:

for (int i = 1; i <= 10; i++) {

    if (i % 2 == 0) {
        System.out.println(i);
    }
}

Output:

2
4
6
8
10


MODULO WITH LOOPS ⭐⭐⭐
--------------------------------------------------

% gives the remainder.

Even:

number % 2 == 0

Odd:

number % 2 != 0

Divisible by 3:

number % 3 == 0


SUM USING LOOP
--------------------------------------------------

int sum = 0;

for (int i = 1; i <= 5; i++) {
    sum += i;
}

System.out.println(sum);

Output:

15

Pattern:

int sum = 0;

for (...) {
    sum += value;
}


PRODUCT USING LOOP
--------------------------------------------------

int product = 1;

for (int i = 1; i <= 5; i++) {
    product *= i;
}

System.out.println(product);

Output:

120

Important:

sum/product initialization:

sum = 0
product = 1


COUNTING USING LOOP
--------------------------------------------------

int count = 0;

for (...) {

    if (condition) {
        count++;
    }
}

Pattern:

initialize
    ↓
loop
    ↓
check condition
    ↓
increment count


LOOP WITH USER INPUT
--------------------------------------------------

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

for (int i = 1; i <= n; i++) {
    System.out.println(i);
}


LOOP THROUGH STRING
--------------------------------------------------

String s = "Hello";

for (int i = 0; i < s.length(); i++) {
    System.out.println(s.charAt(i));
}

Important:

String:

s.length()

Array:

arr.length


LOOP THROUGH ARRAY
--------------------------------------------------

int[] arr = {10, 20, 30, 40};

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

Valid array indexes:

0
1
2
...
arr.length - 1


FIND MAXIMUM
--------------------------------------------------

int[] arr = {10, 50, 20, 40};

int max = arr[0];

for (int i = 1; i < arr.length; i++) {

    if (arr[i] > max) {
        max = arr[i];
    }
}

System.out.println(max);

Pattern:

initialize answer
      ↓
traverse data
      ↓
compare
      ↓
update answer


FIND MINIMUM
--------------------------------------------------

int min = arr[0];

for (int i = 1; i < arr.length; i++) {

    if (arr[i] < min) {
        min = arr[i];
    }
}

System.out.println(min);


DIGIT MANIPULATION ⭐⭐⭐
--------------------------------------------------

Last digit:

n % 10

Remove last digit:

n / 10

Example:

n = 1234

1234 % 10
→ 4

1234 / 10
→ 123


COUNT DIGITS
--------------------------------------------------

int count = 0;

while (n > 0) {
    count++;
    n /= 10;
}


SUM OF DIGITS
--------------------------------------------------

int sum = 0;

while (n > 0) {
    sum += n % 10;
    n /= 10;
}


REVERSE NUMBER
--------------------------------------------------

int reverse = 0;

while (n > 0) {

    int digit = n % 10;

    reverse = reverse * 10 + digit;

    n /= 10;
}


PRIME NUMBER BASIC IDEA
--------------------------------------------------

A prime number has exactly two positive factors:

1 and itself.

For checking a number n,
you can test possible divisors.

Basic approach:

for (int i = 2; i < n; i++) {

    if (n % i == 0) {
        // not prime
    }
}


OPTIMIZED PRIME CHECK ⭐⭐⭐
--------------------------------------------------

You only need to check up to sqrt(n).

for (int i = 2; i * i <= n; i++) {

    if (n % i == 0) {
        // not prime
    }
}

Time complexity:

O(sqrt(n))


COMMON LOOP MISTAKES ⚠️
--------------------------------------------------

1. Forgetting update

while (i <= n) {
    System.out.println(i);
}

May cause infinite loop.


2. Wrong condition

i < n
vs
i <= n

These produce different ranges.


3. Wrong update

i++
vs
i--

Choose according to loop direction.


4. Off-by-one error

Array traversal usually:

for (int i = 0; i < arr.length; i++)


5. Extra semicolon

Wrong:

for (int i = 0; i < 5; i++);

Avoid unnecessary semicolon after loop header.


6. Modifying the wrong variable

Make sure the variable used in the condition
is actually updated.


7. Incorrect nested-loop reasoning

Remember:

outer iteration
→ complete inner loop
→ next outer iteration


LOOP MENTAL MODEL ⭐⭐⭐
--------------------------------------------------

Whenever you see a loop, ask:

1. Where does it start?
2. What is the condition?
3. When does it stop?
4. How does it change?
5. How many iterations?
6. What happens inside?
7. What is the time complexity?


LOOP CONTROL FLOW
--------------------------------------------------

FOR:

initialization
      ↓
condition
      ↓
false → END
      ↓ true
     body
      ↓
    update
      ↓
  condition


WHILE:

condition
    ↓
false → END
    ↓ true
   body
    ↓
  update
    ↓
condition


DO-WHILE:

body
 ↓
update
 ↓
condition
 ↓
true → body
 ↓
false
 ↓
END


IMPORTANT DSA LOOP PATTERNS ⭐⭐⭐
--------------------------------------------------

TRAVERSAL:

for (int i = 0; i < n; i++) {
}


REVERSE TRAVERSAL:

for (int i = n - 1; i >= 0; i--) {
}


COUNT:

int count = 0;

for (...) {
    if (condition) {
        count++;
    }
}


SUM:

int sum = 0;

for (...) {
    sum += value;
}


MAXIMUM:

int max = arr[0];

for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}


MINIMUM:

int min = arr[0];

for (int i = 1; i < arr.length; i++) {
    if (arr[i] < min) {
        min = arr[i];
    }
}


FILTER:

for (...) {
    if (condition) {
        // process
    }
}


NESTED TRAVERSAL:

for (...) {
    for (...) {
        // process
    }
}


LOOP TIME COMPLEXITY
--------------------------------------------------

One loop:

for (int i = 0; i < n; i++)

→ O(n)


Two independent loops:

for (...)
for (...)

→ O(n) + O(n)
→ O(n)


Nested loops:

for (...) {
    for (...) {
    }
}

→ O(n²)


Three nested loops:

→ O(n³)


Loop that halves/doubles:

for (int i = 1; i < n; i *= 2)

→ O(log n)


IMPORTANT:
--------------------------------------------------

Do not determine complexity only by counting
how many loops appear.

You need to understand how the loops interact.


FOR vs WHILE vs DO-WHILE
--------------------------------------------------

for
→ known/countable repetition


while
→ condition-controlled repetition


do-while
→ executes at least once


for-each
→ simple traversal of values


BREAK
→ stop loop


CONTINUE
→ skip current iteration


IMPORTANT INTERVIEW QUESTIONS ⭐⭐⭐
--------------------------------------------------

Q1. What is a loop?

A loop repeatedly executes a block of code while
a specified condition is satisfied.


Q2. What types of loops are available in Java?

→ for
→ while
→ do-while
→ enhanced for / for-each


Q3. What is the difference between for and while?

for is commonly used when initialization,
condition, and update form a clear iteration pattern.

while is commonly used when repetition is primarily
controlled by a condition.


Q4. What is the difference between while and do-while?

while checks the condition before execution.

do-while executes the body first and checks the
condition afterward.

Therefore, do-while executes at least once.


Q5. What is an infinite loop?

A loop that never terminates because its condition
never becomes false or because it is intentionally
written to run indefinitely.


Q6. What does break do?

break immediately terminates the nearest loop or
switch statement.


Q7. What does continue do?

continue skips the remaining statements of the
current loop iteration and proceeds to the next
iteration.


Q8. What is a nested loop?

A loop placed inside another loop.


Q9. What is the time complexity of two nested
loops, each running n times?

O(n²)


Q10. What is the time complexity of three nested
loops, each running n times?

O(n³)


Q11. What is the time complexity of two consecutive
loops, each running n times?

O(n)

Because:

O(n) + O(n)
→ O(2n)
→ O(n)


Q12. What is the output?

for (int i = 1; i <= 5; i++) {
    System.out.print(i + " ");
}

Answer:

1 2 3 4 5


Q13. What is the output?

for (int i = 5; i >= 1; i--) {
    System.out.print(i + " ");
}

Answer:

5 4 3 2 1


Q14. What happens here?

for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        break;
    }

    System.out.print(i + " ");
}

Answer:

1 2


Q15. What happens here?

for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.print(i + " ");
}

Answer:

1 2 4 5


Q16. Why can a while loop become infinite?

Usually because the condition never becomes false,
often because the variable controlling the condition
is not updated correctly.


Q17. What is an off-by-one error?

An error where a loop executes one time too many or
one time too few because of an incorrect boundary.


Q18. Why is i < arr.length commonly used for arrays?

Because valid indexes range from:

0 to arr.length - 1

Therefore:

i < arr.length

keeps the index within valid bounds.


Q19. What is the enhanced for loop?

It is Java's for-each syntax used to conveniently
iterate over elements of arrays and iterable
collections.


Q20. Can we use break in a nested loop?

Yes.

An ordinary break terminates the nearest enclosing
loop.


Q21. Can we use continue in a nested loop?

Yes.

It affects the nearest enclosing loop in which the
continue statement appears.


Q22. What is the difference between i++ and ++i?

Both increase i by 1.

The difference matters when the expression's value is
used as part of a larger expression.

As standalone loop updates:

i++
and
++i

produce the same iteration progression.


Q23. Can a for loop omit initialization, condition,
or update?

Yes.

Example:

int i = 1;

for (; i <= 5; ) {
    System.out.println(i);
    i++;
}


Q24. How can an infinite for loop be written?

for (;;) {
}

or:

while (true) {
}


Q25. Can loops be nested?

Yes.

Any loop can be placed inside another loop.


Q26. What is the main difference between for-each
and normal for?

Normal for gives direct access to the index.

For-each directly provides the current element.


Q27. Can a for-each loop traverse an array?

Yes.

Example:

for (int x : arr) {
    System.out.println(x);
}


Q28. How do you traverse a String using a loop?

for (int i = 0; i < s.length(); i++) {
    System.out.println(s.charAt(i));
}


Q29. How do you traverse an array?

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}


Q30. What is the difference between break and
return?

break exits the nearest loop or switch.

return exits the current method and optionally
returns a value.


OUTPUT PREDICTION CHECKLIST
--------------------------------------------------

When asked to find loop output:

1. Write the initial value.
2. Check the condition.
3. Execute the body.
4. Apply update.
5. Check condition again.
6. Repeat until false.


EXAMPLE:

for (int i = 1; i <= 5; i += 2) {
    System.out.print(i + " ");
}

Trace:

i = 1 → print 1
i = 3 → print 3
i = 5 → print 5
i = 7 → condition false

Output:

1 3 5


ONE-MINUTE REVISION
--------------------------------------------------

for
→ initialization + condition + update


while
→ condition first


do-while
→ body first


for-each
→ traverse values


break
→ stop loop


continue
→ skip current iteration


nested loop
→ loop inside loop


%
→ remainder


n % 2 == 0
→ even


n % 2 != 0
→ odd


n % 10
→ last digit


n / 10
→ remove last digit


arr.length
→ array size


s.length()
→ String length


One loop
→ O(n)


Two nested loops
→ O(n²)


Three nested loops
→ O(n³)


i *= 2
→ usually O(log n)


BEFORE MOVING TO THE NEXT TOPIC
--------------------------------------------------

You should be able to:

✓ Write for loops
✓ Write while loops
✓ Write do-while loops
✓ Use for-each
✓ Use break
✓ Use continue
✓ Write nested loops
✓ Trace loop execution
✓ Predict output
✓ Count iterations
✓ Calculate basic loop complexity
✓ Traverse arrays
✓ Traverse strings
✓ Find maximum/minimum
✓ Calculate sums/counts
✓ Manipulate digits
✓ Solve basic number problems
✓ Understand off-by-one errors

Most importantly:

Do not memorize loop patterns blindly.

For every loop, understand:

START
→ CONDITION
→ WORK
→ UPDATE
→ STOP

This becomes the foundation for Arrays,
Strings, Searching, Sorting, and DSA.