import java.util.Scanner;

public class a4q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int d = sc.nextInt();

        for (int i = 1; i <= d; i++) 
        {
            System.out.println("Enter sales for Day " + i + ": ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int sum = x+y+z;
            double tax = 0;
                 if (sum >= 500) tax = 0.10;
            else if (sum >= 200) tax = 0.05;
            else if (sum >= 100) tax = 0.02;
            else                 tax = 0;

            System.out.println("Day " + i + ": Total Sales with Tax: " + (sum*(1+tax)));
        }
    }
}