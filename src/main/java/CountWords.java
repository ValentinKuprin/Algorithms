import static Utils.Utils.*;

/**
 * Напишите алгоритм CountWords, который принимает на вход текст и слово,  и считает все вариации этого слова в тексте:
 */
//TODO: не ищет пробелы и запятые

public class CountWords {

    public int countWords(String str, String word) {
        if (stringIsNotNull(str) && stringIsNotNull(word)) {
            if (stringIsNotEmpty(str) && stringIsNotEmpty(word)) {

//               for (int i = 0; i < str.length(); i++) {
//                   if (str.charAt(i) ==  ',') {
//                       str.charAt(i-1) = ;
//                   }
//               }
                String[] array = str.toLowerCase().replace(",", "").split(" ");
                word = word.toLowerCase();
                int count = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i].equals(word)) {
                        count++;
                    }
                }

                return count;
            }

            return -1;
        }
        return -1;
    }

//    public static int countWordsV2(String str, String word) {
//        str = str.trim().toLowerCase();
//
//        int index = str.indexOf(word.toLowerCase());
//        int count = 0;
//        while (index != -1) {
//            count++;
//
//            index = str.indexOf(word.toLowerCase(), index + 1);
//        }
//        return count;
//
//    } v2

//    public static void main(String[] args) {
//
//        String str = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current " +
//                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy " +
//                "version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still " +
//                "support Java 8 with public updates for personal use indefinitely. Other vendors have begun " +
//                "to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
//
//        String str1 = null;
//        String str3 = "";
//        String str4 = " ";
//
//        String str2 = "As of March 2022, Java 18 is the latest version, while Java 17, "
//                 + "11 and 8 are the current long-term support (LTS) versions. Oracle released "
//                    + "the last zero-cost public update for the legacy version Java 8 LTS in January 2019 "
//                       + "for commercial java use, although it will otherwise still support Java 8 with public "
//                          + "updates for personal use indefinitely. Other vendors have begun to offer zero-cost "
//                             + "builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
//
//        System.out.println(countWords(str2, "version"));
//    }
}
