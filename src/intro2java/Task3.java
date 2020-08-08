package intro2java;

public class Task3 {

    //Display the max digit from a number

    public static void maxDigit(int number) {

        String numberAsString = String.valueOf(number);
        int help = Integer.MIN_VALUE;

        for (int i = 0; i <= numberAsString.length()-1; i++) {
            char c = numberAsString.charAt(i);
            int digit = Integer.parseInt(String.valueOf(c));
        if(digit > help){
            help=digit;
        }
        System.out.println(help);

        }

    }


    public static void main(String[] args) {

    new Task3().maxDigit(986410);
    }
}
