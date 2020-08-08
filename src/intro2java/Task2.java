package intro2java;

public class Task2 {

//Display the smallest number from an array of number

    public void smallestNumberArray(int [] array ) {
        int help = Integer.MAX_VALUE;

        for(int i= 0;i<array.length; i++){
            if (array[i] < help) {
                help=array[i];

            }
        }
        System.out.println(help);


    }

    public static void main(String[] args) {


       new Task2().smallestNumberArray(new int[]{84, 24, 15, 20, 55,1000,1});
    }
}
