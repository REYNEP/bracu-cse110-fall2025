import java.util.Scanner;

public class divmodnoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dividend = scanner.nextInt();
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Division with 0 not allowed!");
            scanner.close();
            return;
        }

        int a = dividend;
        int b = divisor;
        boolean negativeResult = false;

        if (a < 0) {
            a = -a;
            negativeResult = !negativeResult;
        }
        if (b < 0) {
            b = -b;
            negativeResult = !negativeResult;
        }

        int quotient = 0;
        int remainder = a;

        while (remainder >= b) {
            remainder -= b;
            quotient++;
        }

        if (negativeResult) {
            quotient = -quotient;
        }
        if (dividend < 0) {
            remainder = -remainder;
        }

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        scanner.close();
    }
}
