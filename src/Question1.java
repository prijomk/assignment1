//WAP to count the number of vowels and consonants in a given string
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String inputString = s.nextLine();
        count(inputString);
    }

    static void count(String st) {
        st = st.toLowerCase();
        int countv = 0;
        int countc = 0;

        for (int i = 0; i < st.length(); i++) {
            char b = st.charAt(i);

            if (Character.isLetter(b)) {
                if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u') {
                    countv++;
                } else {
                    countc++;
                }
            }
        }

        System.out.println("Total vowels number in word: " + countv);
        System.out.println("Total consonants number in word: " + countc);
    }
}

