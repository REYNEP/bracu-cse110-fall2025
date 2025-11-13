import java.util.Scanner;

public class a3q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 600; i++) 
        {
            if      (i%7 == 0 && i%9 == 0) continue;
            else if (i%7 == 0) {sum += i;}
            else if (i%9 == 0) {sum += i;}
        }

        System.out.println(sum);
    }
}