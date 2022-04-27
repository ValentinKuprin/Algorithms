import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

    @Order(1)
    @Test
    public void testGetBiggerValue(){
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue biggervalue = new BiggerValue();
        int actualResult = biggervalue.getBiggerValue(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testGetBiggerValueMaxIntegerPlusOne(){
        int a = 2147483647 + 1;
        int b = -2147483648;
        int expectedResult = -2147483648;

        BiggerValue biggervalue = new BiggerValue();
        int actualResult = biggervalue.getBiggerValue(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testGetBiggerValueAIsZero(){
        int a = 0;
        int b = -2147;
        int expectedResult = 0;

        BiggerValue biggervalue = new BiggerValue();
        int actualResult = biggervalue.getBiggerValue(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
