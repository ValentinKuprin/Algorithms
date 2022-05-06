import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class StringToNumbers10_15Test {

    @Order(1)
    @Test
    public void testStringToNumbersHappyPathNumbers () {

        String str = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5} ;

        StringToNumbers10_15 stringToNumbers10_15 = new StringToNumbers10_15();
        int[] actualResult = stringToNumbers10_15.getStringToNumbers(str);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testStringToNumbersHappyPathNegativeNumbers () {

        String str = "-1, 2, -3, 4, -5";
        int[] expectedResult = {-1, 2, -3, 4, -5} ;

        StringToNumbers10_15 stringToNumbers10_15 = new StringToNumbers10_15();
        int[] actualResult = stringToNumbers10_15.getStringToNumbers(str);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testStringToNumbersHappyPathsequenceZero () {

        String str = "0, 2, 3, 4, 5";
        int[] expectedResult = {0, 2, 3, 4, 5} ;

        StringToNumbers10_15 stringToNumbers10_15 = new StringToNumbers10_15();
        int[] actualResult = stringToNumbers10_15.getStringToNumbers(str);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(4)
    @Test
    public void testStringToNumbersHappyPathIsTwoDigits () {

        String str = "0, 2, 3, 40, 5";
        int[] expectedResult = {0, 2, 3, 40, 5} ;

        StringToNumbers10_15 stringToNumbers10_15 = new StringToNumbers10_15();
        int[] actualResult = stringToNumbers10_15.getStringToNumbers(str);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(5)
    @Test
    public void testStringToNumbersIsNull () {

        String str = null;
        int[] expectedResult = {} ;

        StringToNumbers10_15 stringToNumbers10_15 = new StringToNumbers10_15();
        int[] actualResult = stringToNumbers10_15.getStringToNumbers(str);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(6)
    @Test
    public void testStringToNumbersLetersAndNumbers () {

        String str = "a, 2, b, 4, 5";
        int[] expectedResult = {2, 4, 5} ;

        StringToNumbers10_15 stringToNumbers10_15 = new StringToNumbers10_15();
        int[] actualResult = stringToNumbers10_15.getStringToNumbers(str);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(7)
    @Test
    public void testStringToNumbersEmptyString () {

        String str = "";
        int[] expectedResult = {} ;

        StringToNumbers10_15 stringToNumbers10_15 = new StringToNumbers10_15();
        int[] actualResult = stringToNumbers10_15.getStringToNumbers(str);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testStringToNumbersStringOfLetters () {

        String str = "Hello";
        int[] expectedResult = {} ;

        StringToNumbers10_15 stringToNumbers10_15 = new StringToNumbers10_15();
        int[] actualResult = stringToNumbers10_15.getStringToNumbers(str);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testStringToNumbersStringOfSpace () {

        String str = " ";
        int[] expectedResult = {} ;

        StringToNumbers10_15 stringToNumbers10_15 = new StringToNumbers10_15();
        int[] actualResult = stringToNumbers10_15.getStringToNumbers(str);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
