import java.util.Scanner;

public class a3q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int N = sc.nextInt();

        int yesNegatives = 0;
        int nonNegatives = 0;
        for (int i = 1; i <= N; i++) {
            System.out.print("Enter number " + i + ": ");
            int K = sc.nextInt();

            if (K < 0) yesNegatives++;
            else       nonNegatives++;
        }

        System.out.println(nonNegatives + " Non-negative Numbers");
        System.out.println(yesNegatives + " Negative Numbers");
    }
}