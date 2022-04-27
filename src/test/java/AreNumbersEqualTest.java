import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

    @Order(1)
    @Test
    public void testAreNumbersEqualAEuealB(){
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual areNumberEqual = new AreNumbersEqual();
        int actualResult = areNumberEqual.getAreNumbersEqual(a, b);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void testAreNumbersEqualALessThanB() {
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEqual areNumberEqual = new AreNumbersEqual();
        int actualResult = areNumberEqual.getAreNumbersEqual(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAreNumbersEqualAMoreThanB() {
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEqual areNumberEqual = new AreNumbersEqual();
        int actualResult = areNumberEqual.getAreNumbersEqual(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
