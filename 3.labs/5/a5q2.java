import java.util.Scanner;

/* 
So, I tried to write this in a way, 
        that I would in the Exam, 
        where they ask you to do this on Pen+Paper 
*/
public class a5q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // n = side length of 90deg IsoSceles Triangle

        for (int i = 1; i <= n; i++) {
            int j = 1;
            for (int lim = n-i;      j <= lim; j++) {
                System.out.print(" ");
            }

            System.out.print(j);     j++;

            if (i == 1) {System.out.println(); continue;}

            for (int lim = n-1;      j <= lim; j++) {
                if (i != n) System.out.print(" ");
                else        System.out.print(j);
            }

            System.out.print(j);
            System.out.println();
        }
    }
}