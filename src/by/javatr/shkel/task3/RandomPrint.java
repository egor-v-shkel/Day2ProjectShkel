package by.javatr.shkel.task3;

import java.util.Random;

public class RandomPrint {
    public static void main(String[] args) {

        Random random = new Random();
        int[] randomArr;

        if (args.length != 0) {
            int numQuantity = Integer.parseInt(args[0]);
            randomArr = new int[numQuantity];

            for (int i = 0; i < numQuantity; i++) {
                randomArr[i] = random.nextInt();
                System.out.println(randomArr[i]);
            }

            System.out.println();

            for (int i = 0; i < numQuantity; i++) {
                System.out.print(randomArr[i] + " ");
            }
        }
    }
}