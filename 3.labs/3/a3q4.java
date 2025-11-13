import java.util.Scanner;

public class a3q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int tmp = x;
        while(true) {
            if (tmp == 0) break;

            int extracted = tmp % 10;
            tmp /= 10;

            System.out.print(extracted);

            if (tmp != 0) {
                System.out.print(", ");
            }
        }
    }
}