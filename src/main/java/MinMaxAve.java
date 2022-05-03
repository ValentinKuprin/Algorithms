import java.util.Arrays;

/**8.	Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
 * Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
 * и среднее среди всех значений между 2-мя индексами.
 Test Data:
 ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}    */

public class MinMaxAve {

    public static int[] getMinMaxAve(int[] array, int a, int b) {
        if (array != null) { // array != null || array.length > 0 почему ломает ?! тест падает на пустом массиве
            if (array.length > 0 && a <= b && a >= 0 && b > 0 && b < array.length) {
                if ( a > b){
                    int temp = a;
                    a = b;
                    b = temp;
                }
                int[] MinMaxAve = new int[3];
                int min = array[a];
                int max = array[a];
                int sum = 0;
                int avarage = 0;
                for (int i = a; i <= b; i++) {
                    if (min > array[i]) {
                        min = array[i];
                    }
                    if (max < array[i]) {
                        max = array[i];
                    }
                    sum += array[i];
                    avarage = sum / (b - a + 1);

                }

                return MinMaxAve = new int[]{min, max, avarage};

            }
            return new int[]{};
        }
        return new int[]{};
    }

//       public static void main(String[] args) {
//               int[] array = null;
//
//               System.out.println(Arrays.toString(getMinMaxAve(array, 0, 7)));
//
//           }
}



