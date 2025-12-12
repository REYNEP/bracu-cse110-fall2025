import java.util.Scanner;

public class a6q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char space = ' ';
        String lastWord = "";
        for (int i = s.length()-1; i >= 0; i--) 
        {
            char c = s.charAt(i);
            if (c == space) {
                if (lastWord.length() == 0) continue;
                else break;
            }
            
            lastWord += c;
        }

        System.out.println(lastWord.length());
    }
}
