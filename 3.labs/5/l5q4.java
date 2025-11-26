import java.util.Scanner;

public class l5q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //System.out.print("YES");

            int spaces = n-i;
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            int start = n-i+1;
            for (int j = start; j <= n; j++) {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}