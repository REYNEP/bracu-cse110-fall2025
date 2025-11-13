import java.util.Scanner;

public class a3q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 5; i <= x; i += 5) {
            if (i%3 == 0) {continue;}

            System.out.println(i);
        }
    }
};