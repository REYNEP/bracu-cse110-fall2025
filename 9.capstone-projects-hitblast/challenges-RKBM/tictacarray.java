// An iteration of tic tac toe
//
// Recommended to us by RKBM (probably almost within his teaching range unlike tictacmatrix.java)
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class tictacarray {

    public static int anyoneHasWon(int[] matrix) {
        int[][] winConditions = {
            { matrix[0], matrix[1], matrix[2] },
            { matrix[3], matrix[4], matrix[5] },
            { matrix[6], matrix[7], matrix[8] },
            { matrix[0], matrix[3], matrix[6] },
            { matrix[1], matrix[4], matrix[7] },
            { matrix[2], matrix[5], matrix[8] },
            { matrix[0], matrix[4], matrix[8] },
            { matrix[2], matrix[4], matrix[6] },
        };

        for (int[] conditionRow : winConditions) {
            if (
                conditionRow[0] == conditionRow[1] &&
                conditionRow[1] == conditionRow[2] &&
                conditionRow[0] != 0
            ) {
                return conditionRow[0];
            }
        }

        return 0;
    }

    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void drawMatrix(int[] matrix) {
        System.out.println();
        int lastrow = 0;

        for (int c = 0; c < matrix.length; c++) {
            int col = c % 3;

            if (lastrow == 2 && col == 0) {
                System.out.println();
            }

            final String RESET = "\u001B[0m";
            final String RED = "\u001B[91m"; // Bright red
            final String BLUE = "\u001B[34m"; // Blue
            final String DIM_GRAY = "\u001B[90m"; // Bright black (dim gray)

            if (matrix[c] == 1) {
                System.out.printf(BLUE + "O " + RESET);
            } else if (matrix[c] == 2) {
                System.out.printf(RED + "X " + RESET);
            } else {
                System.out.printf(DIM_GRAY + "- " + RESET);
            }
            lastrow = col;
        }
        System.out.println();
    }

    static String getFieldInput(Scanner scanner, String prompt)
        throws InterruptedException {
        String name = "";
        while (name.isBlank()) {
            clearTerminal();
            System.out.println(prompt);
            name = scanner.nextLine().trim();

            if (name.isBlank()) {
                System.out.println("Input cannot be empty!");
                Thread.sleep(2000);
            }
        }
        return name;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] matrix = new int[9];
        Arrays.fill(matrix, 0);

        int chances = 9;
        boolean someoneWon = false;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean isP1sTurn = random.nextBoolean();

        clearTerminal();
        System.out.println("Before starting... please enter your names:\n");
        Thread.sleep(2000);

        String playerOneName = getFieldInput(scanner, "Who is player 1?");
        String playerTwoName = getFieldInput(scanner, "Who is player 2?");

        while (true) {
            if (chances == 0 || someoneWon) {
                if (!someoneWon) {
                    System.out.println("\nMatch ends in a draw.");
                }
                System.out.println(
                    "Rematch? (n to stop, any key to continue):"
                );
                String shouldRematch = scanner.nextLine().trim().toLowerCase();

                if (shouldRematch.contains("n")) {
                    break;
                } else {
                    chances = 9;
                    Arrays.fill(matrix, 0);
                    if (someoneWon) someoneWon = false;
                }
            }

            clearTerminal();
            drawMatrix(matrix);

            System.out.println(
                (isP1sTurn ? playerOneName : playerTwoName) + "'s turn (1-9):"
            );
            int choice = scanner.nextInt() - 1;
            scanner.nextLine();

            if (matrix[choice] == 2 || matrix[choice] == 1) {
                System.out.println("Box is already ticked!");
                Thread.sleep(3000);
                continue;
            }

            matrix[choice] = isP1sTurn ? 1 : 2;
            isP1sTurn = !isP1sTurn;

            int winner = anyoneHasWon(matrix);

            if (winner != 0) {
                clearTerminal();
                drawMatrix(matrix);

                System.out.println(
                    (winner == 1 ? playerOneName : playerTwoName) + " has won!"
                );

                someoneWon = true;
                continue;
            }

            chances--;
        }

        scanner.close();
    }
}
