public class DemoSalesperson2 {
    public static void main(String[] args) {
        Salesperson[] salesPeople = new Salesperson[10];

        int idNumber = 111;
        double salesAmount = 25000.0;

        for (int i = 0; i < salesPeople.length; i++) {
            salesPeople[i] = new Salesperson(idNumber, salesAmount);
            idNumber++;
            salesAmount += 5000.0;
        }

        for (int i = 0; i < salesPeople.length; i++) {
            System.out.println("Salesperson " + (i+1) + ": ID = " + salesPeople[i].getIdNumber() + ", Annual Sales = $" + salesPeople[i].getAnnualSales());
        }
    }
}
