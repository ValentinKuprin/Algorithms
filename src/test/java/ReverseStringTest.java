import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    @Order(1)
    @Test
    public void testReverseStringHappyPath() {
        String str = "Abracadabra";
        String expectedResult = "arbadacarbA";

        ReverseString reverseString = new ReverseString();
        String actualResult = reverseString.reverseString(str);
        Assertions.assertEquals(expectedResult, actualResult);

    }
}
