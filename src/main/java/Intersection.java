/** Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и возвращает массив общих элементов.
 Test Data:
 {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
 {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
 {1, 2, 4, 5, 89}, {8, 9, 45} → {}  */

public class Intersection {

    public int[] Intersection(int[] array, int[] array1) {
        if (array.length > 0 || array1.length > 0) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array1.length; j++) {
                    if (array[i] == array1[j])
                        count++;
                }
            }
            int[] sumArray = new int[count];
            int a = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array1.length; j++) {
                    if (array[i] == array1[j] && count <= sumArray.length) {
                        sumArray[a] = array[i];
                        a++;


                    }
                }
            }
            return sumArray;
        }
        return new int[]{};
    }
}
