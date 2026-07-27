import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lucky_Number = ");
        int lucky = scanner.nextInt();
        scanner.close();

        int x = 0;
        int y = 1;

        for (int count = 1; count < 20; count++) {
            if (x != 0 && x % lucky == 0) {
                System.out.println("Answer is " + x);
                return;
            }

            int z = x + y;
            x = y;
            y = z;
        }

        System.out.println("Game Over");
    }
}
