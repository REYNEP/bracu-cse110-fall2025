import java.util.Scanner;

/* So, I tried to write this in a way, that I would in the Exam, where they ask you to do this on Pen+Paper */
public class a5q2_alt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // n = side length of 90deg IsoSceles Triangle

        // HardCode the First Line
        if (n >= 1) {
            for (int j = 1, lim = n-1; j <= lim; j++) {
                System.out.print(" ");
            }
            System.out.print(n);
            System.out.println();
        }

        for (int i = 2; i <= (n-1); i++) {
            int j = 1;
            for (int lim = n-i;      j <= lim; j++) {
                System.out.print(" ");
            }

            System.out.print(j); j++;
            
            for (int lim = n-1;      j <= lim; j++) {
                System.out.print(" ");
            }

            System.out.print(j);
            System.out.println();
        }

        // hardcoded the last line
        if (n >= 2) {
            for (int j = 1, lim = n-1; j <= lim; j++) {
                System.out.print(j);
            }
            System.out.print(n);
            System.out.println();
        }
    }
}