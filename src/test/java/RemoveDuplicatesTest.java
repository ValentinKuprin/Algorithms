import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {

    @Order(1)
    @Test
    public void testRemoveDuplicatesHappyPathLerrers() {
        String input = "AABBCCaabbcc";
        String expectedResult = "abc";

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        String actualResult = removeDuplicates.removeDuplicates(input);
        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Order(2)
    @Test
    public void testRemoveDuplicatesHappyPathLerrersAndNumbers() {
        String input = "AA3BBCC11aa2bb2c3c";
        String expectedResult = "abc";

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        String actualResult = removeDuplicates.removeDuplicates(input);
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testRemoveDuplicatesHappyPathStringIsEmpty() {
        String input = "";
        String expectedResult = "Строка пустая";

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        String actualResult = removeDuplicates.removeDuplicates(input);
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(4)
    @Test
    public void testRemoveDuplicatesHappyPathStringIsNull() {
        String input = null;
        String expectedResult = "null";

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        String actualResult = removeDuplicates.removeDuplicates(input);
        Assertions.assertEquals(expectedResult, actualResult);

    }

}
