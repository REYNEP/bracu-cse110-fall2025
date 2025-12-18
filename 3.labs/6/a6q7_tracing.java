public class a6q7_tracing {
       public static void main(String[] args) {
       String s = "CSE110";
       int count = 0;
       for (int i = 1; i < 3; i++) {
           for (int j = 0; j < 4; j++) {
               if (j == 2) {
                   continue;
               }
               s +="-" + (i*3.0) + ":" + (int)(j/2.0); 
                System.out.println(s);
               count++;
               if (count == 6) {
                   break;
               }
           }
           if (count == 6){
               break; 
           }
           if (i % 2 != 0) {
               s += "*";
           }
       }
   }
}
