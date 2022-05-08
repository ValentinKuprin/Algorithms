import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class StringToNumbersAndSpacesTest {

        @Order(1)
        @Test
        public void testStringToNumbersAndSpacesHappyPathNumbers () {

            String str = "1356345 jgdflg";
            String expectedResult = "1356345 ";

            StringToNumbersAndSpaces stringToNumbersAndSpaces = new StringToNumbersAndSpaces();
            String actualResult = stringToNumbersAndSpaces.stringToNumbersAndSpaces(str);
            Assertions.assertEquals(expectedResult, actualResult);

        }
}
