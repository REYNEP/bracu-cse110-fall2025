import java.util.Scanner;

public class a6q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String vowels_rev = "";

        for (int i = 0, lim = s.length(); i < lim; i++) {
            char c = s.charAt(i);

            // Switch was covered in syllabus "CHAPTER 7: DECISION MAKING" / bux Module 5: Branching
            switch (c) {
                case 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u' -> {
                    vowels_rev += c;
                }
            }
        }

        String ans = "";
        int k = vowels_rev.length()-1;

        for (int i = 0, lim = s.length(); i < lim; i++) {
            char c = s.charAt(i);

            switch (c) {
                case 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u' -> {
                    ans += vowels_rev.charAt(k);
                    k--;
                }
                default -> {
                    ans += c;
                }
            }
        }

        System.out.println(ans);
    }
}
