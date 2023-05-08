public class DemoSalesperson {
    public static void main(String[] args) {
        Salesperson[] salesPeople = new Salesperson[10];

        for (int i = 0; i < salesPeople.length; i++) {
            salesPeople[i] = new Salesperson(9999, 0.0);
        }

        for (int i = 0; i < salesPeople.length; i++) {
            System.out.println("Salesperson " + (i+1) + ": ID = " + salesPeople[i].getIdNumber() + ", Annual Sales = " + salesPeople[i].getAnnualSales());
        }
    }
}