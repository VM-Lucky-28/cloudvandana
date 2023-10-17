import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        int decimal = romanToDecimal(romanNumeral);
        System.out.println(decimal);
    }

    public static int romanToDecimal(String romanNumeral) {
        HashMap<Character, Integer> romanNumeralMap = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int decimal = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char ch = romanNumeral.charAt(i);
            int currentValue = romanNumeralMap.get(ch);
            if (currentValue >= prevValue) {
                decimal += currentValue;
            } else {
                decimal -= currentValue;
            }
            prevValue = currentValue;
        }

        return decimal;
    }
}