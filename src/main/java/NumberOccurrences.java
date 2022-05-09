import java.util.Arrays;

import static Utils.Utils.getSortArray;

/** Написать алгоритм NumberOccurrences,  который принимает на вход массив целых чисел,  и возвращает массив пар
 {число, сколько раз число встречается в массиве}
 Test Data:
 {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} →
 {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}    */

public class NumberOccurrences {

    public int[][] getNumberOccurrences(int[] array) {
        if (array.length > 0) {
            int count = 0;
            int[] sortArr = getSortArray(array);
            for (int i = 0; i < sortArr.length; i++) {
                for (int j = i + 1; j < sortArr.length; j++) {
                    if (array[j] == array[i]) {
                        break;
                    } else {
                        count++;
                        break;
                    }
                }
            }
          //  System.out.println(count);
            int[][] arr = new int[count + 1][2];
            int number = 0;
            int sum = 0;

            for (int i = 0; i < sortArr.length; i += sum) {
                arr[number][0] = array[i];
                sum = 0;

                for (int j = 0; j < sortArr.length; j++) {
                    if (array[j] == array[i]) {
                        sum++;
                    }
                }
                arr[number][1] = sum;
                number++;

            }

            return arr;

        }

        return new int[][]{};
    }


//    public static void main(String[] args) {
//
//        int[] array = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
//
//        System.out.println(Arrays.deepToString((getNumberOccurrences(array))));
//TODO: Повторить !!
}




