import java.util.*;

public class SalespersonDatabase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Salesperson[] database = new Salesperson[20];
        int size = 0;

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a record");
            System.out.println("2. Delete a record");
            System.out.println("3. Change a record");
            System.out.println("4. Quit");
            int choice = input.nextInt();

            if (choice == 1) {
                if (size == database.length) {
                    System.out.println("Error: database is full");
                } else {
                    System.out.print("Enter ID number: ");
                    int id = input.nextInt();
                    if (findRecord(database, id) != -1) {
                        System.out.println("Error: ID number already exists");
                    } else {
                        System.out.print("Enter sales value: ");
                        double sales = input.nextDouble();
                        database[size] = new Salesperson(id, sales);
                        size++;
                    }
                }
            } else if (choice == 2) {
                if (size == 0) {
                    System.out.println("Error: database is empty");
                } else {
                    System.out.print("Enter ID number: ");
                    int id = input.nextInt();
                    int index = findRecord(database, id);
                    if (index == -1) {
                        System.out.println("Error: ID number does not exist");
                    } else {
                        for (int i = index; i < size - 1; i++) {
                            database[i] = database[i + 1];
                        }
                        size--;
                    }
                }
            } else if (choice == 3) {
                if (size == 0) {
                    System.out.println("Error: database is empty");
                } else {
                    System.out.print("Enter ID number: ");
                    int id = input.nextInt();
                    int index = findRecord(database, id);
                    if (index == -1) {
                        System.out.println("Error: ID number does not exist");
                    } else {
                        System.out.print("Enter new sales value: ");
                        double sales = input.nextDouble();
                        database[index].setAnnualSales(sales);
                    }
                }
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Error: invalid choice");
            }

            sortDatabase(database, size);
            displayDatabase(database, size);
        }
    }

    public static int findRecord(Salesperson[] database, int id) {
        for (int i = 0; i < database.length; i++) {
            if (database[i] != null && database[i].getIdNumber() == id) {
                return i;
            }
        }
        return -1;
    }

    public static void sortDatabase(Salesperson[] database, int size) {
        Arrays.sort(database, 0, size, new Comparator<Salesperson>() {
            public int compare(Salesperson s1, Salesperson s2) {
                return s1.getIdNumber() - s2.getIdNumber();
            }
        });
    }

    public static void displayDatabase(Salesperson[] database, int size) {
        System.out.println("Salesperson database:");
        for (int i = 0; i < size; i++) {
            System.out.println(database[i]);
        }
        System.out.println();
    }
}
