/**Напишите алгоритм IsPositiveNumber, который возвращает true, если численный  параметр больше или равен нулю,
 * и возвращает false, если параметр меньше 0.
 Проверьте работу метода на числах 555, 0 и -555.  */

public class IsPositiveNumber {

    public boolean IsPositiveNumber(int number) {
        if (number < 0) {
            return false;
        }
        return true;
    }

//    public boolean IsPositiveNumber1(int number) {
//        return  number >= 0? true : false;
//        num1 >= num2 & num1 : num2;
//
//    }

}
