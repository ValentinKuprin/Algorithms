import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
//Input = {} → {}
//Input = {-46} → {}
//"testOddIndicesEvenLength
//array = {-45, 590, 234, 985, 12, 68} -> {590, 985, 68}"
//"testOddIndicesOddArrayLength
//array = {-45, 590, 234, 985, 12, 68, -234,34,-076} ->
//{590,985,68,34}"

public class OddIndicesTest {


    @Order(1)
    @Test
    public void testOddIndicesHappyPath() {

        int[] array = new int[] {-45, 590, 234, 985, 12, 68};
        int[] expectedResult =  {590, 985, 68};

        OddIndices oddIndies = new OddIndices();
        int[] actualResult = oddIndies.OddIndices(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddIndicesEmptyArray() {

        int[] array = new int[] {};
        int[] expectedResult =  {};

        OddIndices oddIndies = new OddIndices();
        int[] actualResult = oddIndies.OddIndices(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddIndicesOneNumber() {

        int[] array = new int[] {-1};
        int[] expectedResult =  {};

        OddIndices oddIndies = new OddIndices();
        int[] actualResult = oddIndies.OddIndices(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }







}
