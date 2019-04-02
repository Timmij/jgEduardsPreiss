package lv.homework7;

import java.util.Random;

public class ArrayService {

    private static int[] array;
    private int arrayLength;

    public ArrayService(int arrayLength) {
        this.arrayLength = arrayLength;
    }

    public static void printArrayToConsole() {
        for (int n : array) {
            System.out.println(n + " ");
        }
    }

    public static int fillArrayWithRandomNumbers() {
        Random rand = new Random();
        int randomNum = rand.nextInt((int) (Math.random() * 101));
        return randomNum;
    }

    public static void sumInArray() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum = " + sum);
    }

    public int[] create() {
        array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = fillArrayWithRandomNumbers();
        }
        return array;
    }
}
