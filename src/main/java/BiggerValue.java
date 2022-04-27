/**
 * Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
 * Test Data:
 * 3333, 9999
 * Expected Result = 9999
 */
public class BiggerValue {

    public int getBiggerValue(int a, int b) {
        if (a <= Integer.MAX_VALUE && a >= Integer.MIN_VALUE || b <= Integer.MAX_VALUE && b >= Integer.MIN_VALUE) {
            int max = Math.max(a, b);
        return max;
    }
        return Integer.MIN_VALUE;
    }


}
