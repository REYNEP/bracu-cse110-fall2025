import java.util.Scanner;

public class a1q1 {
    public static void main(String[] argumentVec) {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.print("Time since lift-off in Minutes: ");
        long minutes = sc.nextLong();
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        long rem_days = days % 365;

        long m = minutes;
        long y = years;
        long rd = rem_days;
        System.out.println(m + " minutes is approximately " + y + " years and " + rd + " days");
        System.out.println("");
    }
}