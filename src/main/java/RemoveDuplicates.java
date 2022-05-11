import Utils.Utils;

/**
 * Написать алгоритм RemoveDuplicates, который принимает строку и возвращает строку уникальных букв:
 * “AABBCCaabbcc” → “abc”
 */
public class RemoveDuplicates {

    public String removeDuplicates(String input) {
        if (Utils.stringIsNotNull(input)) {
            if (Utils.stringIsNotEmpty(input)) {
                String newStr = input.trim().toLowerCase();
                String output = "";

                for (int i = 0; i < newStr.length(); i++) {
                    if ((newStr.charAt(i) >= 'A' && newStr.charAt(i) <= 'Z')
                            || (newStr.charAt(i) >= 'a' &&newStr.charAt(i) <= 'z')) {
                        if (!output.contains(Character.toString(newStr.charAt(i)))) {
                            output = output.concat(Character.toString(newStr.charAt(i)));
//                        if(!output.contains(String.valueOf(newStr.charAt(i)))) {
//                            output = output.concat(String.valueOf(newStr.charAt(i)));
                        }

                    }

                }
                return output;
            }
            return "Строка пустая";
        }
        return "null";
    }

//                        for (int i = 0; i < newStr.length(); i++) {
//                        if (output.length() == 0) {
//                            output = output.concat(Character.toString(newStr.charAt(i)));
//                        }
//                    for (int j = 0; j < output.length(); j++) {  //
//                        if (newStr.charAt(i) != output.charAt(j)) {

//                        }
//                    }
//                    return output;
//                }




//   public static void main(String[] args) {
//       System.out.println(removeDuplicates("AABBCCaabbcc"));
//   }


}
