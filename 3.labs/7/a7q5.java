public class a7q5 {
    public static void main(String[] args){
        int [] marks = {100, 47, 85, 94, 5, 50};
        String [] names = {"Henry", "Mari", "Herry", "Jack", "Lily", "Oliver"};


        int   [] arr        = marks;
        String[] attribute_1 = names;

        /** Bubble Sort */
        for     (int i = 0; i < arr.length; i++) {
            for (int j = 0;               ; j++) 
            {
                int l = j;
                int r = j+1;
                if (r >= arr.length) break;
                
                if (arr[l] > arr[r]) {          // if (left > right)
                    int tmp = arr[l];
                    arr[l]  = arr[r];
                    arr[r]  = tmp;

                    String   tmp_1 = attribute_1[l];
                    attribute_1[l] = attribute_1[r];
                    attribute_1[r] = tmp_1;
                }
            }
        }

        /** Insertion Sort
        for (int i = 0; i < arr.length; i++) 
        {
            int min_idx = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[min_idx] > arr[j])
                        min_idx = j;
            }

            // Swap them
            int tmp      = arr[i];
            arr[i]       = arr[min_idx];
            arr[min_idx] = tmp;

            String         tmp_1 = attribute_1[i];
            attribute_1[i]       = attribute_1[min_idx];
            attribute_1[min_idx] = tmp_1;
        }
        /* */

        // print
        System.out.println("Sorted Array: ");
            for (int i = 0; i < arr.length; i++) {System.out.print(arr[i] + " ");}
            System.out.println();
            for (int i = 0; i < arr.length; i++) {System.out.print(attribute_1[i] + " ");}
            System.out.println();
    }
}
