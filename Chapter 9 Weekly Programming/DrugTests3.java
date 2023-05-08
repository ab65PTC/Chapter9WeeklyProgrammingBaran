import java.util.Arrays;

public class DrugTests3 {
    public static void main(String[] args) {
        final int NUM_EMPLOYEES = 30;
        final int NUM_WEEKS = 52;

        int[] employeeCounts = new int[NUM_EMPLOYEES];
        boolean[] employeeSelected = new boolean[NUM_EMPLOYEES];
        Arrays.fill(employeeSelected, false);

        int lastEmployeeSelected = -1;

        for (int week = 1; week <= NUM_WEEKS; week++) {
            int testedEmployee;
            do {
                testedEmployee = (int) (Math.random() * NUM_EMPLOYEES);
            } while (testedEmployee == lastEmployeeSelected);
            
            if (lastEmployeeSelected == testedEmployee) {
                System.out.println("The same employee has been selected twice in a row. " +
                                   "Selecting a new employee for this week.");
            }
            
            lastEmployeeSelected = testedEmployee;
            employeeCounts[testedEmployee]++;
            employeeSelected[testedEmployee] = true;

            System.out.printf("Week %d: Employee %d\n", week, testedEmployee + 1);

            if (week % 4 == 0) {
                System.out.println();
            }
        }

        System.out.println("\nNumber of times each employee was selected:");
        for (int employee = 0; employee < NUM_EMPLOYEES; employee++) {
            System.out.printf("Employee %d: %d\n", employee + 1, employeeCounts[employee]);
        }

        System.out.println("\nEmployees never selected:");
        boolean allEmployeesSelected = true;
        for (int employee = 0; employee < NUM_EMPLOYEES; employee++) {
            if (!employeeSelected[employee]) {
                System.out.printf("%d ", employee + 1);
                allEmployeesSelected = false;
            }
        }
        if (allEmployeesSelected) {
            System.out.println("All employees were selected.");
        }
    }
}
