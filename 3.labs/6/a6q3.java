import java.util.Scanner;

public class a6q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Names of the spells: \n");
        String endMark = "stop";

        String longestSpell        = "";
        int    longestSpell_Points = 0;

        while(true) {
            String s = sc.nextLine();
            if (s.equals(endMark)) break;

            // We got a Spell. Loop over letters
            s = s.toUpperCase();
            String spell        = "";
            int    spell_points = 0;

            for (int i = 0, lim = s.length(); i < lim; i++) {
                char c = s.charAt(i);
                
                if (65 <= c && c <= 90) {
                    spell += c; 
                    spell_points += c;
                }
            }

            // Swap if length(spell) is larger
            if (longestSpell.length() < spell.length()) {
                longestSpell = spell;
                longestSpell_Points = spell_points;
            }
        }

        System.out.println("Largest Spell: " + longestSpell);
        System.out.println("Power Level: "   + longestSpell_Points);
    }
}