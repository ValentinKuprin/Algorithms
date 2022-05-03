import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SumOfTwoTest {

    @Order(1)
    @Test
    public void testSumOfTwo() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

        SumOfTwo sumOfTwo = new SumOfTwo();
        int[][] actualResult = sumOfTwo.getSumOfTwo(array, n);
        Assertions.assertArrayEquals(expectedResult, actualResult);


    }


}
