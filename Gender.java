import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you gender : ");
        String gender = scanner.nextLine();
        boolean male = gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("MALE");

        System.out.println("Male Gender      : " + male);
        System.out.println("Female Gender    : " + !male);
        
        scanner.close();
    }
    
}
