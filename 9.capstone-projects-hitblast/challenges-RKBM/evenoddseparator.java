import java.util.Scanner;

public class evenoddseparator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number to separate: ");
        int number = scanner.nextInt();

        int evens = 0;
        int odds = 0;
        int evencount = 1;
        int oddcount = 1;

        while (number != 0) {
            int x = number % 10;

            if (x % 2 == 0) {
                evens += x * evencount;
                evencount *= 10;
            } else {
                odds += x * oddcount;
                oddcount *= 10;
            }

            number /= 10;
        }

        System.out.println(odds);
        System.out.println(evens);

        scanner.close();
    }
}
