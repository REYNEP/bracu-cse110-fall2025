import java.util.Scanner;

/* 
So, I tried to write this in a way, 
        that I would in the Exam, 
        where they ask you to do this on Pen+Paper 
*/
public class a5q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // n = side length of rhombus

        for (int i = 1, lim2 = 2*n-1; i <= lim2; i++) { int k = i>n ? (n-i%n) : i;
            int j = 1;
            for (int lim = n-k;      j <= lim; j++) {
                System.out.print(" ");
            }

            System.out.print(1);     j = 2;
            
            if (k == 1) {System.out.println(); continue;}

            for (int lim = 2*k-2;    j <= lim; j++) {
                System.out.print(" ");
            }


            System.out.print(2*k-1);
            System.out.println();
        }
    }
}