import java.util.Scanner;

public class LessThan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Is number " + number + " less than 10? " + (number<10));
        scanner.close();
    }
    
}
