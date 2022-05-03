import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
//MIN_VALUE, 0 →  0
//MIN_VALUE, MAX_VALUE → MAX_VALUE
//2, 2 → 2
//23456,23455 -> 23456
//23456,2345578 -> 2345578
//-78,123 -> 123
//-78,-56 -> -56
//Integer.MAX_VALUE + 1, 123 ->123
//Integer.MIN_VALUE - 1; 123 -> firstNumber

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

    @Order(3)
    @Test
    public void testGetBiggerValueAIsZero(){
        int a = 0;
        int b = -2147;
        int expectedResult = 0;

        BiggerValue biggervalue = new BiggerValue();
        int actualResult = biggervalue.getBiggerValue(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testGetBiggerValueNumberAEqualsNumberTwo(){
        int a = 333;
        int b = 333;
        int expectedResult = 333;

        BiggerValue biggervalue = new BiggerValue();
        int actualResult = biggervalue.getBiggerValue(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testGetBiggerValueNegativeNumbers(){
        int a = -333;
        int b = -666;
        int expectedResult = -333;

        BiggerValue biggervalue = new BiggerValue();
        int actualResult = biggervalue.getBiggerValue(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }


}
