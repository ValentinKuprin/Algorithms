import java.util.Arrays;

/**15
 * Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
 * Test Data:
 * “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
 * (Без форматирования)
 */
public class Hw10_15 {


    public static int[] getStringToNumbers(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                int count = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= '1' && str.charAt(i) <= '9') {
                        count++;
                    }
                }
                System.out.println(count);
                int j = 0;
                int[] arrayNumb = new int[count];
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= '1' && str.charAt(i) <= '9') {

                        arrayNumb[j] =  (str.charAt(i)); // Integer.parseInt
                        j++;
                    }
                }

                return arrayNumb;
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getStringToNumbers("1, 2, 3, 4, 5")));

    }//TODO: .........
}
