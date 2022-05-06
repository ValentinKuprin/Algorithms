import java.util.Arrays;

/**Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,  и число n.
 Алгоритм  возвращает пары элементов, которые в сумме дают число n.
 Test Data:
 ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}    */
public class SumOfTwo {

    public static int[][] getSumOfTwo(int[] array, int n) {
        if (array.length > 0) {

            int count = 0;
            for (int i = 0; i < array.length + 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == n) {
                        count++;
                    }
                }
            }
            int countForArraySumOfTwo = 0;
            int[][] arraySumOfTwo = new int[count][2];
            for (int i = 0; i < array.length + 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == n) {
                        arraySumOfTwo[countForArraySumOfTwo] = new int[]{array[i], array[j]};
                        countForArraySumOfTwo++;
                    }//TODO: разобраться с записью во второй массив !!!
                }
            }

            return arraySumOfTwo;
        }

        return new int[][]{};
    }



    public static void main(String[] args) {
        int[] array1 = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        System.out.println(Arrays.deepToString((getSumOfTwo(array1, 12))));

    }

}
