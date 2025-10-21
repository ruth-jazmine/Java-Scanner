import java.util.Scanner;

public class RelationIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is " + age);
        boolean senior = (age >= 60);
        System.out.println("Are you a senior citizen? " + senior);
        scanner.close();
    }
    
}
