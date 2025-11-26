import java.util.Scanner;

/* So, I woke up & decided that, maybe i should try to make it better */
public class a5q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mid = (n/2);
        
        // upper_half
        for (int i = 1; i <= mid; i++) {
            for (int j = 1, lim = i-1;          j <= lim; j++) {System.out.print(" ");}
            for (int j = 1, lim = n-(2*(i-1));  j <= lim; j++) {System.out.print(j);}
            System.out.println();
        }

        // the line that has single '1' and some spaces
        if (n%2 == 1) {
            for (int j = 1, lim = mid;          j <= lim; j++) {System.out.print(" ");}
            System.out.println(1);
        }
        
        // reverse(upper_half)
        for (int i = mid; i > 0; i--) {
            for (int j = 1, lim = i-1;          j <= lim; j++) {System.out.print(" ");}
            for (int j = 1, lim = n-(2*(i-1));  j <= lim; j++) {System.out.print(j);}
            System.out.println();
        }
    }
}