import java.util.Scanner;

public class numdle {

    public static void main(String[] args) {
        // This is the on-class challenge RKBM had given us to solve: "Wordle, but for numbers"
        //
        // The challenge is as follows:
        // It's basically a guessing game, but when you guess, it tells you any of these three for each number:
        //      1. Whether it is in the correct position, or
        //      2. Whether it exists in the number, but is in the wrong position, or
        //      3. Whether it doesn't exist at all.
        //
        // The number must be a 4-digit number.
        // The user only gets 3 chances to guess a 4-digit number.
        // YOU CANNOT USE BUILT-IN METHODS/LIBRARIES/FUNCTIONS.
        //
        // This solution is the in-class solution I had come up with, following with some modifications later down that same day.
        // I'll try to do a more "accurate" solution in numdle-accurate.java.
        //
        int answer = 4576;
        Scanner scanner = new Scanner(System.in);
        int chances = 3;

        int id1 = answer / 1000;
        int id2 = (answer % 1000) / 100;
        int id3 = (answer % 100) / 10;
        int id4 = answer % 10;
        boolean id1seen, id2seen, id3seen, id4seen;

        while (chances != 0) {
            id1seen = id2seen = id3seen = id4seen = false;
            System.out.println("Enter your 4-digit:");
            int guess = scanner.nextInt();

            int guessdupe = guess;
            int digits = 0;

            while (guessdupe != 0) {
                digits++;
                guessdupe /= 10;
            }

            if (digits > 4) {
                System.out.println("Only enter 4-digit numbers!");
                continue;
            }

            int currentdivisor = 1000;
            int lastdivisor = 0;

            int count = 1;
            int correctpos = 0;

            for (int i = 0; i < digits; i++) {
                int x;
                int y;
                if (lastdivisor == 0) {
                    x = answer / currentdivisor;
                    y = guess / currentdivisor;
                } else {
                    x = (answer % lastdivisor) / currentdivisor;
                    y = (guess % lastdivisor) / currentdivisor;
                }
                lastdivisor = currentdivisor;
                currentdivisor /= 10;

                if (x == y) {
                    System.out.println(y + " is in the correct position");

                    if (count == 1) {
                        id1seen = true;
                    } else if (count == 2) {
                        id2seen = true;
                    } else if (count == 3) {
                        id3seen = true;
                    } else {
                        id4seen = true;
                    }
                    correctpos += 1;
                } else if (
                    (y == id1 && !id1seen) ||
                    (y == id2 && !id2seen) ||
                    (y == id3 && !id3seen) ||
                    (y == id4 && !id4seen)
                ) {
                    System.out.println(
                        y + " is in the wrong position, but it exists"
                    );
                } else {
                    System.out.println(y + " does not exist");
                }
                count++;
            }

            if (correctpos == 4) {
                System.out.println("You win!");
                scanner.close();
                return;
            }

            chances--;
        }

        System.out.println("You lose.");

        scanner.close();
    }
}
