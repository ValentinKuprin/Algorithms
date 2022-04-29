package Utils;

import java.util.Arrays;

public class Utils {
    /**  1  Возвращает массив уникальных чисел.
     *
     */
    public static int[] getUniqueNumbers(int[] array) {
        if (array.length < 0) { // условие
            return new int[]{};
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = -1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                count++;
            }
        }
        int[] uniqueNumber = new int[count];
        int countUniqArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                uniqueNumber[countUniqArray] = array[i];
                countUniqArray++;
            }
        }
        return uniqueNumber;

    }

/** 2   Aлгоритм который принимает на вход массив целых чисел, и возвращает “перевернутый” массив. */
    public static int[] getReverseArray(int[] array) {
        if (array.length < 0) {
            return new int[]{};
        }
        int[] reverseArray = new int[array.length];
        int j = 0;
        for (int i = array.length-1; i >= 0; i--) {
            reverseArray[j] = array[i];
            j++;
        }

        return reverseArray;
    }

    /** 3  принимает на вход массив целых чисел, и сортирует элементы массива в порядке возрастания. */
    public static int[] getSortArray(int[] array) {
        if (array.length < 0) {
            return array;
        }
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i +1 ; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        //System.out.println(Arrays.toString(array));
        return array;
    }

/** который принимает на вход массив целых чисел и число k, и возвращает k-тый максимальный элемент */

    public int KthLargest(int[] array, int k) {
        if (array.length <= 0) {
            return Integer.MIN_VALUE;
        }
        int[] ar = Utils.getSortArray(array); // отсортированный массив
        int elementK = ar[ar.length - k];
        return  elementK;
    }


}





