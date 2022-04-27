import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OddEvenTest {


    @Order(1)
    @Test
    public void testGetOddOrEvenNegativeOddNumber() {

        Long a = -345l;
        String expectedResult = "Odd";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddOrEven(a);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testGetOddOrEvenIsZero() {

        Long a = 0l;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddOrEven(a);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testGetOddOrEvenPositiveEvenNumber() {
        Long a = 222222l;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddOrEven(a);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testGetOddOrEvenMoreThanInt() {
        // 0
        long a = 2147483647 + 1l;
        // "Odd" "Even" "Undefined"
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddOrEven(a);
        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Order(5)
    @Test
    public void testGetOddOrEvenLessThanInt() {
        // 0
        Long a = -2147483648 - 1l;
        // "Odd" "Even" "Undefined"
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddOrEven(a);
        Assertions.assertEquals(expectedResult, actualResult);
    }



}
