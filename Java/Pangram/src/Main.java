import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        boolean isPangram = checkIfPangram(input);
        if (isPangram) {
            System.out.println("The input string is a pangram.");
        } else {
            System.out.println("The input string is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String input) {
        Set<Character> alphabetSet = new HashSet<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabetSet.add(ch);
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (alphabetSet.contains(ch)) {
                alphabetSet.remove(ch);
            }
            if (alphabetSet.isEmpty()) {
                return true;
            }
        }

        return false;
    }
}