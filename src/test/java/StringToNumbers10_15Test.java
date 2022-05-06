import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class StringToNumbers10_15Test {

    @Order(1)
    @Test
    public void testStringToNumbers() {

        String str = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5} ;

        StringToNumbers10_15 stringToNumbers10_15 = new StringToNumbers10_15();
        int[] actualResult = stringToNumbers10_15.getStringToNumbers(str);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
