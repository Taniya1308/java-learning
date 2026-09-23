// Level-1 = Basic
// // Positive/Negative
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter an integer: ");
//         int x = sc.nextInt();

//         if(x>0){
//             System.out.println("Positive");
//         }else if(x==0){
//             System.out.println("Zero");
//         }else{
//             System.out.println("Negative");
//         }
//         sc.close();
//     }
// }


// // Even/Odd
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no.: ");
//         int num = sc.nextInt();
//         if(num%2 == 0){
//             System.out.println("Even");
//         }else{
//             System.out.println("Odd");
//         }
//         sc.close();
//     }
// }


// // Eligible to vote
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter age: ");
//         int age = sc.nextInt();

//         if(age>=18){
//             System.out.println("Eligible");
//         }else{
//             System.out.println("Not Eligible");
//         }
//         sc.close();
//     }
// }


// // Greater of two numbers
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int result = (a>b)?a:b;
//         System.out.println(result);
//         sc.close();
//     }
// }


// // Equal or not
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if(a == b){
//             System.out.println("Equal");
//         }else{
//             System.out.println("Not Equal");
//         }
//         sc.close();
//     }
// }


// Level-2 = else-if
// // Grade Calculator
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter marks: ");
//         int marks = sc.nextInt();
        
//         if(marks>=90 && marks<=100){
//             System.out.println("A");
//         }else if(marks>=80 && marks<90){
//             System.out.println("B");
//         }else if(marks>=70 && marks<80){
//             System.out.println("C");
//         }else if(marks>=60 && marks<70){
//             System.out.println("D");
//         }else{
//             System.out.println("F");
//         }
//         sc.close();
//     }
// }


// // largest of three number
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter three numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         int largest=(a>b)?(a>c?a:c):((b>c)?b:c);
//         System.out.println("Largest of three numbers: " + largest);
//         sc.close();
//     }
// }


// // Leap Year
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a year: ");
//         int year = sc.nextInt();
//         if(year % 400==0 || year % 4 == 0 && year % 100 != 0){
//             System.out.println("Leap year: " + year);
//         }else{
//             System.out.println("Not a Leap Year: " + year);
//         }
//         sc.close();
//     }
// }


// // character type
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a character: ");
//         char ch = sc.next().charAt(0);
//         if(Character.isUpperCase(ch)){
//             System.out.println("Uppercase");
//         }else if(Character.isLowerCase(ch)){
//             System.out.println("Lowercase");
//         }else if(Character.isDigit(ch)){
//             System.out.println("Digits");
//         }else{
//             System.out.println("Special character");
//         }
//         sc.close();
//     }
// }


// // Electricity Bill
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter bill unit: ");
//         int units = sc.nextInt();
//         int bill = 0;
//         if(units>=0 && units<=100){
//             bill = units * 5;
//         }else if(units>100 && units<=200){
//             bill = (100*5) + (units-100)*7;
//         }else{
//             bill = (100*5) + (100*7) + (units-200) * 10;
//         }
//         System.out.println("The Bill is: " + bill);
//         sc.close();
//     }
// }

// // check whether a number lies between 10 and 50 inclusive
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int n = sc.nextInt();
//         if(n>=10 && n<=50){
//             System.out.println("Yes, Number lies between 10 and 50: " + n);
//         }else{
//             System.out.println("Number not lies between 10 and 50");
//         }
//         sc.close();
//     }
// }


// // check whether a person is eligible 
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter age and hasLicense: ");
//         int age = sc.nextInt();
//         boolean hasLicensed = sc.nextBoolean();
//         if(age>=18 && hasLicensed==true){
//             System.out.println("Yes, Person is eligible");
//         }else{
//             System.out.println("Not eligible");
//         }
//         sc.close();
//     }
// }


// // check whether a number is divisible by both 3 and 5
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = sc.nextInt();
//         if(num%3 == 0 && num%5 == 0){
//             System.out.println("Yes, divisible by both 3 and 5");
//         }else{
//             System.out.println("Not divisible by 3 and 5");
//         }
//         sc.close();
//     }
// }


// // check whether a number is divisible by either 3 or 5import java.util.Scanner;
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = sc.nextInt();
//         if(num%3 == 0 || num%5 == 0){
//             System.out.println("Yes, divisible by both 3 and 5");
//         }else{
//             System.out.println("Not divisible by 3 and 5");
//         }
//         sc.close();
//     }
// }


// // check whether a character is a vowel
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//          System.out.println("Enter a character: ");
//          char ch = sc.next().charAt(0);
//          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
//             System.out.println("Character is a vowel: " + ch);
//          }else{
//             System.out.println("Not a vowel");
//          }
//         sc.close();
//     }
// }

// // Input a number from 1-7 and print corresponding day
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter day: ");
//         int day = sc.nextInt();
//         switch(day){
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thrusday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid choice");
//         }
//         sc.close();
//     }
// }


// // Create a calculator using switch
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two number: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int operator = sc.next().charAt(0);
//         int result=0;
//         switch(operator){
//             case '+':
//                 result = a + b;
//                 System.out.println(result);
//                 break;
//             case '-':
//                 result = a - b;
//                 System.out.println(result);
//                 break;
//             case '*':
//                 result = a * b;
//                 System.out.println(result);
//                 break;
//             case '/':
//                 if(b!=0){
//                     result = a / b;
//                     System.out.println(result);
//                 }else{
//                     System.out.println("Division by zero error");
//                     break;
//                 }
//             case '%':
//                 result = a % b;
//                 System.out.println(result);
//                 break;
//             default:
//                 System.out.println("Invalid choice");
//         }
//         sc.close();
//     }
// }


// // input month number and print the month name
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter month number: ");
//         int num = sc.nextInt();
//         switch(num){
//             case 1:
//                 System.out.println("Janurary");
//                 break;
//             case 2:
//                 System.out.println("Feburary");
//                 break;
//             case 3:
//                 System.out.println("March");
//                 break;
//             case 4:
//                 System.out.println("April");
//                 break;
//             case 5:
//                 System.out.println("May");
//                 break;
//             case 6:
//                 System.out.println("June");
//                 break;
//             case 7:
//                 System.out.println("July");
//                 break;
//             case 8:
//                 System.out.println("August");
//                 break;
//             case 9:
//                 System.out.println("September");
//                 break;
//             case 10:
//                 System.out.println("October");
//                 break;
//             case 11:
//                 System.out.println("November");
//                 break;
//             case 12:
//                 System.out.println("December8");
//                 break;
//         }
//         sc.close();
//     }
// }


// // input a character
// import java.util.Scanner;
// public class ConditionalStatementPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a character: ");
//         char ch = sc.next().charAt(0);
//         switch(ch){
//             case 'A':
//                 System.out.println("Apple");
//                 break;
//             case 'B':
//                 System.out.println("Banana");
//                 break;
//             case 'C':
//                 System.out.println("Cat");
//                 break;
//             default:
//                 System.out.println("Invalid Choice");
//         }
//         sc.close();
//     }
// }