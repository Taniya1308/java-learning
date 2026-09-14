import java.util.Scanner;
public class InputOutputExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Enter marks: ");
        double marks = sc.nextDouble();

        System.out.println();
        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        sc.close();
    }
}