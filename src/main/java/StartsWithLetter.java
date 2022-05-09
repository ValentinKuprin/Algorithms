import Utils.Utils;

/** Написать алгоритм StartsWithLetter, который принимает на вход текст,  и возвращает в виде строки все слова,
 * которые начинаются с буквы l.  */
public class StartsWithLetter {

    public String startsWithLetter(String str, String letter) {
        if (Utils.stringIsNotNull(str) && Utils.stringIsNotNull(letter)) {
            if (Utils.stringIsEmpty(str) || Utils.stringIsEmpty(letter)) {
               String[] strArr = str.replace(",", "").replace(".", "").split(" ");
               String result = "";
                for (int i = 0; i < strArr.length; i++) {
                   if (strArr[i].substring(0, 1).equals(letter.toLowerCase())
                           || strArr[i].substring(0, 1).equals(letter.toUpperCase())) {
                    //   if (strArr[i].substring(0, 1).compareTo(letter)) {}

                        result += strArr[i] + ", "; //TODO: last 3apyataya
                    }
                }

                return result;
            }

            return "Пустая строка";
        }

        return "null";
    }


//    public static void main(String[] args) {
//
//        String str = "As a decrepit father takes delight " +
//                "To see his active child do deeds of youth, " +
//                "So I, made lame by fortune’s dearest spite, " +
//                "Take all my comfort of thy worth and truth. " +
//                "For whether beauty, birth, or wealth, or wit, " +
//                "Or any of these all, or all, or more, " +
//                "Entitled in thy parts do crownèd sit, " +
//                "I make my love engrafted to this store. " +
//                "So then I am not lame, poor, nor despised, " +
//                "Whilst that this shadow doth such substance give " +
//                "That I in thy abundance am sufficed, " +
//                "And by a part of all thy glory live. " +
//                "Look what is best, that best I wish in thee. " +
//                "This wish I have; then ten times happy me. ";
//
//
//        System.out.println(startsWithLetter(str, "l"));
//    }
}
