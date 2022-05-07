public class StringToLettersAndSpaces {

    public String stringToLettersAndSpaces(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                String str1 = "";
                for (int i = 0; i < str.length(); i++) {
                    if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                            || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || str.charAt(i) == ' '){
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
//        System.out.println(stringToLettersAndSpaces("uifhsd  654j6 765gf76 3ogfkl;hl;g"));
//    }
}

