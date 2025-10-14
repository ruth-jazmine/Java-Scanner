import java.util.Scanner;
public class JavaScanner {
  public static void main(String[] args) {
    int dozenprice = 60, pieceprice = 6;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Number of Dozen  : ");
    int dozen = scanner.nextInt();
    System.out.print("Enter Number of Pieces : ");
    int pieces = scanner.nextInt();
    
    int dozencost = dozen * dozenprice;
    int piececost = pieces * pieceprice;
    int total = dozencost + piececost;
    System.out.println("Total Bill : " + total);
    scanner.close();
  }
}