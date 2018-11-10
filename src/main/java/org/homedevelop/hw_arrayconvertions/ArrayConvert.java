package org.homedevelop.hw_arrayconvertions;

import java.util.Random;
import java.util.Scanner;

public class ArrayConvert {


        public static void getMiddleNumb(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
            int middle = sum / array.length;
            System.out.println("Среднне значение массива = " +middle);
        }

        public static void defineEvenOrOdd(int[] array){
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < array.length; i++){
            if ((array[i]%2)==0)
                countEven++;
            else if ((array[i]%2)!=0)
                countOdd++;
        }
        System.out.println("Количество четных элементов массива = "+countEven);
        System.out.println("Количество нечетных элементов массива = "+countOdd);
    }


    public static int[] entArray() {
        int[] array;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int count = input.nextInt();
        array = new int[count];
        System.out.println("Enter array amounts: ");
        for (int i = 0; i < count; i++){
            System.out.print("Amount "+i+" = ");
            array[i] = input.nextInt();
        }
        input.close();
        getMiddleNumb(array);
        defineEvenOrOdd(array);
        return array;
    }

    public static int[] getRandomArray(int size, int bound){
        Random random = new Random();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(bound);
        }
        printArray(array);
        getMiddleNumb(array);
        defineEvenOrOdd(array);
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}