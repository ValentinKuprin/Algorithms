import java.util.Arrays;

import static Utils.Utils.getSortArray;

/** Написать алгоритм NumberOccurrences,  который принимает на вход массив целых чисел,  и возвращает массив пар
 {число, сколько раз число встречается в массиве}
 Test Data:
 {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} →
 {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}    */

public class NumberOccurrences {

    public static int[] getNumberOccurrences(int[] array) {
        if (array.length > 0) {
            getSortArray(array); // сортируем массив по возрастанию.

            int count = 0;
            System.out.println(Arrays.toString(getSortArray(array)));

            for (int i = 0; i < getSortArray(array).length; i++) {
                for (int j = i + 1; j < getSortArray(array).length; j++) {
                    if (getSortArray(array)[j] == getSortArray(array)[i]) {
                        break;
                    } else {
                        count++;
                        break;
                    }
                }
            }
            System.out.println(count);
            int[][] newArray = new int[count + 1][2];
            for (int i = 0; i < getSortArray(array).length; i++) {
                for (int j = i + 1; j < getSortArray(array).length; j++) {
                    if (getSortArray(array)[j] == getSortArray(array)[i]) {

                    }

                }
            }
        }


                return new int[]{};
            }



    public static void main(String[] args) {

        int[] array = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};

        System.out.println(Arrays.toString(getNumberOccurrences(array)));

    }//TODO: .........



}
