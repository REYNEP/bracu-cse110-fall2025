import java.util.Scanner;

public class a7q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. input N, Original Array
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();

        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }


        // 2. search
        double max     = arr[0];
        double min     = arr[0];
        int    max_idx = 0;
        int    min_idx = 0;
        double sum     = 0;
        double avg     = 0;
       
        for (int i = 0; i < n; i++) 
        {
            double x = arr[i];
            sum += x;

            if (max < x) {
                max = x;
                max_idx = i;
            }

            if (min > x) {
                min = x;
                min_idx = i;
            }
        }

        avg = sum/arr.length;

        // 3. print answer
        System.out.println("Maximum element " + max + " is at index " + max_idx);
        System.out.println("Minimum element " + min + " is at index " + min_idx);
        System.out.println("Summation: " + sum);
        System.out.println("Average: " + avg);
    }
}