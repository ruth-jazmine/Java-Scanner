import java.util.Scanner;
public class TernaryGender {
    public static void main(String[] args) {
        String genderDesc;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your gender (M/F): ");
        char genderCode = scanner.next().toUpperCase().charAt(0);
        if (genderCode == 'M' || genderCode == 'F' )
           genderDesc = (genderCode == 'M') ? "Your gender is Male" : "Your gender is Female";
        else
           genderDesc = "Invalid Input";
        System.out.println(genderDesc);
        scanner.close();
    }
}
