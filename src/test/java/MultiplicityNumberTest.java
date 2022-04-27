import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MultiplicityNumberTest {

    @Order(1)
    @Test
    public void testMultiplicityNumberHappyPathMultipleFiveAndThree() {
        // 15, -15
        int m = 15;
        String expectedResult = "Good number";

        MultiplicityNumber multiplicityNumber = new MultiplicityNumber();
        String actualResult = multiplicityNumber.getMultipleNumber(m);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testMultiplicityNumberHappyPathNegativeNumberMultipleFiveAndThree() {
        // 15, -15
        int m = -120;
        String expectedResult = "Good number";

        MultiplicityNumber multiplicityNumber = new MultiplicityNumber();
        String actualResult = multiplicityNumber.getMultipleNumber(m);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testMultiplicityNumberHappyPathNumberMultipleThreeNotFive() {
        //
        int m = 18;
        String expectedResult = "Incorrect number";

        MultiplicityNumber multiplicityNumber = new MultiplicityNumber();
        String actualResult = multiplicityNumber.getMultipleNumber(m);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testMultiplicityNumberHappyPathNegativeNumberMultipleThreeNotFive() {
        //
        int m = -21;
        String expectedResult = "Incorrect number";

        MultiplicityNumber multiplicityNumber = new MultiplicityNumber();
        String actualResult = multiplicityNumber.getMultipleNumber(m);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testMultiplicityNumberHappyPathNumberMultipleFiveNotThree() {
        //
        int m = 50;
        String expectedResult = "Bad number";

        MultiplicityNumber multiplicityNumber = new MultiplicityNumber();
        String actualResult = multiplicityNumber.getMultipleNumber(m);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testMultiplicityNumberHappyPathNegativeNumberMultipleFiveNotThree() {
        //
        int m = -1000;
        String expectedResult = "Bad number";

        MultiplicityNumber multiplicityNumber = new MultiplicityNumber();
        String actualResult = multiplicityNumber.getMultipleNumber(m);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testMultiplicityNumberHappyPathNumberIsZero() {
        //
        int m = 0;
        String expectedResult = "Good number";

        MultiplicityNumber multiplicityNumber = new MultiplicityNumber();
        String actualResult = multiplicityNumber.getMultipleNumber(m);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testMultiplicityNumberHappyPathNumber_____() {//Dorsn't saticfy
        //
        int m = 13;
        String expectedResult = "-1";

        MultiplicityNumber multiplicityNumber = new MultiplicityNumber();
        String actualResult = multiplicityNumber.getMultipleNumber(m);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
