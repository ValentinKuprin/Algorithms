import java.util.Arrays;

/**Написать алгоритм SortArray, который принимает на вход массив целых чисел, и сортирует элементы массива в порядке возрастания.
 Test Data:
 {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}  */
public class SortArray {

    public int[] getSortArray(int[] array) {
        if (array.length <= 0) {
            return array;
        }
        int temp = 0;
        int[] sortArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = i +1 ; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
//
//   public static void main(String[] args) {
//       int[] sortArray1 = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};
//       System.out.println(Arrays.toString(getSortArray(sortArray1)));
//   }
}
