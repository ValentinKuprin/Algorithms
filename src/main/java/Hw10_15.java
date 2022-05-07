//import java.util.Arrays;
//
///**15
// * Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
// * Test Data:
// * “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
// * (Без форматирования)
// */
//public class Hw10_15 {
//
//
//    public static int[] getStringToNumbers(String str) {
//        if (str != null) {
//            if (!str.isEmpty()) {
//                int count = 0;
//                for (int i = 0; i < str.length(); i++) {
//                    if (str.charAt(i) >= '1' && str.charAt(i) <= '9') {
//                        count++;
//                    }
//                }
//                System.out.println(count);
//                int j = 0;
//                int[] arrayNumb = new int[count];
//                for (int i = 0; i < str.length(); i++) {
//                    if (str.charAt(i) >= '1' && str.charAt(i) <= '9') {
//                        arrayNumb[j] =  (str.charAt(i)); // Integer.parseInt
//                        j++;
//                    }
//
//                }
//
//                return arrayNumb;
//            }
//        }
//
//        return new int[]{};
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println(Arrays.toString(getStringToNumbers("1, 2, 3, 4, 5")));
//
//    }//TODO: ......... version 1
//
//    public static int[] getStringToNumbers(String str) {
//        if (str != null) {
//            if (!str.isEmpty()) {
//                String number = "";
//                for (int i = 0; i < str.length(); i++) {
//                    if ((str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
//                        number += (str.charAt(i) + " ");
//                        //   if () {
//                    }
//                }
//
//
//                //             System.out.println(number);
//                //           String[] array = number.split(" ");
//                //           int j = 0;
//                //             int[] arrayNum = new int[array.length];
//                //             for (int i = 0; i < array.length; i++) {
//                //                     arrayNum[j] = Integer.parseInt(array[i]);
//                //                     j++;
//                //             }
////
//                //             return arrayNum;
//            }
////
//            //         return new int[]{};//"Пустая строка"
//        }
////
////
//        return new int[]{};//"null"
//    } //TODO:... // version 2
//
//
//    public static void main (String[]args){
//        System.out.println((Arrays.toString(getStringToNumbers("1, зд9ж4д6ло8940ж6р8ожорж"))));
//        System.out.println((Arrays.toString(getStringToNumbers("hfgjghkhjkjhkggk"))));
//        System.out.println((Arrays.toString(getStringToNumbers("1, njtyhdtryrty, 5"))));
//        System.out.println((Arrays.toString(getStringToNumbers(""))));
//        System.out.println((Arrays.toString(getStringToNumbers(null))));
//        System.out.println((Arrays.toString(getStringToNumbers("12"))));
//        System.out.println((Arrays.toString(getStringToNumbers("1, 2, 3, 4, 5"))));
//        System.out.println((Arrays.toString(getStringToNumbers("1, 2, 3, 4, 5"))));
//        System.out.println((Arrays.toString(getStringToNumbers("1, 2, 3, 4, 5"))));
//        System.out.println((Arrays.toString(getStringToNumbers("1, 2, 3, 4, 5"))));
//
//
//
//
//
//
//    }






//}
