import Utils.Utils;

import static Utils.Utils.getSortArray;

/** Написать алгоритм KthLargest, который принимает на вход массив целых чисел и число k,
 * и возвращает k-тый максимальный элемент.
 Test Data:
 ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9
 (12 и 12 - первый и второй самые большие элементы)     */

public class KthLargest {

    public int getKthLargest(int[] array, int k) {
        if (array.length <= 0) {
            return Integer.MIN_VALUE;
        }
        int[] ar = getSortArray(array); // отсортированный массив
        int elementK = ar[ar.length - k];
        return  elementK;
    }

//    public static void main(String[] args) {
//        int[] ar = {4, 3, 7, 12, 5, 2, 9, 4, 12};
//        System.out.println((KthLargest(ar, 3)));
//    }
}
