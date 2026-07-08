// An iteration of tic tac toe
//
// Try tictacarray.java first as this is far beyond the scope of what the program actually might "need", and more about
// experimenting with multidimensional arrays with custom classes.
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

class Box {

    boolean isTickedByPlayer1;
    boolean isTickedByPlayer2;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Box b)) return false;

        return (
            isTickedByPlayer1 == b.isTickedByPlayer1 &&
            isTickedByPlayer2 == b.isTickedByPlayer2
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(isTickedByPlayer1, isTickedByPlayer2);
    }

    boolean isTicked() {
        return isTickedByPlayer1 || isTickedByPlayer2;
    }

    void tick1() {
        if (!isTickedByPlayer1) isTickedByPlayer1 = true;
    }

    void tick2() {
        if (!isTickedByPlayer2) isTickedByPlayer2 = true;
    }
}

class tictacmatrix {

    static final String RESET = "\u001B[0m";
    static final String RED = "\u001B[91m";
    static final String BLUE = "\u001B[34m";
    static final String DIM_GRAY = "\u001B[90m";

    static Box[][] getMatrix() {
        Box[][] matrix = new Box[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = getEmptyBox();
            }
        }

        return matrix;
    }

    static Box getEmptyBox() {
        Box box = new Box();
        box.isTickedByPlayer1 = false;
        box.isTickedByPlayer2 = false;
        return box;
    }

    static void drawMatrix(Box[][] matrix) {
        int idx = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                Box x = matrix[i][j];

                System.out.printf(
                    (x.isTicked()
                        ? x.isTickedByPlayer1
                            ? BLUE + "O "
                            : RED + "X "
                        : DIM_GRAY + idx + " ") + RESET
                );
                idx++;
            }

            System.out.println();
        }
    }

    static Box getWinner(Box[][] matrix) {
        Box[][] winConditions = {
            { matrix[0][0], matrix[0][1], matrix[0][2] },
            { matrix[1][0], matrix[1][1], matrix[1][2] },
            { matrix[2][0], matrix[2][1], matrix[2][2] },
            { matrix[0][0], matrix[1][0], matrix[2][0] },
            { matrix[0][1], matrix[1][1], matrix[2][1] },
            { matrix[0][2], matrix[1][2], matrix[2][2] },
            { matrix[0][0], matrix[1][1], matrix[2][2] },
            { matrix[0][2], matrix[1][1], matrix[2][0] },
        };

        for (Box[] row : winConditions) {
            if (
                row[0].equals(row[1]) &&
                row[1].equals(row[2]) &&
                (row[0].isTickedByPlayer1 || row[0].isTickedByPlayer2)
            ) {
                return row[0];
            }
        }

        return getEmptyBox();
    }

    static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void main(String[] args) throws InterruptedException {
        System.out.println("tictactoe\n");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Box[][] matrix = getMatrix();
        boolean isPlayer1sTurn = random.nextBoolean();
        int chances = 9;
        boolean someoneHasWon = false;

        while (true) {
            if ((!someoneHasWon && chances == 0) || someoneHasWon) {
                clearTerminal();
                drawMatrix(matrix);
                if (!someoneHasWon) {
                    System.out.println("Match ends in a draw.");
                }
                System.out.println("Rematch? (y/n)");
                String x = scanner.nextLine().trim().toLowerCase();

                if (x.contains("n")) {
                    break;
                } else if (x.contains("y")) {
                    chances = 9;
                    matrix = getMatrix();
                    if (someoneHasWon) someoneHasWon = false;
                } else {
                    System.out.println("Only y/n!");
                    continue;
                }
            }

            clearTerminal();
            drawMatrix(matrix);

            System.out.println(
                (isPlayer1sTurn ? "Player 1" : "Player 2") + "'s turn:"
            );

            int choice = scanner.nextInt();
            scanner.nextLine();

            int row;
            if (1 <= choice && choice <= 3) {
                row = 0;
            } else if (4 <= choice && choice <= 6) {
                row = 1;
            } else if (7 <= choice && choice <= 9) {
                row = 2;
            } else {
                System.out.println("Invalid input.");
                Thread.sleep(2000);
                continue;
            }

            int column = (choice - 1) % 3;

            Box b = matrix[row][column];
            if (b.isTicked()) {
                System.out.println("Box is already ticked!");
                Thread.sleep(2000);
                continue;
            }

            if (isPlayer1sTurn) {
                matrix[row][column].tick1();
            } else {
                matrix[row][column].tick2();
            }

            Box potentialWinner = getWinner(matrix);

            if (potentialWinner.isTicked()) {
                clearTerminal();
                drawMatrix(matrix);
                System.out.println(
                    (potentialWinner.isTickedByPlayer1
                        ? "Player 1"
                        : "Player 2") + " has won!"
                );
                Thread.sleep(3000);
                someoneHasWon = true;
                continue;
            }

            isPlayer1sTurn = !isPlayer1sTurn;
            chances--;
        }

        scanner.close();
    }
}
