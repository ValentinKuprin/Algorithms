import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class PeakElementTest {

    @Order(1)
    @Test
    public void testPeakElement () {
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        PeakElement peakElement = new PeakElement();
        int[] actualResult = peakElement.getPeakElement(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
