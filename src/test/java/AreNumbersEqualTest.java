import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
//89,89 -> 0
//89, -89 ->1
//-9,89 -> -1
//Integer.MAX_VALUE ,89 -> 1
//Integer.MAX_VALUE + 1, 89 -> -1
// * //15 -> "Good Number"
// * 9 -> "Bad Number"
// * 25 -> "Poor Number"
// * 343 -> -1
// * -25 -> "Poor Number"
// * -27 -> "Bad Number"
// * 0 - > -1
// * -15 -> "Good Number"
// * -343 -> -1
//
// * Test Data:
// * 89, 89
// * Expected result: 0
// * -89, 89
// * Expected result: -1
// * 89, -89
// * Expected result: 1


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
