package Assignment;

public class PangramChecker {
    public static boolean isPangram(String input) {
       
        boolean[] letters = new boolean[26];

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                letters[ch - 'a'] = true;
            }
        }

        for (boolean letter : letters) {
            if (!letter) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);
        System.out.println("Is it a pangram? " + isPangram);
    }
}
