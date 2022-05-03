import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
//555 -> true
//0 -> true
//-555 -> false
//Integer.MAX_VALUE + 1 -> false
//Integer.MAX_VALUE - 1 -> true
//Integer.MAX_VALUE  -> true
//Integer.MIN_VALUE  -> false

public class IsPositiveNumberTest {

    @Order(1)
    @Test
    public void testIsPositiveNumberHappyPathPositiveNumber() {
        int number = 555;
        boolean expectedResult = true;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.IsPositiveNumber(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testIsPositiveNumberHappyPathNumberIsZero() {
        int number = 0;
        boolean expectedResult = true;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.IsPositiveNumber(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testIsPositiveNumberHappyPathNegativeNumber() {
        int number = -555;
        boolean expectedResult = false;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.IsPositiveNumber(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testIsPositiveNumberHappyPathMaxValue() {
        int number = Integer.MAX_VALUE;
        boolean expectedResult = true;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.IsPositiveNumber(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testIsPositiveNumberHappyPathMinValue() {
        int number = Integer.MIN_VALUE;
        boolean expectedResult = false;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.IsPositiveNumber(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
