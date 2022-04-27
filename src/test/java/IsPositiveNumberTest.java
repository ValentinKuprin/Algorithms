import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

    @Order(1)
    @Test
    public void testIsPositiveNumberHappyPath() {
        int a = 5;
        boolean expectedResult = true;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.IsPositiveNumber(a);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testIsPositiveNumberHappyPathNegativeNumber() {
        int a = -5;
        boolean expectedResult = false;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.IsPositiveNumber(a);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
