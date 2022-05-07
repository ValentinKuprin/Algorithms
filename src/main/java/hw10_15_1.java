import java.util.Arrays;

public class hw10_15_1 {




    public static Integer[] stringToNumbers(String str) {
        if (str.length() != 0) {
            String str1 = str.trim().replace(" ", "");
            String[] arr = str1.split(",");
            Integer[] arr1 = new Integer[arr.length];
            for (int i = 0; i < arr.length; i++) {
                arr1[i] = Integer.valueOf(arr[i]);
            }

            return arr1;
        } else {
            return new Integer[]{};
        }
    }



    public static void main(String[] args) {

        System.out.println((Arrays.toString(stringToNumbers("1, зд9ж4д6ло8940ж6р8ожорж"))));
        System.out.println((Arrays.toString(stringToNumbers("hfgjghkhjkjhkggk"))));
        System.out.println((Arrays.toString(stringToNumbers("1, njtyhdtryrty, 5"))));
        System.out.println((Arrays.toString(stringToNumbers(""))));
        System.out.println((Arrays.toString(stringToNumbers(null))));
        System.out.println((Arrays.toString(stringToNumbers("12"))));
        System.out.println((Arrays.toString(stringToNumbers("1, 2, 3, 4, 5"))));
        System.out.println((Arrays.toString(stringToNumbers("1, 2, 3, 4, 5"))));
        System.out.println((Arrays.toString(stringToNumbers("1, 2, 3, 4, 5"))));
        System.out.println((Arrays.toString(stringToNumbers("1, 2, 3, 4, 5"))));
        }
}
