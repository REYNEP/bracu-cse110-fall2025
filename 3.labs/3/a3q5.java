import java.util.Scanner;

public class a3q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // Count Digits
        int digits = 0;
        int tmp = x;
        while(true) {
            if (tmp == 0) break;

            tmp /= 10;
            digits++;
        }

        // build pow10
        int pow10 = 1;
        for (int i = 0, lim = digits-1; i < lim; i++) {pow10 *= 10;}

        // Extract & Print
        int div = pow10;
        int tmp2 = x;
        while(true) {
            if (div <= 0) break;

            int extracted = tmp2 / div;
            tmp2 = tmp2 % div;
            div /= 10;

            System.out.print(extracted + "... ");
        }
    }
}