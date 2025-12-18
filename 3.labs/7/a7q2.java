import java.util.Scanner;

public class a7q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. input N, Original Array
        System.out.print("N = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }


        // 2. search
        int     x         = sc.nextInt();  // we want to arr.find(x)
        boolean found     = false;
        int     found_idx = -1;

        for (int i = 0; i < n; i++) 
        {
            if (arr[i] == x) {
                found     = true;
                found_idx = i;
                break;
            }
        }

        // 3. print answer
        if (found == false) {System.out.println("Element not found");}
        else                {System.out.println(x + " is at index " + found_idx);}
    }
}