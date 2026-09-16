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


// largest of three number
import java.util.Scanner;
public class ConditionalStatementPractice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest=(a>b)?(a>c?a:c):((b>c)?b:c);
        System.out.println("Largest of three numbers: " + largest);
        sc.close();
    }
}