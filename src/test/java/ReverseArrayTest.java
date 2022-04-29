import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

    @Order(1)
    @Test
    public void testReverseArray() {
        int[] array = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        ReverseArray reverseArray = new ReverseArray();
        int[] actualResult = reverseArray.getReverseArray(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
