import java.util.Scanner;

public class a6q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Fan Message: ");
        String s = sc.nextLine().toUpperCase();

        int MADRID_N = 0;
        int   CITY_N = 0;
        boolean found_CLOSE    = false;
        boolean found_DESTROY = false;

        for (int i = 0, lim = s.length()-3; i < lim; i++) {
            String tmp = "";

            tmp += s.charAt(i) + "" + s.charAt(i+1) + "" + s.charAt(i+2) + "" + s.charAt(i+3);
            if (tmp.equals("CITY")) CITY_N++; // We had turned the entire "Fan Message" UpperCase while taking input

            if (i+4 >= s.length()) continue;
            tmp += s.charAt(i+4);
            if (tmp.equals("CLOSE")) found_CLOSE = true;

            if (i+5 >= s.length()) continue;
            tmp += s.charAt(i+5);
            if (tmp.equals("MADRID")) MADRID_N++;

            if (i+6 >= s.length()) continue;
            tmp += s.charAt(i+6);
            if (tmp.equals("DESTROY")) found_DESTROY = true;
        }

             if (MADRID_N  > CITY_N) System.out.println("Madrid Supporter");
        else if (MADRID_N  < CITY_N) System.out.println("City Supporter");
        else if (MADRID_N == CITY_N) System.out.println("Neutral");

             if (found_CLOSE)       System.out.println("Fan expect a close match");
        else if (found_DESTROY)     System.out.println("Fan expects a dominating victory!");
        else                        System.out.println("Hard to read the fan sentiment");
    }
}
