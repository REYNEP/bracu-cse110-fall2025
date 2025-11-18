import java.util.Scanner;

public class a4q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Range Start (inclusive) (L): ");
        int l = sc.nextInt();
        System.out.print("Range   End (inclusive) (R): ");
        int r = sc.nextInt();


        System.out.println("List of all the Armstrong-Numbers in inclusive-Range(" + l + ", " + r + "): ");
        for (int i = l; i <= r; i++) 
        {
            if (i < 0) {continue;}
                // don't wanna do math on "negatives"

            int x = i;

            // Count digits
            int digits = 0;
            int tmp = x;
            while(true) {
                if (tmp == 0) break;

                tmp /= 10;
                digits++;
            }

            int sum = 0;

            // Extract digits in reverse
            int tmp2 = x;
            while(true) {
                if (tmp2 == 0) break;

                int extracted = tmp2 % 10;
                tmp2 /= 10;

                sum += Math.pow(extracted, digits);
            }

            if (sum == x) {System.out.println(x);};
        }
    }
}