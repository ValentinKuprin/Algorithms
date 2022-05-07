import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class StringToLettersTest {

    @Order(1)
    @Test
    public void testStringToLettersHappyPathLowerCase() {

        String str = "8945pui690e45p7y6907i3=-]ly5]";
        String expectedResult = "puiepyily";

        StringToLetters stringToLetters = new StringToLetters();
        String actualResult = stringToLetters.getStringToLetters(str);
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testStringToLettersHappyPathLowerCaseUpperCase() {

        String str = "8945Pui690e45p7y6907i3=-]lY5]";
        String expectedResult = "PuiepyilY";

        StringToLetters stringToLetters = new StringToLetters();
        String actualResult = stringToLetters.getStringToLetters(str);
        Assertions.assertEquals(expectedResult, actualResult);

    }
}
