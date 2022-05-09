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
        if (array.length <= 0) {
            return array;
        }
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
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

/** метод, который принимает массив целых положительных чисел больше 0, и возвращает массив уникальных чисел. */
    public static int[] getUniqueArray(int[] array) {
        if (array.length == 0) {

            return array;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = -1;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                count++;
            }
        }
        int count1 = 0;
        int[] unicueArray = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                unicueArray[count1] = array[i];
                count1++;
            }
        }

        return unicueArray;
    }

    /**   Проверка строки на null  */
    public static boolean stringIsNotNull(String str) {
        if (str != null) {

            return true;
        }

            return false;
        }


    /** Проверка на пустую строку */

    public static boolean stringIsEmpty(String str) {
        if (!str.isEmpty()) {

            return true;
        }

        return false;
    }

    /** Поиск уникальных символов в строке  */

    public String removeDuplicates(String input) {
        if (Utils.stringIsNotNull(input)) {
            if (Utils.stringIsEmpty(input)) {
                String newStr = input.trim().toLowerCase();
                String output = "";
                for (int i = 0; i < newStr.length(); i++) {
                    if (!output.contains(Character.toString(newStr.charAt(i)))) {
                        output = output.concat(Character.toString(newStr.charAt(i)));
                }

            }
            return output;
        }
        return "Строка пустая";
    }
        return "null";
}





}





