import Utils.Utils;

public class CountWords1 {
/**Напишите алгоритм CountWords, который принимает на вход текст и слово,  и считает все вариации этого слова в тексте:
 *
 */
    public static int countWords(String str, String word) {
        str = str.trim().toLowerCase();

        int index = str.indexOf(word.toLowerCase());
        int count = 0;
        while (index != -1) {
            count++;

            index = str.indexOf(word.toLowerCase(), index +1);
       //     if (index + 1 != " ") {

         //   }
        }
        return count;






      //         int[][] arr = {{1, 2 ,3},{1, 1, 1},{6, 8, 8}};
      // int count = 0;
      // for (int i = 0; i < arr[i].length; i++) {
      //     count = count + arr[i].length;
      // }
      // System.out.println(count);



    }



    public static void main(String[] args) {

        String str = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term " +
                "support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 " +
                "LTS in January 2019 for commercial java use, although it will otherwise still support Java 8 with public " +
                "updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 " +
                "and 11 that are still receiving security and other upgrades.";
        String word = "Java";

                String str2 = "As of March 2022, Java 18 is the latest version, while Java 17, "
                 + "11 and 8 are the current long-term support (LTS) versions. Oracle released "
                    + "the last zero-cost public update for the legacy version Java 8 LTS in January 2019 "
                       + "for commercial java use, although it will otherwise still support Java 8 with public "
                          + "updates for personal use indefinitely. Other vendors have begun to offer zero-cost "
                             + "builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String word1 = "version";

        System.out.println(countWords(str2, word1));
    }
}
