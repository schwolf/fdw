package intro2java;

public class Task4 {

    // Check if a number is palindrom( e.g palindrom 1221, 34143)

    public static void checkPalindrome(int numberToBeChecked) {

        //int numberToBeChecked;

        String originalIntToString = String.valueOf(numberToBeChecked);
        String reverseNumber ="";

        for (int i = originalIntToString.length() - 1; i >= 0; i--) {
            char backDigit = originalIntToString.charAt(i);
            reverseNumber += Character.toString(backDigit);
        }
        int reverseToBeChecked = Integer.parseInt(reverseNumber);

        if (numberToBeChecked == reverseToBeChecked){
            System.out.println(numberToBeChecked + ":This number is a palindrome");
        }
        else {
            System.out.println(numberToBeChecked + ":This number is not a palindrome");
        }


    }



    public static void main(String[] args) {

        new Task4().checkPalindrome(3424);

    }
}

