import java.util.Scanner;

public class a7q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 0;


        // 1. input arr1
        System.out.print("Please enter the length of array 1: ");
            k = sc.nextInt();

            int[] arr1 = new int[k];

            System.out.println("Please enter the elements of the arr1: ");
                for (int i = 0; i < k; i++) arr1[i] = sc.nextInt();



        // 2. input arr2
        System.out.print("Please enter the length of array 2: ");
            k = sc.nextInt();

            int[] arr2 = new int[k];

            System.out.println("Please enter the elements of the arr2: ");
                for (int i = 0; i < k; i++) arr2[i] = sc.nextInt();




        // 2. search
        boolean isSubArray = true;

        for (int j = 0; j < arr2.length; j++)           // Loop over arr2
        {
            int y = arr2[j];                            //        y ∈ arr2

            boolean found = false;
            for (int i = 0; i < arr1.length; i++) {     // check: y ∈ arr1
                int x = arr1[i];
                if (x == y) {found = true;}
            }

            if (found == false) {
                isSubArray = false;
                break;
            }
        }

        // 3. print answer
        if (isSubArray == true) System.out.println("Array 2 is a subset of Array 1.");
        else                    System.out.println("Array 2 is not a subset of Array 1.");
    }
}