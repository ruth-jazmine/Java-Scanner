import java.util.Scanner;

public class RelationIf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is " + age);

        if (age >= 60)
        System.out.println("You are a senior citizen.");
        else
        System.out.println("You are not a senior citizen.");
        scanner.close();
    }
    
}
