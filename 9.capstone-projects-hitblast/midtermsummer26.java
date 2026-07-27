import java.util.Scanner;

public class midtermsummer26 {

    public static void main(String[] args) {
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
            // missed from here
            int div2 = 1;
            for (int i = 1; i < block; i++) {
                div2 *= 10;
            }
            // until here
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
