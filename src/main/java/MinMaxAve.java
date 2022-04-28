import java.util.Arrays;

/**8.	Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
 * Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
 * и среднее среди всех значений между 2-мя индексами.
 Test Data:
 ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}    */

public class MinMaxAve {

    public int[] getMinMaxAve(int[] array, int a, int b) {
        if (array.length > 0 && a <= b && a >= 0) {

            int[] MinMaxAve = new int[3];
            int min = array[a];
            int max = array[a];
            int sum = 0;
            int avarage = 0;
            int count = 0;
            for (int i = a; i <= b; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
                if (max < array[i]) {
                    max = array[i];
                }
                sum += array[i];
                count++;
                avarage = sum / count;

            }

            return MinMaxAve = new int[]{min, max, avarage};

        }

        return new int[]{};
    }
}



