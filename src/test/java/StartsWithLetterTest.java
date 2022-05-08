import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class StartsWithLetterTest {

    @Order(1)
    @Test
    public void testStartsWithLetter() {
        String str = "As a decrepit father takes delight " +
                "To see his active child do deeds of youth, " +
                "So I, made lame by fortune’s dearest spite, " +
                "Take all my comfort of thy worth and truth. " +
                "For whether beauty, birth, or wealth, or wit, " +
                "Or any of these all, or all, or more, " +
                "Entitled in thy parts do crownèd sit, " +
                "I make my love engrafted to this store. " +
                "So then I am not lame, poor, nor despised, " +
                "Whilst that this shadow doth such substance give " +
                "That I in thy abundance am sufficed, " +
                "And by a part of all thy glory live. " +
                "Look what is best, that best I wish in thee. " +
                "This wish I have; then ten times happy me. ";
        String letter = "l";
        String expectedResult = "lame, love, lame, live, Look, ";

        StartsWithLetter startsWithLetter = new StartsWithLetter();
        String actualResult = startsWithLetter.startsWithLetter(str, letter);
        Assertions.assertEquals(expectedResult, actualResult);

    }
}
