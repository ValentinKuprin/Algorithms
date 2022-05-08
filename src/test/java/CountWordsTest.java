import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class CountWordsTest {


    @Order(1)
    @Test
    public void testCountWordsHappyPathBigLatterAndSmallLatter() {
        String str = "As of March 2022, Java 18 is the latest version, while Java 17, "
                + "11 and 8 are the current long-term support (LTS) versions. Oracle released "
                  + "the last zero-cost public update for the legacy version Java 8 LTS in January 2019 "
                    + "for commercial java use, although it will otherwise still support Java 8 with public "
                      + "updates for personal use indefinitely. Other vendors have begun to offer zero-cost "
                        + "builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String word = "Java";
        int expectedResult = 5;

        CountWords countWords = new CountWords();
        int actualResult = countWords.countWords(str, word);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testCountWordsHappyPathsEndingS() {
        String str = "As of March 2022, Java 18 is the latest version, while Java 17, "
                + "11 and 8 are the current long-term support (LTS) versions. Oracle released "
                  + "the last zero-cost public update for the legacy version Java 8 LTS in January 2019 "
                    + "for commercial java use, although it will otherwise still support Java 8 with public "
                      + "updates for personal use indefinitely. Other vendors have begun to offer zero-cost "
                        + "builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String word = "version";
        int expectedResult = 2;

        CountWords countWords = new CountWords();
        int actualResult = countWords.countWords(str, word);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testCountWordsHappyPathStringIsEmpty() {
        String str = "";
        String word = "Java";
        int expectedResult = -1;

        CountWords countWords = new CountWords();
        int actualResult = countWords.countWords(str, word);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testCountWordsHappyPathStringIsNull() {
        String str = null;
        String word = "Java";
        int expectedResult = -1;

        CountWords countWords = new CountWords();
        int actualResult = countWords.countWords(str, word);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testCountWordsHappyPathsWordIsEmpty() {
        String str = "As of March 2022, Java 18 is the latest version, while Java 17, "
                + "11 and 8 are the current long-term support (LTS) versions. Oracle released "
                + "the last zero-cost public update for the legacy version Java 8 LTS in January 2019 "
                + "for commercial java use, although it will otherwise still support Java 8 with public "
                + "updates for personal use indefinitely. Other vendors have begun to offer zero-cost "
                + "builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String word = "";
        int expectedResult = -1;

        CountWords countWords = new CountWords();
        int actualResult = countWords.countWords(str, word);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testCountWordsHappyPathsCountSpace() {
        String str = "As of March 2022, Java 18 is the latest version, while Java 17";
        String word = " ";
        int expectedResult = 11;

        CountWords countWords = new CountWords();
        int actualResult = countWords.countWords(str, word);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testCountWordsHappyPathsCountComma() {
        String str = "As of March 2022, Java 18 is the latest version, while Java 17";
        String word = ",";
        int expectedResult = 11;

        CountWords countWords = new CountWords();
        int actualResult = countWords.countWords(str, word);
        Assertions.assertEquals(expectedResult, actualResult);
    }



}
