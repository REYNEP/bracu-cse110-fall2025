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
        int digits = 0;

        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        int currentdivisor = 1;
        for (int i = 1; i < digits; i++) {
            currentdivisor *= 10;
        }

        int tempcurdivisor = currentdivisor;
        int lastdivisor = 0;
        int evens = 0;
        int odds = 0;
        while (tempcurdivisor != 0) {
            int x =
                lastdivisor == 0
                    ? number / tempcurdivisor
                    : (number % lastdivisor) / tempcurdivisor;
            lastdivisor = tempcurdivisor;
            tempcurdivisor /= 10;

            if (x % 2 == 0) evens++;
            else odds++;
        }

        lastdivisor = 0;
        int evennumberwhole = 0;
        int oddnumberwhole = 0;
        while (currentdivisor != 0) {
            int x =
                lastdivisor == 0
                    ? number / currentdivisor
                    : (number % lastdivisor) / currentdivisor;
            lastdivisor = currentdivisor;
            currentdivisor /= 10;

            int pow = 1;
            boolean isEven = x % 2 == 0;

            for (int i = isEven ? evens : odds; i != 1; i--) {
                pow *= 10;
            }

            int y = x * pow;
            if (isEven) {
                evennumberwhole += y;
                evens--;
            } else {
                oddnumberwhole += y;
                odds--;
            }
        }

        System.out.println("Number with odd digits  : " + oddnumberwhole);
        System.out.println("Number with even digits : " + evennumberwhole);

        scanner.close();
    }
}
