// // Level-1 = Basic Loops

// // Print numbers
// public class LoopsPractice{
//     public static void main(String[] args){
//         for(int i=1;i<=10;i++){
//             System.out.print(i + " ");
//         }
//     }
// }


// // reverse counting
// public class LoopsPractice{
//     public static void main(String[] args){
//         for(int i=10;i>=1;i--){
//             System.out.print(i + " ");
//         }
//     }
// }


// // Even number
// public class LoopsPractice{
//     public static void main(String[] args){
//         for(int i=2;i<=50;i+=2){
//             System.out.print(i + " ");
//         }
//     }
// }


// // Odd number
// public class LoopsPractice{
//     public static void main(String[] args){
//         for(int i=1;i<=50;i+=2){
//             System.out.print(i + " ");
//         }
//     }
// }


// // Multiples
// public class LoopsPractice{
//     public static void main(String[] args){
//         for(int i=1;i<=100;i++){
//             System.out.println(5 * i);
//         }
//     }
// }


// // sum
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int N = sc.nextInt();
//         int sum=0;
//         for(int i=1;i<=N;i++){
//             sum+=i;
//         }
//         System.out.println(sum);
//         sc.close();
//     }
// }


// // Product
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int N = sc.nextInt();
//         int product=1;
//         for(int i=1;i<=N;i++){
//             product*=i;
//         }
//         System.out.println(product);
//         sc.close();
//     }
// }


// // square numbers
// public class LoopsPractice{
//     public static void main(String[] args){
//         for(int i=1;i<=10;i++){
//             System.out.println(i*i);
//         }
//     }
// }


// // Cube numbers
// public class LoopsPractice{
//     public static void main(String[] args){
//         for(int i=1;i<=10;i++){
//             System.out.println(i*i*i);
//         }
//     }
// }


// // Multiplication table
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int N = sc.nextInt();
//         for(int i=1;i<=N;i++){
//             System.out.println(5*i);
//         }
//         sc.close();
//     }
// }


// // Level-2 = Conditions + loops

// // Count even numbers
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int N = sc.nextInt();
//         int count=0;
//         for(int i=1;i<=N;i++){
//             if(i%2 == 0){
//                 count++;
//             }
//         }
//         System.out.println(count);
//         sc.close();
//     }
// }


// // Count odd numbers
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int N = sc.nextInt();
//         int count=0;
//         for(int i=1;i<=N;i++){
//             if(i%2 != 0){
//                 count++;
//             }
//         }
//         System.out.println(count);
//         sc.close();
//     }
// }


// // Sum of even numbers
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int N = sc.nextInt();
//         int sum=0;
//         for(int i=1;i<=N;i++){
//             if(i%2 == 0){
//                 sum += i;
//             }
//         }
//         System.out.println(sum);
//         sc.close();
//     }
// }


// // sum of odd numbers
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int N = sc.nextInt();
//         int sum=0;
//         for(int i=1;i<=N;i++){
//             if(i%2 != 0){
//                 sum += i;
//             }
//         }
//         System.out.println(sum);
//         sc.close();
//     }
// }


// // Divisible by 3
// public class LoopsPractice{
//     public static void main(String[] args){
//         for(int i=1;i<=100;i++){
//             if(i%3 == 0){
//                 System.out.println(i);
//             }
//         }
//     }
// }



// // divisible by 3 and 5
// public class LoopsPractice{
//     public static void main(String[] args){
//         for(int i=1;i<=100;i++){
//             if(i%3 == 0 && i%5 == 0){
//                 System.out.println(i);
//             }
//         }
//     }
// }


// // count numbers divisible by 3
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int N = sc.nextInt();
//         int count=0;
//         for(int i=1;i<=N;i++){
//             if(i%3 == 0){
//                 count++;
//             }
//         }
//         System.out.println(count);
//         sc.close();
//     }
// }


// // maximum of N numbers
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int N = sc.nextInt();
//         int max = Integer.MIN_VALUE;
//         for(int i=1;i<=N;i++){
//             int num = sc.nextInt();
//             if(num>max){
//                 max=num;
//             }
//         }
//         System.out.println(max);
//         sc.close();
//     }
// }


// // minimum of N numbers
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int N=sc.nextInt();
//         int min=Integer.MAX_VALUE;
//         for(int i=1;i<=N;i++){
//             int num=sc.nextInt();
//             if(num<min){
//                 min=num;
//             }
//         }
//         System.out.println(min);
//         sc.close();
//     }
// }


// Average
import java.util.Scanner;
public class LoopsPractice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum=0;
        for(int i=1;i<=N;i++){
            int num=sc.nextInt();
            sum += num;
        }
        int avg = sum/N;
        System.out.println(avg);
        sc.close();
    }
}