import java.util.Scanner;

public class a3q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Energy (E): ");
        int E = sc.nextInt();
        
        System.out.print("Number of River (N): ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("Enter River Distance D" + i + ": ");
            int D = sc.nextInt();

            int cost = 0;
            if (D <= 5) {cost = 2;}
            else        {cost = D / 2;}

            E -= cost;

            if (E < 0) {
                System.out.println("Tired at River " + i);
                break;
            }
        }

        System.out.println("All Done");
        System.out.println(E + " energy Left");
    }
}