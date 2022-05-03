import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SumArrayTest {
    //{} → 0
    //{-3, -2, -1, 0, 1, 2, 3} → 0
    //{2147483647, 1} → Integer.Min.value
    //{-2147483648, -1} → Integer.Max.value
    //{0} → 0
    //{-7,-3} → -10

    @Order(1)
    @Test
    public void testGetSumArray() {

        int[] array = new int[] {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.getSumArray(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testGetSumArrayNegativeNumber() {

        int[] array = new int[] {-7, -3};
        int expectedResult = -10;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.getSumArray(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testGetSumArrayEmptyArray() {

        int[] array = new int[] {};
        int expectedResult = 0;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.getSumArray(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testGetSumArrayMaxIntegerPlysOne() {

        int[] array = new int[] {2147483647, 1};
        int expectedResult = -2147483648;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.getSumArray(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testGetSumArrayIsZero() {

        int[] array = new int[] {0};
        int expectedResult = 0;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.getSumArray(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testGetSumArrayOneIndexArrayIntMaxValue() {

        int[] array = new int[] {2147483647 + 1};
        int expectedResult = 2147483647 + 1;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.getSumArray(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }



}
