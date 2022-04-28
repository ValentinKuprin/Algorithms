import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest_NAPICAT_TESts {


    @Order(1)
    @Test
    public void testMinMaxAveHappyPath() {
        //array = 36 / 8 =4.5
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8}; // позитивный сценарий
        int a = 2;
        int b = 6;
        int[] expectedResult = {3, 7, 5};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAve(array, a, b);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testMinMaxAveHappyPathNegativeNumberInArray() { // отрицательное число в массиве
        int[] array = new int[]{1, 2, 3, -2, 5, 6, 7, 8};
        int a = 1;
        int b = 6;
        int[] expectedResult = {-2, 7, 3};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAve(array, a, b);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testMinMaxAveHappyPathInitialIndexEqualLastIndex() { // индекс а равен индексу б
        int[] array = new int[]{1, 2, 3, -2, 5, 6, 7, 8};
        int a = 3;
        int b = 3;
        int[] expectedResult = {-2, -2, -2};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAve(array, a, b);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testMinMaxAveHappyPathBoundaryValueIndex() { // индекс на границах
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int a = 0;
        int b = 7;
        int[] expectedResult = {1, 8, 4};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAve(array, a, b);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testMinMaxAveHappyPathEmptyArray() { // пустой массив
        int[] array = new int[]{};
        int a = 0;
        int b = 7;
        int[] expectedResult = {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAve(array, a, b);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testMinMaxAveHappyPathArrayIsZeros() { // массив из 0
        int[] array = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        int a = 0;
        int b = 7;
        int[] expectedResult = {0, 0, 0};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAve(array, a, b);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test

    public void testMinMaxAveNegativeInitialIndex() { //отрицательный индекс
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int a = -1;
        int b = 7;
        int[] expectedResult = {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAve(array, a, b);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testMinMaxAvetheIndexGoesBeyondArray() { // массив короче индекса б
        int[] array = new int[]{0, 0, 0, 0, 0, 0};
        int a = 0;
        int b = 7;
        int[] expectedResult = {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAve(array, a, b);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testMinMaxAvethe() { // массив короче индекса б
        int[] array = new int[]{0, 0, 0, 0, 0, 0};
        int a = 0;
        int b = 7;
        int[] expectedResult = {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAve(array, a, b);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(9)
    @Test
    public void testMinMaxAvethe1() { // индес б больше индекса а, как должна вести себя программа ? какие условия должны быть
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};//?
        int a = 3;
        int b = 5;
        int[] expectedResult = {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAve(array, a, b);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(10)
    @Test
    public void testMinMaxAvethe1() { // индекс б отрицательный
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};//?
        int a = 3;
        int b = -5;
        int[] expectedResult = {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAve(array, a, b);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
