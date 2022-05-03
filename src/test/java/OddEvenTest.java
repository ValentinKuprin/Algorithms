import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
//Input = 2345 -> "Odd"
//Input = 2344 -> "Even"
//Input = 0 -> "Even"
//Input = -2340 -> "Even"
//Input = -347 -> "Odd"
//Input= 2147483647 + 1 -> "Undefined"
//Input= -2147483648 - 1 -> "Undefined"

public class OddEvenTest {


    @Order(1)
    @Test
    public void testGetOddOrEvenNegativeOddNumber() {

        Long number = -345l;
        String expectedResult = "Odd";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddOrEven(number);
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
