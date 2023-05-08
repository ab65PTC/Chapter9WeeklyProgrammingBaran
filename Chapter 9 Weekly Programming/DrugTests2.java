import java.util.ArrayList;
import java.util.Collections;

public class DrugTests2 {
    public static void main(String[] args) {
        final int NUM_EMPLOYEES = 30;
        final int NUM_WEEKS = 52;

        // Initialize an array to keep track of the number of times each employee is selected
        int[] employeeCounts = new int[NUM_EMPLOYEES];

        // Initialize an array to keep track of the employees that were not selected for testing
        ArrayList<Integer> notSelected = new ArrayList<Integer>();
        for (int i = 1; i <= NUM_EMPLOYEES; i++) {
            notSelected.add(i);
        }

        // Randomly select an employee each week for the next 52 weeks
        for (int i = 1; i <= NUM_WEEKS; i++) {
            int testedEmployee = 1 + (int) (Math.random() * NUM_EMPLOYEES);
            employeeCounts[testedEmployee-1]++; // increment the count for the selected employee

            // Display the selected employee number
            System.out.print(testedEmployee + " ");

            // Remove the selected employee from the notSelected list
            notSelected.remove(Integer.valueOf(testedEmployee));

            // Display four employee numbers on each line
            if (i % 4 == 0) {
                System.out.println();
            }
        }

        // Display the number of times each employee is selected
        System.out.println("\nEmployee counts:");
        for (int i = 1; i <= NUM_EMPLOYEES; i++) {
            System.out.println(i + ": " + employeeCounts[i-1]);
        }

        // Display the employees that were not selected for testing
        System.out.println("Employees not selected:");
        for (Integer employee : notSelected) {
            System.out.print(employee + " ");
        }
    }
}
