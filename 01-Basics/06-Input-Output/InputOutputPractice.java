// Level-1 = Basic Input/Output
// Hello User
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter name: ");
//         String name = sc.nextLine();

//         System.out.println("Hello," + " " + name);
//         sc.close();
//     }
// }


// // Print an integer
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter age: ");
//         int age = sc.nextInt();

//         System.out.println("Age: " + age);
//         sc.close();
//     }
// }


// // Sum of two numbers
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = a + b;

//         System.out.println("Sum of Two Numbers: " + sum);
//         sc.close();
//     }
// }


// // Product of two numbers
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int product = a * b;

//         System.out.println("Product of Two Numbers: " + product);
//         sc.close();
//     }
// }


// // Basic Calculator
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter two numers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         System.out.println(a + b);
//         System.out.println(a - b);
//         System.out.println(a * b);
//         System.out.println(a / b);
//         System.out.println(a % b);

//         sc.close();
//     }
// }


// Level-2 = Input + operators
// // Area of Rectangle
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter length and width: ");
//         int length = sc.nextInt();
//         int width = sc.nextInt();

//         int area = length * width;

//         System.out.println("Area of Rectangle: " + area);
//         sc.close();
//     }
// }

// // Area of circle
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter radius of circle: ");
//         double radius = sc.nextInt();

//         double area = Math.PI * radius * radius;

//         System.out.println("Area of Circle: " + area);
//         sc.close();
//     }
// }


// // Celsius to Fahrenheit
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter temperature in Celsius: ");
//         double C = sc.nextDouble();

//         double F = (C * (9 / 5))+32;

//         System.out.println("Celsius to Farenheit: " + F);
//         sc.close();
//     }
// }


// // Average of three numbers
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Three numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         double average = (a+b+c)/3.0;

//         System.out.println("Average of three nos.: " + average);
//         sc.close();
//     }
// }


// // Simple interest
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter principal, rate and time: ");
//         int p = sc.nextInt();
//         int r = sc.nextInt();
//         int t = sc.nextInt();

//         int SI = (p * r * t)/100;

//         System.out.println("Simple Interest: " + SI);
//         sc.close();
//     }
// }


// Level-3 = Strings
// // Full name
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter first and last name: ");

//         String FirstName = sc.nextLine();
//         String LastName = sc.nextLine();

//         System.out.println("Full Name: " + FirstName + " " + LastName);
//         sc.close();
//     }
// }  


// // Character input
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a character as input: ");
//         char ch = sc.next().charAt(0);

//         System.out.println("Character: " + ch);
//         sc.close();
//     }
// }


// // String length
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a string: ");
//         String s = sc.nextLine();

//         System.out.println("String Length: " + s.length());
//         sc.close();
//     }
// }


// // First Character
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a string: ");
//         String s = sc.nextLine();

//         System.out.println("First character of string: " + s.charAt(0));
//         sc.close();
//     }
// }


// Level-4 = Output Formatting
// // Student Details
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter name, age, and marks: ");
//         String name = sc.nextLine();
//         int age = sc.nextInt();
//         double marks = sc.nextDouble();

//         System.out.println();
//         System.out.println("Student Details");
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Marks: " + marks);
//         sc.close();
//     }
// }


// // Formatted Price
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter price: ");
//         double price = sc.nextDouble();

//         System.out.printf("%.2f",price);
//         sc.close();
//     }
// }


// Level-5 = combined Practice
// // Even or odd
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter an integer: ");
//         int num = sc.nextInt();

//         if(num%2 == 0){
//             System.out.println("Even");
//         }else{
//             System.out.println("Odd");
//         }
//         sc.close();
//     }
// }


// // largest of two numbers
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int largest = (a>b) ? a : b;

//         System.out.println("Largest of two numbers is: " + largest);
//         sc.close();
//     }
// }


// // Largest of three numbers
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter three numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

//         System.out.println("Largest of three numbers: " + largest);
//         sc.close();
//     }
// }


// // Swap two numbers
// import java.util.Scanner;
// public class InputOutputPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         a = a + b;
//         b = a - b;
//         a = a - b;

//         System.out.println("Swapped number is: " + a + " " + b);
//         sc.close();
//     }
// }