package org.homedevelop.hw_arrayconvertions;

import java.util.Random;
import java.util.Scanner;

public class ArrayConvert {

    public static int getMedian(int[] array) {
        int median = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int s = 0; s < array.length - 1; s++) {
                if (array[s] > array[s + 1]) {
                    int temp = array[s];
                    array[s] = array[s + 1];
                    array[s + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array.length == 100) {
                median = (array[49] + array[50]) / 2;
            }
            else if (array.length == 500) {
                median = (array[249] + array[250]) / 2;
            }
            else {
                median = (array[499] + array[500]) / 2;
            }
        }
        printArray(array);
        return median;
    }

    public static boolean areEqual(int[]first, int[]second){
        boolean check = true;
        if (first.length == second.length) {
            for (int i = 0; i < first.length; i++) {
                if (first[i] != second[i]) {
                    check = false;
                    break;
                }
            }
        }
            else {
                check = false;
            }
            return check;
        }

    public static int getMiddleNumb(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int middle = sum / array.length;
        return middle;
    }

    public static void countEvenAndOdd(int[] array) {
        int countEven = 0;

        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0)
                countEven++;
        }
        System.out.println("Количество четных элементов массива = " + countEven);
        System.out.println("Количество нечетных элементов массива = " + (array.length - countEven));
    }


    public static int[] entArray() {
        int[] array;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int count = input.nextInt();
        array = new int[count];
        System.out.println("Enter array amounts: ");
        for (int i = 0; i < count; i++) {
            System.out.print("Amount " + i + " = ");
            array[i] = input.nextInt();
        }
        input.close();
        return array;
    }

    public static int[] getRandomArray(int size, int bound) {
        Random random = new Random();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}