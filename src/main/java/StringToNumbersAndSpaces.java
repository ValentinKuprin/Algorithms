public class StringToNumbersAndSpaces {

    public String stringToNumbersAndSpaces(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                String numbers = "";
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= '0' && str.charAt(i) <= '9' || str.charAt(i) == ' ') {
                        numbers += str.charAt(i);
                    }
                }
                if (numbers.isEmpty()) {

                    return "Цифр нету";
                }

                return numbers;
            }

            return "Строка пустая";
        }

        return "null";
    }
//
//    public static void main(String[] args) {
//        System.out.println(stringToNumbersAndSpaces("qwer 1234 gh @#$%^&'"));
//    }
}

