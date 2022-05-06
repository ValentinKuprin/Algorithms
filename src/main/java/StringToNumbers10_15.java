import java.util.Arrays;

/**15
 * Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
 * Test Data:
 * “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
 * (Без форматирования)
 */

public class StringToNumbers10_15 {

    public static int[] getStringToNumbers(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                String strTrim = str.trim().split(", ");

                String number = "";
                for (int i = 0; i < str.length(); i++) {
                    if (strTrim.charAt(i) >= '1' && strTrim.charAt(i) <= '9') {
                        number += (strTrim.charAt(i));
                    }
                }
                System.out.println(number);
                int[] arrayNum = new int[number.length()];
                for (int i = 0; i < arrayNum.length; i++) {
                        arrayNum[i] = number.charAt(i);
                }
                //int[] arrayNum = number.split(' ');


                return arrayNum;
            }

            return new int[]{};//"Пустая строка"
        }

        return new int[]{};//"null"
    }

    public static void main(String[] args) {
//        System.out.println((Arrays.toString(getStringToNumbers("1, здждлоджрожорж"))));
//        System.out.println((getStringToNumbers("hfgjghkhjkjhkggk")));
//        System.out.println((getStringToNumbers("1, njtyhdtryrty, 5")));
//        System.out.println((getStringToNumbers("")));
//        System.out.println((getStringToNumbers(null)));
//        System.out.println((getStringToNumbers("null")));
//        System.out.println((getStringToNumbers("12")));
        System.out.println((getStringToNumbers("1, 2, 3, 4, 5")));
//        System.out.println((getStringToNumbers("1, 2, 3, 4, 5")));
//        System.out.println((getStringToNumbers("1, 2, 3, 4, 5")));
//        System.out.println((getStringToNumbers("1, 2, 3, 4, 5")));
//
//
//
    }

}
