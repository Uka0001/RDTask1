package t8Array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTask {
    public static void main(String[] args) {
        int[] numberArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt();
        }
        Arrays.stream(numberArray).forEach(System.out::println);
        System.out.println("min: " + Arrays.stream(numberArray).min().getAsInt());
        System.out.println("max: " + Arrays.stream(numberArray).max().getAsInt());
        System.out.println("avg: " + Arrays.stream(numberArray).average().getAsDouble());
        System.out.println("sum: " + Arrays.stream(numberArray).sum());
    }
}
