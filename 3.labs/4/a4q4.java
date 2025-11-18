import java.util.Scanner;

public class a4q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Members: ");
        int m = sc.nextInt();

        for (int i = 1; i <= m; i++) 
        {
            System.out.print("Exercises for Member-" + i + ": ");
            int e = sc.nextInt();

            if (e > 3) {System.out.println("(Can't do more than 3 exercise)"); e = 3;}

            int rawSum = 0;
            double bonus = 0;
            boolean found_above_200 = false;
            for (int j = 1; j <= e; j++) 
            {
                System.out.print("Exercise-" + j + ": ");
                int x = sc.nextInt();

                rawSum += x;

                if (x > 350) bonus += x*0.5;
                if (x > 200) found_above_200 = true;
            }




            double avg_rawSum = rawSum/e;
            if (avg_rawSum > 400) {
                bonus += e*50;          // 50points for each excercise
            }

            double total = rawSum+bonus;
            double avg_total = total/e;

            if (found_above_200 == false) {
                avg_total *= 0.9;
            }

            System.out.println("Average calories earned per day for Member-" + i + ": " + avg_total);
        }
    }
}