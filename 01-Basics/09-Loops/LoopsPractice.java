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


// // Average
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int sum=0;
//         for(int i=1;i<=N;i++){
//             int num=sc.nextInt();
//             sum += num;
//         }
//         int avg = sum/N;
//         System.out.println(avg);
//         sc.close();
//     }
// }


// Level-3 = Digit-Based Questions

// // count digits
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int count=0;
//         while(N>0){
//             count++;
//             N = N/10;
//         }
//         System.out.println(count);
//         sc.close();
//     }
// }


// // Sum of digits
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int sum = 0;
//         while(N>0){
//             sum += N%10;
//             N=N/10;
//         }
//         System.out.println(sum);
//         sc.close();
//     }
// }


// // Product of digits
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int product=1;
//         while(N>0){
//             product *= N%10;
//             N=N/10;
//         }
//         System.out.println(product);
//         sc.close();
//     }
// }


// // Reverse a number
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int reverse=0;
//         while(N>0){
//             int d = N % 10;
//             reverse = (reverse*10) + d;
//             N = N / 10;
//         }
//         System.out.println(reverse);
//         sc.close();
//     }
// }


// // First Digit
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         while(N>=10){
//             N=N/10;
//         }
//         System.out.println(N);
//         sc.close();
//     }
// }


// // Last digit
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         while(N>=10){
//             N = N%10;
//         }
//         System.out.println(N);
//         sc.close();
//     }
// }


// // Count even digit
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int count=0;
//         while(n>0){
//             int digit=n%10;
//             if(digit%2 == 0){
//                 count++;
//             }
//             n = n/10;
//         }
//         System.out.println(count);
//         sc.close();
//     }
// }


// // count odd digits
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int count=0;
//         while(n>0){
//             int digit=n%10;
//             if(digit%2 != 0){
//                 count++;
//             }
//             n=n/10;
//         }
//         System.out.println(count);
//         sc.close();
//     }
// }


// // Largest digit
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         int max = Integer.MIN_VALUE;
//         while(n>0){
//             int digit=n%10;
//             if(digit>max){
//                 max=digit;
//             }
//             n=n/10;
//         }
//         System.out.println(max);
//         sc.close();
//     }
// }


// // Smallest digit
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         int min = Integer.MAX_VALUE;
//         while(n>0){
//             int digit=n%10;
//             if(digit<min){
//                 min=digit;
//             }
//             n=n/10;
//         }
//         System.out.println(min);
//         sc.close();
//     }
// }


// Level-4 = Numbers problems

// // check palindrome number
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         int temp=n;
//         int rev=0;
//         while(n>0){
//             int d = n%10;
//             rev = (rev*10)+d;
//             n=n/10;
//         }
//         if(rev == temp){
//             System.out.println("Palindrome");
//         }else{
//             System.out.println("Not Palindrome");
//         }
//         sc.close();
//     }
// }


// // count frequency of a digit
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         int digit = sc.nextInt();
//         int count=0;
//         while(n>0){
//             int d=n%10;
//             if(d == digit){
//                 count++;
//             }
//             n=n/10;
//         }
//         System.out.println(count);
//         sc.close();
//     }
// }


// // check prime number
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         boolean isPrime = true;
//         if(n<=1){
//             isPrime=false;
//         }else{
//             for(int i=2;i<n;i++){
//                 if(n%i == 0){
//                     isPrime=false;
//                     break;
//                 }
//             }
//         }
//         if(isPrime){
//             System.out.println("Prime");
//         }else{
//             System.out.println("Not Prime");
//         }
//         sc.close();
//     }
// }


// // print all prime numbers
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         for(int num=2;num<=n;num++){
//             boolean isPrime=true;
//             for(int i=2;i<num;i++){
//                 if(num%i == 0){
//                     isPrime=false;
//                     break;
//                 }
//             }
//             if(isPrime){
//                 System.out.println(num + " ");
//             }
//         }
//         sc.close();
//     }
// }


// // count prime numbers
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int count=0;
//         for(int num=2;num<=n;num++){
//             boolean isPrime=true;
//             for(int i=2;i<num;i++){
//                 if(num%i == 0){
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if(isPrime){
//                 count++;
//             }
//         }
//         System.out.println(count);
//         sc.close();
//     }
// }


// // factorial
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int fact=1;
//         for(int i=1;i<=n;i++){
//             fact *= i;
//         }
//         System.out.println(fact);
//         sc.close();
//     }
// }


// // factors of a number
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             if(n%i == 0){
//                 System.out.println(i + " ");
//             }
//         }
//         sc.close();
//     }
// }


// // count factors
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int count=0;
//         for(int i=1;i<=n;i++){
//             if(n%i == 0){
//                 count++;
//             }
//         }
//         System.out.println(count);
//         sc.close();
//     }
// }


// // perfect number = A perfect number that is equal to the sum of all its proper divisors.
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum=0;
//         for(int i=1;i<n;i++){
//             if(n%i == 0){
//                 sum+=i;
//             }
//         }
//         if(sum == n){
//             System.out.println("Perfect Number");
//         }else{
//             System.out.println("Not Perfect Number");
//         }
//         sc.close();
//     }
// }


// // Armstrong number
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int temp=n;
//         int sum=0;
//         while(n>0){
//             int d = n%10;
//             sum+=(d*d*d);
//             n=n/10;
//         }
//         if(sum == temp){
//             System.out.println("Palindrome number");
//         }else{
//             System.out.println("Not Palindrome number");
//         }
//         sc.close();
//     }
// }


// Level-5 = Break and continue

// // stop at 7
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             if(i==7){
//                 break;
//             }
//             System.out.println(i+" ");
//         }
//         sc.close();
//     }
// }


// // skip multiples of 3
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             if(i%3 == 0){
//                 continue;
//             }
//             System.out.println(i + " ");
//         }
//         sc.close();
//     }
// }


// // first multiple of 7
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             if(i%7 == 0){
//                 break;
//             }
//             System.out.println(i+" ");
//         }
//         sc.close();
//     }
// }


// // search a number
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int target = sc.nextInt();
//         boolean found=false;
//         for(int i=0;i<n;i++){
//             int num=sc.nextInt();
//             if(num == target){
//                 found=true;
//                 break;
//             }
//         }
//         if(found){
//             System.out.println("Found");
//         }else{
//             System.out.println("Not Found");
//         }
//         sc.close();
//     }
// }


// // skip negative number
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){
//             int num=sc.nextInt();
//             if(num<0){
//                 continue;
//             }
//             System.out.println(num + " ");
//         }
//         sc.close();
//     }
// }


// Level-6 = Nested loops

// // print rectangle
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//         sc.close();
//     }
// }


// // square pattern
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//         sc.close();
//     }
// }


// // increasing triangle
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//         sc.close();
//     }
// }


// // numbered triangle
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println(" ");
//         }
//         sc.close();
//     }
// }


// // repeated number triangle
// import java.util.Scanner;
// public class LoopsPractice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i);
//             }
//             System.out.println(" ");
//         }
//         sc.close();
//     }
// }


// reverse triangle
import java.util.Scanner;
public class LoopsPractice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}