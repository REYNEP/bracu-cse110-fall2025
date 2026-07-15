import java.util.Scanner;

public class evenoddseparator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Even-Odd Separator 3000!");
        System.out.println(
            "Enter a digit, and get two new digits with even and odd numbers separated!\n"
        );

        System.out.print("Enter digit: ");
        int number = scanner.nextInt();

        int temp = number;

        int currentdivisor = 1;
        while (temp != 0) {
            currentdivisor *= 10;
            temp /= 10;
        }

        int lastdivisor = 0;
        int evens = 0;
        int odds = 0;

        while (currentdivisor != 0) {
            int x =
                lastdivisor == 0
                    ? number / currentdivisor
                    : (number % lastdivisor) / currentdivisor;
            lastdivisor = currentdivisor;
            currentdivisor /= 10;

            if (x % 2 == 0) {
                evens = evens * 10 + x;
            } else {
                odds = odds * 10 + x;
            }
        }

        System.out.println(odds);
        System.out.println(evens);

        scanner.close();
    }
}
