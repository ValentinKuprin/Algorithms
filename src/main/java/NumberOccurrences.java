/** Написать алгоритм NumberOccurrences,  который принимает на вход массив целых чисел,  и возвращает массив пар
 {число, сколько раз число встречается в массиве}
 Test Data:
 {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} →
 {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}    */

public class NumberOccurrences {

    public static int[] getNumberOccurrences(int[] array) {
        if (array.length <= 0) {
            return array;
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

        }
        System.out.println(count);
return new int[]{};
    }



}
