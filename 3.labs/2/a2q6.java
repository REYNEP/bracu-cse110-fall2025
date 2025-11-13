import java.util.Scanner;

public class a2q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int x = sc.nextInt();

        System.out.print("Input the 2nd number: ");
        int y = sc.nextInt();
        
        System.out.print("Input the 3rd number: ");
        int z = sc.nextInt();

        if      ((x == y) && (y == z))              {System.out.println("All numbers are equal");}
        if      ((x != y) && (y != z) && (x != z))  {System.out.println("All numbers are different");}
        else                                        {System.out.println("Neither all are equal or different");}
    }
}
