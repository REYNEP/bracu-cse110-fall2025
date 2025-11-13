import java.util.Scanner;

public class a3q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int sum = 1;
        for (int i = 2, lim = x/2; i <= lim; i++) 
        {
            if (x%i == 0) {
                sum += i;
            }
        }

        if (sum  > 1)   {System.out.println(x + " is not a prime number");}
        else            {System.out.println(x + " is     a prime number");}

        if (sum == x)   {System.out.println(x + " is     a perfect number");}
        else            {System.out.println(x + " is not a perfect number");}
    }
}