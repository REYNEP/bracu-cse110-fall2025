public class a7q7_tracing {
    public static void main(String args[]){
        int [] myArray = new int[10];
        int [] b;
        
        int index1 = 0, index2 =0;
        index1 = 0;
        b =  myArray;

        while (index1 < 10) {
            myArray[index1] = index1 + 4;
            index2 = 1;

            while (index2 < index1 ) {
                myArray[index1] = b[index1] + myArray[index2] - index1;
                index2 = index2 + 1;
            }

            System.out.println(myArray[index1]);
            index1 = index1 + 1;
        }
    }
}
