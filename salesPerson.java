import java.util.Scanner;

public class salesPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize arrays to store sales data
        String[] salesPersonNames = new String[10];
        int[][] salesData = new int[10][5];
        int[] totalSales = new int[10];

        // Input sales data for each salesman and item
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salesman name: ");
            salesPersonNames[i] = scanner.nextLine();

            for (int j = 0; j < 5; j++) {
                System.out.print("Enter sales for item " + (j+1) + ": ");
                salesData[i][j] = scanner.nextInt();
                totalSales[i] += salesData[i][j];
            }
            scanner.nextLine(); // consume newline character
        }

        // Output sales data for each salesman
        System.out.println("Name\tItem1\tItem2\tItem3\tItem4\tItem5\tTotalSales");
        System.out.println("__________________________________________________________");
        for (int i = 0; i < 10; i++) {
            System.out.print(salesPersonNames[i] + "\t");
            for (int j = 0; j < 5; j++) {
                System.out.print(salesData[i][j] + "\t");
            }
            System.out.println(totalSales[i]);
        }
    }
}
