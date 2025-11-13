import java.util.Scanner;

public class a3q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter number of Herbs (H): ");
        int nHerbs = sc.nextInt();
        
        System.out.print("Please Enter number of Crystals (C): ");
        int nCrystals = sc.nextInt();

        int i = 0;
        while(true) {
            if (nHerbs < 2) {break;}
            if (nCrystals < 2) {break;}

            nHerbs -= 3;
            nCrystals -= 2;
            i++;
            System.out.println("Potion-" + i + " created");
            System.out.println("Remaining Herbs: " + nHerbs + ", Remaining Crystals: " + nCrystals);
        }

        System.out.println("Potions Created: " + i);
        if (i%2 == 0)   {System.out.println("Stable Brew");}
        else            {System.out.println("Volatile Elixir");}
    }
}