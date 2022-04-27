public class OddEven {
/**Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,  если число нечетное,
 и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.

Test Data:  -345 →  “Odd”         0 →  “Even”       222222 →  “Even”         2147483647 + 1 →  “Undefined”    */
    public String getOddOrEven(Long a) {
        if (a >= Integer.MIN_VALUE && a <= Integer.MAX_VALUE) {
            if (a % 2 != 0) {
                return "Odd";
            } else if (a % 2 == 0) {
                return "Even";
            }
        }
        return "Undefined";
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE + 1);
    }


}
