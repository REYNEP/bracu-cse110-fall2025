import java.util.Scanner;

public class midtermsummer26 {

    public static void main(String[] args) {
        /*
        Question (Set A, although its awkwardly similar to Set B):

        You have to basically chunk numbers from a given number, and determine if each chunk is a prime number or not,
        and keep a global counter of prime numbers. The chunks should be from left-to-right and should be based on the
        smallest divisor of the number of digits.

        To solve this problem:
        1. Count the digits:
        2. Determine the smallest divisor for the number of digits (e.g. if its a number with 8 digits, the smallest divisor is 2).
        2. Based on the smallest divisor that you've found just now:
            (i) Keep a mental model of the chunks. If its an 8-digit number and the smallest divisor is 2,
                each chunk will have exactly two digits, like this:
                12345678 -> 12 34 56 78
            (ii) Now just based on this mental model, make a loop which:
                - Gets each chunk.
                - Determines whether the number is a prime number of not.

        The actual question had allowed us to use Math.pow() and scanner.nextInt(), but I did not end up using the first one.
        Hence, this solution does NOT have any Math.pow() usages.
        */

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int temp = num;
        int digits = 0;

        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        int block = 0;
        for (int i = 2; i < digits; i++) {
            if (digits % i == 0) {
                block = i;
                break;
            }
        }
        if (block == 0) {
            block = 1;
        }

        int primes = 0;
        while (digits != 0) {
            int div = 1;
            for (int i = 1; i < digits; i++) {
                div *= 10;
            }
            int div2 = 1;
            for (int i = 1; i < block; i++) {
                div2 *= 10;
            }
            digits -= block;
            div /= div2;
            int segment = num / div;

            int divisors = 0;
            for (int i = 1; i <= segment; i++) {
                if (segment % i == 0) {
                    divisors++;
                }
            }
            if (divisors > 2) {
                System.out.println(segment + " is Not Prime");
            } else {
                System.out.println(segment + " is Prime");
                primes++;
            }
            num %= div;
        }

        System.out.println("Total Prime Numbers: " + primes);
        scanner.close();
    }
}
