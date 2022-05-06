/** 16
 * Написать 4 алгоритма StringToLetters, StringToLettersAndSpaces, StringToNumbers,
 * StringToNumbersAndSpaces следуя примеру на сайте: https://allcalc.ru/node/2030
 * Каждый алгоритм принимает строку,  и удаляет ненужные символы:
 */
public class StringToLetters {

    public static String getStringToLetters(String str) {
        if (str != null) {
            if (!(str.isEmpty())) {
                String str1 = "тут нет букв";
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= 'A' && str.charAt(i) <= 'z') {
                        str += str.charAt(i);


                    }
                    return str;

                }

            }
            return "пустая";

        }
        return "нул";
    }

    public static void main(String[] args) {
     //   System.out.println(getStringToLetters("qwrerewt"));
        System.out.println(getStringToLetters("qwr646457erewt"));
     //   System.out.println(getStringToLetters(" "));
     //   System.out.println(getStringToLetters(""));
    }
}
