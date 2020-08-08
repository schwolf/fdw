package intro2java;

public class Task5 {

    // Display all the prime numbers lower than a given number

    public static boolean isPrime(int n) {

        int rest;


        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            rest = n % i;
            if (rest == 0) {
                return false;
            }
        }


        return true;
    }

    public void displayPrimeNumbers(int maxNumber) {
        for (int i = 0; i < maxNumber; i++) {

            boolean isPrime = isPrime(i);

            if (isPrime) {
                System.out.println(i + " is prime");
            }

        }
    }


    public static void main(String[] args) {

        new Task5().displayPrimeNumbers(77);
    }
}