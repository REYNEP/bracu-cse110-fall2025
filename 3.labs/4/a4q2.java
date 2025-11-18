import java.util.Scanner;

public class a4q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students to check: ");
        int s = sc.nextInt();

        for (int i = 1; i <= s; i++) 
        {
            System.out.print("Enter student ID: ");
            int x = sc.nextInt();

            boolean isLucky = true;
            while (x != 0) {
                if (x == 1) {break;}
                if (x%2 != 0) {isLucky = false; break;}
                x /= 2;
            }

            if (isLucky) {System.out.println("Lucky ID");}
            else         {System.out.println("Not Lucky");}
        }
    }
}