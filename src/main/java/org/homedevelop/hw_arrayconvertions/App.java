package org.homedevelop.hw_arrayconvertions;

import static org.homedevelop.hw_arrayconvertions.ArrayConvert.*;

public class App {
    public static void main(String[] args) {
      String newLine = System.getProperty("line.separator");

      System.out.println(newLine + "Медиана в случайном массиве из 100 чисел в диапазоне 100 элементов = "+getMedian(getRandomArray(100, 100)));
      System.out.println(newLine + "Медиана в случайном массиве из 500 чисел в диапазоне 100 элементов = "+getMedian(getRandomArray(500, 100)));
      System.out.println(newLine + "Медиана в случайном массиве из 1000 чисел в диапазоне 100 элементов = "+getMedian(getRandomArray(1000, 100)));

      int[] array = new int[]{112, 221, 348, 56, 78, 33};
      int[] array1 = new int[]{112, 221, 348, 56, 78, 33};
      int[] array2 = new int[]{112, 221, 34, 56, 78, 33, 86};
      System.out.println(areEqual(array, array1));

      System.out.println("Среднне значение массива = " + getMiddleNumb(array));

      countEvenAndOdd(array);

      entArray();

      int resultEntArray[] = entArray();
      System.out.println("Среднее число массива = " + getMiddleNumb(resultEntArray));
      countEvenAndOdd(resultEntArray);
      printArray(getRandomArray(100, 100));

      int getrandomarray[] = getRandomArray(100, 100);
      System.out.println("Среднне значение массива = " + getMiddleNumb(getrandomarray));
      countEvenAndOdd(getrandomarray);
      printArray(getRandomArray(500, 100));

      int getrandomarray1[] = getRandomArray(500, 100);
      System.out.println("Среднне значение массива = " + getMiddleNumb(getrandomarray1));
      countEvenAndOdd(getrandomarray1);
      printArray(getRandomArray(1000, 100));

      int getrandomarray2[] = getRandomArray(1000, 100);
      System.out.println("Среднне значение массива = " + getMiddleNumb(getrandomarray2));
      countEvenAndOdd(getrandomarray2);

  }
}
