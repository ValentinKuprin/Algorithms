/**
 * Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
 * 0, если числа равны   -1, если первое число меньше второго     1, если первое число больше второго

 */
public class AreNumbersEqual {

    public int getAreNumbersEqual(int num1, int b) {
        if (num1 == b) {

            return 0;
        } else if (num1 < b) {

            return -1;
        } else {

            return 1;
        }
    }
}
