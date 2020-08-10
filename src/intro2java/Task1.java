package intro2java;



public class Task1 {

    // Calculate the sum of the first 100 numbers higher than 0


        public static void calc (int nr) {

            int sumNr =0;

            for (int i=1; i <=nr; i++) {
                sumNr=sumNr+i;

            }
            System.out.println(sumNr);
        }




    public static void main(String[] args) {


        Task1.calc(3);
    }
}


