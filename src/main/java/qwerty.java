import java.util.Arrays;

/**Test Data:
 “Carrot”, “carwash” → “car”
 “Noob”, “Schmooze” → “oo”
 */
public class qwerty {

    public static String stringIntersection(String str, String str1) {

        str = str.toLowerCase();
        str1 = str1.toLowerCase();
        String podStr = str1.substring(0, str1.length());
        String result = "";
        String result1 = "";

        //  return podStr;


        for (int i = str1.length(); i >= 0; ) {
            if (!str.contains(str1.substring(0, i))) {
                result1 = str1.substring(0, i);
                System.out.println(result1);
                i--;
            } else {
                result = str1.substring(0, i);

                return result;
            }
        }

        return "Совпадений нет";
    }




    public static void main(String[] args) {

        String str = "Carrot";
        String str1 = "carwash";
      //  System.out.println(str1.substring(0, str1.length()));

        System.out.println(stringIntersection(str, str1));
    }

}
