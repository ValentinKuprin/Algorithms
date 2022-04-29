import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.beans.BeanProperty;

public class IntersectionTest {

    @Order(1)
    @Test
    public void testIntersection() {
        int[] array = new int[] {1, 2, 4, 5, 89};
        int[] array1 = new int[] {8, 9, 4, 2};
        int[] expectedResult = new int[] {2, 4};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.Intersection(array, array1);
        Assertions.assertArrayEquals(expectedResult, actualResult);
        //TODO: написать проверки

    }
    @Order(2)
    @Test
    public void testIntersectionFirstArrayEmpty() {
        int[] array = new int[]{};
        int[] array1 = new int[]{8, 9, 4, 2};
        int[] expectedResult = new int[]{};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.Intersection(array, array1);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testIntersectionSecondArrayEmpty() {
        int[] array = new int[]{1, 2, 4, 5, 89};
        int[] array1 = new int[]{};
        int[] expectedResult = new int[]{};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.Intersection(array, array1);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testIntersectionTwoArraysEmpty() {
        int[] array = new int[]{};
        int[] array1 = new int[]{};
        int[] expectedResult = new int[]{};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.Intersection(array, array1);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }



}
