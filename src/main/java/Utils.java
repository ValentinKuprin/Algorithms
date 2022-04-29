public class Utils {
    /**Возвращает массив уникальных чисел.
     *
     */
    public static int[] getUniqueNumbers(int[] array) {
        if (array.length < 0) { // условие
            return new int[]{};
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = -1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                count++;
            }
        }
        int[] uniqueNumber = new int[count];
        int countUniqArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                uniqueNumber[countUniqArray] = array[i];
                countUniqArray++;
            }
        }
        return uniqueNumber;

    }

/** Aлгоритм который принимает на вход массив целых чисел, и возвращает “перевернутый” массив. */
    public static int[] getReverseArray(int[] array) {
        if (array.length < 0) {
            return new int[]{};
        }
        int[] reverseArray = new int[array.length];
        int j = 0;
        for (int i = array.length-1; i >= 0; i--) {
            reverseArray[j] = array[i];
            j++;
        }

        return reverseArray;
    }

}





