import java.util.Scanner;

public class GenderSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your gender: ");
        String gender = scanner.nextLine();

        switch (gender.toUpperCase()) {
            case "M":
            case "MALE":
            System.out.println("Your gender is Male");
            break;

            case "F":
            case "FEMALE":
            System.out.println("Your gender is Female");
            break;
    }
    scanner.close();
}
}
