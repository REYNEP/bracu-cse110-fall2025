import java.util.Scanner;

public class a6q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Message: ");

        String s = sc.nextLine();
        int max = 0;

        for (int i = 0, lim = s.length(); i < lim; i++) 
        {
            if (i+1 >= lim) break;

            char c = s.charAt(i);
            char k = s.charAt(i+1);

            boolean y1 = false;
            boolean y2 = false;

            if ('0'<c && c<'9') y1 = true;
            if ('0'<k && k<'9') y2 = true;
            
            if (y1 && y2) {
                char z = '0';
                int num = (c-z)*10 + (k-z);
                if (max < num) {
                    max = num;
                }
            }
        }

        System.out.println("2-Digit PIN: " + max);
    }
}