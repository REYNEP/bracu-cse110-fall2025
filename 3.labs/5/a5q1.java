import java.util.Scanner;

public class a5q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // n = side length of rhombus

        for (int i = 1; i <= n; i++) {
            for (int j = 1, lim = n-i;      j <= lim; j++) {
                System.out.print(" ");
            }

            for (int j = 1, lim = 2*i-1;    j <= lim; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 1; i <= n-1; i++) {
            for (int j = 1, lim = i;            j <= lim; j++) {
                System.out.print(" ");
            }

            for (int j = 1, lim = 2*(n-i)-1;    j <= lim; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}