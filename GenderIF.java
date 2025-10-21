import java.util.Scanner;

public class GenderIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your gender: ");
        String gender = scanner.nextLine();
        if (gender == "MALE" || gender == "M")
        System.out.println("Your gender is Male");
        else if (gender == "FEMALE" || gender == "F")
        System.out.println("Your gender is  Female");
        else
        System.out.println("Invalid gender input");
        scanner.close();
    }
}
