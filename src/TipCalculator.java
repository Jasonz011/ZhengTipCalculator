import java.util.Scanner;
public class TipCalculator {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100):");
        double tipPercent = scan.nextDouble() / 100;
        scan.nextLine();

        double totalCost = 0;
        double cost = 0;
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            scan.nextLine();
            System.out.println("enter the ");
            if (cost != -1) {
            totalCost += cost;
            }
        }

        double costWithTip = tipPercent * totalCost + totalCost;
        System.out.println("----------------------------------");
        System.out.println("Total bill before tip: $" + totalCost);
        System.out.println("Total percentage : " + tipPercent * 100 + "%");
        System.out.println("Total tip: $" + tipPercent * totalCost);
        System.out.println("Total bill with tip : $" + costWithTip);
        System.out.println("Per person cost before tip : $" + totalCost/ people);
        System.out.println("Tip per person: $" + tipPercent * totalCost / people);
        System.out.println("Total cost per person: $" + (tipPercent * totalCost / people + totalCost / people));
        System.out.println("----------------------------------");
        System.out.println("Items ordered: ");
        while (items != 0) {
            System.out.println(item);
            items--;
        }
    }
}
