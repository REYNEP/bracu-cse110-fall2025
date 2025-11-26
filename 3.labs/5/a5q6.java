import java.util.Scanner;

/* So, I woke up & decided that, maybe i should try to make it better */
public class a5q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Same as last question, only changed line 11
        for (int i = n; i >= 1; i--) {  
            for (int j = 1,   lim = n-i;    j <= lim; j++) {System.out.print(" ");}
            for (int j = 1,   lim = i;      j <= lim; j++) {System.out.print(j);}
            for (int j = i-1, lim = 1;      j >= lim; j--) {System.out.print(j);}
            System.out.println();
        }
    }
}