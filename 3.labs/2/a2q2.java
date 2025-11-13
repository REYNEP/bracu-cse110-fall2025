import java.util.Scanner;

public class a2q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Electricity Consumed: ");
        double e = sc.nextFloat();
        double bill = e*15;

        // Criteria 1
        if (age < 18) {
            bill = bill * 0.8;
        }
        else if (age > 60) {
            bill = bill * 0.9;
        }

        // Criteria 2
        if (e > 100) {
            bill = bill * 1.05;
        }

        System.out.println("Final Bill: " + bill + " Taka");
    }
}
