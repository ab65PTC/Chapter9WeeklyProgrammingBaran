import java.util.Arrays;
import java.util.Scanner;

public class SalespersonSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Salesperson[] salesPeople = new Salesperson[7];

        for (int i = 0; i < salesPeople.length; i++) {
            System.out.println("Enter details for Salesperson " + (i+1) + ":");
            System.out.print("ID Number: ");
            int idNumber = input.nextInt();
            System.out.print("Annual Sales: $");
            double salesAmount = input.nextDouble();
            salesPeople[i] = new Salesperson(idNumber, salesAmount);
        }

        System.out.println("\nSort by: ");
        System.out.println("1. ID Number");
        System.out.println("2. Sales Value");

        int sortChoice = input.nextInt();

        if (sortChoice == 1) {
            Arrays.sort(salesPeople, (s1, s2) -> s1.getIdNumber() - s2.getIdNumber());
        } else if (sortChoice == 2) {
            Arrays.sort(salesPeople, (s1, s2) -> Double.compare(s1.getAnnualSales(), s2.getAnnualSales()));
        }

        System.out.println("\nSalesperson Details:");
        for (int i = 0; i < salesPeople.length; i++) {
            System.out.println("Salesperson " + (i+1) + ": ID = " + salesPeople[i].getIdNumber() + ", Annual Sales = $" + salesPeople[i].getAnnualSales());
        }
    }
}
