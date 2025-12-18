public class a7q6_tracing {
    public static void main(String args[]){
        int [] myArray = new int[10];
        int index1 = 0, index2 = 0;

        while (index1 < 10) {
            myArray[index1] = index1 + 3;
            index2 = 1;
            while (index2 < index1 ) {
                myArray[index1] = myArray[index1] + myArray[index2] - index1;
                index2 = index2 + 1;
            }
            System.out.println(myArray[index1]);
            index1 = index1 + 1;
        }
    }
}
