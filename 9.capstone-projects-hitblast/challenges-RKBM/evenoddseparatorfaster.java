import java.util.Scanner;

public class evenoddseparatorfaster {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Even-Odd Separator 3000!");
        System.out.println(
            "Enter a digit, and get two new digits with even and odd numbers separated!\n"
        );

        System.out.print("Enter digit: ");
        int number = scanner.nextInt();

        int digits =
            number >= 1000000000
                ? 10
                : number >= 100000000
                  ? 9
                  : number >= 10000000
                    ? 8
                    : number >= 1000000
                      ? 7
                      : number >= 100000
                        ? 6
                        : number >= 10000
                          ? 5
                          : number >= 1000
                            ? 4
                            : number >= 100
                              ? 3
                              : number >= 10
                                ? 2
                                : 1;

        int currentdivisor =
            digits == 1
                ? 1
                : digits == 2
                  ? 10
                  : digits == 3
                    ? 100
                    : digits == 4
                      ? 1000
                      : digits == 5
                        ? 10000
                        : digits == 6
                          ? 100000
                          : digits == 7
                            ? 1000000
                            : digits == 8
                              ? 10000000
                              : digits == 9
                                ? 100000000
                                : digits == 10
                                  ? 1000000000
                                  : 1;

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
