/**
 * 16
 * Написать 4 алгоритма StringToLetters, StringToLettersAndSpaces, StringToNumbers,
 * StringToNumbersAndSpaces следуя примеру на сайте: https://allcalc.ru/node/2030
 * Каждый алгоритм принимает строку,  и удаляет ненужные символы:
 */
public class StringToLetters {

    public String getStringToLetters(String str) {
        if (str != null) {
            if (!(str.isEmpty())) {
                String str1 = "";
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                        str1 += str.charAt(i);
                    }
                }
                if (str1.isEmpty()) {

                    return "Букв нету";
                }

                return str1;

            }
            return "пустая строка";
        }
        return "null";
    }

//    public static void main(String[] args) {
//        System.out.println(getStringToLetters("qwrerewt"));
//        System.out.println(getStringToLetters("qwr646457erewt"));
//        System.out.println(getStringToLetters(" "));
//        System.out.println(getStringToLetters(""));
//        System.out.println(getStringToLetters(null));
//    }
}
