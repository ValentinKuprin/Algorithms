/**
 * Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и возвращает
 * значения пиковых элементов (элементы, которые больше своих соседей).
 * Test Data:
 * {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23
 */
public class PeakElement { // РАЗОБРАТЬСЯ С ТЕСТОМ (2, 3)

    public int[] getPeakElement(int[] array) {
        if (array.length <= 0) {
            return new int[]{};
        }
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (i == 0 ) {
                if (array[0] > array[1] || array[array.length-1] > array[array.length-2]) {
                    count++;
                }
            } else if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                count++;
                //  System.out.println(count);
            }
        }
        int[] peakElement = new int[count];
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (i == 0 && array[i] > array[i + 1]) {
                peakElement[j] = array[i];
                j++;
            } else if (i > 0 && array[i] > array[i - 1] && array[i] > array[i + 1]) {
                peakElement[j] = array[i];
                j++;
            } else if (i == array.length - 1 && array[array.length - 1] > array[array.length - 2]) {
                peakElement[j] = array[array.length - 1];
                j++;
            }
        }
        return peakElement;
    }
}
