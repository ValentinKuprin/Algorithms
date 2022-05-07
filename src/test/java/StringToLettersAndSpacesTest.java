import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class StringToLettersAndSpacesTest {

    @Order(1)
    @Test
    public void testStringToLettersAndSpaces() {
        String str1 = "qwerty 234 !@#$%^&*{}:<>,.";
        String expectedResult = "qwerty  ";

    }

}
