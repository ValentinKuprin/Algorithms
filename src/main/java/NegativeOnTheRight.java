import java.util.Arrays;

/** Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел, и возвращает массив,
 * в котором все негативные числа находятся во второй половине массива
 Test Data:
 {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}    */

public class NegativeOnTheRight {

    public static int[] getNegativeOnTheRight(int[] array) {
        if (array.length <= 0) {
            return array;
        }
        int temp = 0;
        int[] sortArray = new int[array.length];
         for (int i = 0; i < array.length; i++) {
        for (int j = array.length-1; j >= 0; j--) {

            }

            }

        return array;
        //    }
    }

    public static void main(String[] args) {

        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        System.out.println(Arrays.toString(getNegativeOnTheRight(array)));

    }

}//TODO: НЕ СМОГ РЕШИТЬ !!!
