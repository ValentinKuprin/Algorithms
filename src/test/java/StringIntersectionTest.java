import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class StringIntersectionTest {

    @Order(1)
    @Test
    public void testStringIntersection() {
        String str = "Corrotcar";
        String str1 = "washcar";
        String expectedResult = "car";

        StringIntersection stringIntersection = new StringIntersection();
        String actualResult = stringIntersection.stringIntersection(str, str1);
        Assertions.assertEquals(expectedResult, actualResult);


    }
}
