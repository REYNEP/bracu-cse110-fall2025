import java.util.Scanner;

public class a7q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. input N, Original Array
        System.out.print("N = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
            for (int i = 0; i < n; i++) {System.out.print(arr[i] + " ");}
            System.out.println();


        // 2. modify
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) ans[i] = 1;
            else            ans[i] = 0;
        }

        // 3. print modified
        System.out.println("After modifying: ");
            for (int i = 0; i < n; i++) {System.out.print(ans[i] + " ");}
            System.out.println();
    }
}