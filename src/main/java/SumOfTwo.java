import java.util.Arrays;

/**Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,  и число n.
 Алгоритм  возвращает пары элементов, которые в сумме дают число n.
 Test Data:
 ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}    */
public class SumOfTwo {
    public static int[][] getSumOfTwo (int[] array, int n) {
        if (array.length <= 0) {
          //  return new int array1[];
        }
        int count = 0;
        for (int i = 0; i < array.length + 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == n) {
                    count++;
                }
            }
        }
        System.out.println(count);
        int countForArraySumOfTwo = 0;
        int[] pairOfValues = new int[2];
        int[][] arraySumOfTwo = new int[count][count];
        for (int i = 0; i < array.length + 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == n) {
                    pairOfValues[0] = array[i];
                    pairOfValues[1] = array[j];
                    arraySumOfTwo[countForArraySumOfTwo] = pairOfValues;
                }//TODO: разобраться с записью во второй массив !!!
            }
        }

        return arraySumOfTwo;
    }

    public static void main(String[] args) {
        int[] array1 = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        System.out.println(Arrays.toString(getSumOfTwo(array1, 12)));

    }

}
