package intro2java;



public class Task1 {

    // Calculate the sum of the first 100 numbers higher than 0

    public static class SumOfHundred {
        public void calc () {

            int nr = 100;
            int sumNr =0;

            for (nr=1; nr <=100; nr++) {
                sumNr=sumNr+nr;
                System.out.println(sumNr);
            }
        }


    }

    public static void main(String[] args) {


        new SumOfHundred().calc();
    }
}


