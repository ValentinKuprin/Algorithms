import java.util.Arrays;
/**Написать алгоритм SumArray, который возвращает сумму всех чисел массива
 Test Data:
 {0, 1, 2, 3, 4, 5} → 15
 {-7, -3} → -10  */
public class SumArray {

    public int getSumArray(int[] array) {
        if (array.length > 0) {
            int sumArray = 0;
            for (int i = 0; i < array.length; i++) {
                sumArray += array[i];
            }

            return sumArray;
        }

        return 0;
    }

}
