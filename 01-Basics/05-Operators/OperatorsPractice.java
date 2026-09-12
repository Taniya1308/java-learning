// // Even or Odd number
// public class OperatorsPractice{
//     public static void main(String[] args){
//         int a = 20;
//         if(a % 2 == 0){
//             System.out.println("The even no. is:" + " " +  a);
//         }else{
//             System.out.println("The odd no. is:" + " " +  a);
//         }
//     }
// }


// // Positive, Negative or Zero
// public class OperatorsPractice{
//     public static void main(String[] args){
//         int b = 0;
//         if(b > 0){
//             System.out.println("The positive no. is: " + " " + b);
//         }else if(b < 0){
//             System.out.println("The negative no. is: " + " " + b);
//         }else{
//             System.out.println("The number is zero");
//         }
//     }
// }


// // Largest of Two Numbers
// public class OperatorsPractice{
//     public static void main(String[] args){
//         int a = 25;
//         int b = 35;
//         int result= a > b ? a : b;
//         System.out.println(result);
//     }
// }


// // Largest of Three Numbers
// public class OperatorsPractice{
//     public static void main(String[] args){
//         int a = 20;
//         int b = 35;
//         int c = 15;
//         int result = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
//         System.out.println(result);
//     }
// }

// // Simple Calculator
// public class OperatorsPractice{
//     public static void main(String[] args){
//         int a = 55;
//         int b = 25;
//         System.out.println(a + b);
//         System.out.println(a - b);
//         System.out.println(a * b);
//         System.out.println(a / b);
//         System.out.println(a % b);
//     }
// }


// // Age Eligibility
// public class OperatorsPractice{
//     public static void main(String[] args){
//         int age = 15;
//         if(age >= 18){
//             System.out.println("Eligible");
//         }else{
//             System.out.println("Not Eligible");
//         }
//     }
// }


// // Divisibility
// public class OperatorsPractice{
//     public static void main(String[] args){
//         int a = 15;
//         if(a % 3 == 0 && a % 5 ==0){
//             System.out.println("True");
//         }else{
//             System.out.println("False");
//         }
//     }
// }


// // Last Digit
// public class OperatorsPractice{
//     public static void main(String[] args){
//         int n=12345;
//         System.out.println(n % 10);
//     }
// }


// // Remove Last digit
// public class OperatorsPractice{
//     public static void main(String[] args){
//         int n=12345;
//         System.out.println(n/10);
//     }
// }


// Swap Two Numbers
public class OperatorsPractice{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}