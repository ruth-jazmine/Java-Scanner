import java.util.Scanner;

public class RelationInput {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age =scanner.nextInt();
        System.out.println("Your age is " + age);
        
        if(age >= 18)
        System.out.println("You are qualified to vote.");
        else
        System.out.println("You are not qualified to vote.");
        scanner.close();
    }
    
}
