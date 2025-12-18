public class a6q6_tracing {  
    public static void main(String[] args) {
        int test = 1;
        int j = 0, k = 100;
        while (k > 0){   
            String s = "-->" + (k - 5) + "<--";
            while (j < k ){
                test = k - j + 11;
                s = 1 + test / 3 + s + 4 + 3;
                System.out.println(s);
                j += 10;
                s = "<--" + (j - 5) + test + "-->";
            }
            k -= 10;
        }
    }
}