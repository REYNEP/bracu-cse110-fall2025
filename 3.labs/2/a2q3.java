import java.util.Scanner;

public class a2q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        if      (x >= y && x >= z) {System.out.println("Maximum number is " + x);}
        else if (y >= x && y >= z) {System.out.println("Maximum number is " + y);}
        else if (z >= x && z >= y) {System.out.println("Maximum number is " + z);}

        if      (x <= y && x <= z) {System.out.println("Minimum number is " + x);}
        else if (y <= x && y <= z) {System.out.println("Minimum number is " + y);}
        else if (z <= x && z <= y) {System.out.println("Minimum number is " + z);}
    }
}
