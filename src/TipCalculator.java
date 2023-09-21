import java.util.Scanner;
public class TipCalculator {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100):");
        int tipPercent = scan.nextInt();
        scan.nextLine();
        int cost = 0;
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextInt();
        }

    }
}
