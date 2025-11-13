public class a1q5 {
    public static void main(String[] argumentVec) {
        double a = 4.5;                         // Triangle.Height
        double b = 9.5;                         // Triangle.Base
        double c = Math.sqrt((a*a) + (b*b));    // Triangle.Hypotenous
        
        System.out.println("");
        System.out.println("sin(A): " + a/c);
        System.out.println("cos(A): " + b/c);
        System.out.println("sin(B): " + b/c);
        System.out.println("cos(B): " + a/c);
        System.out.println("");
    }
}
