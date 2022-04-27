import java.util.Arrays;

public class OddIndices {

    /**
     * Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */

    public int[] OddIndices(int[] array) {
        int count = 0;
        if (array.length > 0) {
            for (int i = 1; i < array.length; i += 2) {
                count++;
            }

            int[] arrayOddIndices = new int[count];
            int j = 0;
            for (int i = 1; i < array.length; i += 2) {
                arrayOddIndices[j] = array[i];
                j++;
            }
            return arrayOddIndices;
        }
        return new int[]{};
    }


}
