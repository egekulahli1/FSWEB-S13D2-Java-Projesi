import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("-----------------------------------------");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(-11212));
        System.out.println("-----------------------------------------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("-----------------------------------------");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
        System.out.println("-----------------------------------------");

    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int newNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            newNumber = newNumber * 10 + digit;
            number = number/10;
        }

        return newNumber==originalNumber;
    }

    public static boolean isPerfectNumber(int p) {
        if (p < 0) {
            return false; // Numbers less than 1 are not considered perfect numbers
        }

        int sumOfDivisors = 0;

        for (int i = 1; i <= p / 2; i++) {
            if (p % i == 0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == p;
    }

    public static String numberToWords(int toBeWorded) {
        if (toBeWorded < 0) {
            return "Invalid Value";
        }

        String[] digitNames = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };
        String numberStr = Integer.toString(toBeWorded);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberStr.length(); i++) {
            char digitChar = numberStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            if (i > 0) {
                result.append(" ");
            }
            result.append(digitNames[digit]);
        }


        return result.toString();
    }




}