import java.util.Scanner;

public class a2q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the amount the customer need to pay(Taka)");
        int t = sc.nextInt();       // Total

        System.out.println("Enter the amount, customer gave(Taka)");
        int p = sc.nextInt();       // Paid

        // Criteria 1
        if      (p == t) {System.out.println("The returned amount is 0 taka.");}
        else if (p  < t) {System.out.println("Please pay " + (t-p) + " taka more.");}
        else {
            int returned = p-t;
            System.out.println("The returned amount is " + returned + " taka.");

            System.out.println("100 taka note: " + returned/100);
            returned %= 100;

            System.out.println("50 taka note: " + returned/50);
            returned %= 50;

            System.out.println("20 taka note: " + returned/20);
            returned %= 20;

            System.out.println("10 taka note: " + returned/10);
            returned %= 10;

            System.out.println("5 taka note: " + returned/5);
            returned %= 5;

            System.out.println("2 taka note: " + returned/2);
            returned %= 2;

            System.out.println("1 taka note: " + returned/1);
            returned %= 1;
        }
    }
}
