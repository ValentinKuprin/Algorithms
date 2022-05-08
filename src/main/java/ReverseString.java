import Utils.Utils;

/**
 * Написать алгоритм ReverseString, который переворачивает строку:
 * Test Data:
 * “Abracadabra” → “arbadacarbA”
 */
public class ReverseString {

    public String reverseString(String str) {
        if (Utils.stringIsNotNull(str)) {
            if (Utils.stringIsEmpty(str)) {
                String str1 = "";
                for (int i = str.length()-1; i >= 0; i--) {
                    str1 += str.trim().charAt(i);
                }

                return str1;
            }
            return "пустая строка";
        }
        return "null";
    }

//    public static void main(String[] args) {
//        System.out.println(reverseString("Abracadabra"));
//    }
}
