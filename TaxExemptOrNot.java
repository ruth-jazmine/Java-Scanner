import java.util.Scanner;

public class TaxExemptOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your annual salary: ");
        double salary = scanner .nextDouble();
        System.out.println("Exempted From Paying Tax? " + (salary < 180000));
        scanner.close();
    }
    
}
