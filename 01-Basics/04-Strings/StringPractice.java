// Basics
// public class StringPractice {
//     public static void main(String[] args){
//         String s1="Tannu";
//         System.out.println(s1.length());
//         System.out.println(s1.charAt(0));
//         System.out.println(s1.charAt(s1.length()-1));
//         System.out.println(s1.toUpperCase());
//         System.out.println(s1.toLowerCase());
//     }
// }


// // Searching
// public class StringPractice{
//     public static void main(String[] args){
//         String s2="Hello World";
//         System.out.println(s2.contains("World"));
//         System.out.println(s2.indexOf('l'));
//         System.out.println(s2.lastIndexOf('l'));
//         System.out.println(s2.startsWith("Hello"));
//         System.out.println(s2.endsWith("World"));
//     }
// }


// // Modification
// public class StringPractice{
//     public static void main(String[] args){
//         String s3="hieee";
//         String s4="Tannu";
//         System.out.println(s3.replace('e','i'));
//         System.out.println(s3.trim());
//         System.out.println(s3.substring(0, 2));
//         System.out.println(s3.concat(s4));
//     }
// }


// // by adding new string, it creates new string object that's why x and y refers to different object
// public class StringPractice{
//     public static void main(String[] args){
//         String a = new String("Java");
//         String b = new String("Java");
//         System.out.println(a==b);
//         System.out.println(a.equals(b));
//     }
// }


// // StirngBuilder
// public class StringPractice{
//     public static void main(String[] args){
//         StringBuilder sb = new StringBuilder("Tannu");
//         sb.append("Sharma");
//         System.out.println(sb);
//         sb.insert(2, "n");
//         System.out.println(sb);
//         sb.delete(2,3);
//         System.out.println(sb);
//         sb.reverse();
//         System.out.println(sb);
//     }
// }


// coversion
public class StringPractice{
    public static void main(String[] args){
        String s = "123";
        int number=Integer.parseInt(s);
        System.out.println(number+10);
        String s1= String.valueOf(s);
        System.out.println(s1);
    }
}