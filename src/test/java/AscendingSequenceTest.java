import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //Анатация для порядка тестов

public class AscendingSequenceTest {
    AscendingSequence as;

    @BeforeEach
        // Выполняется перед каждым тестом (прикондишн)
    void setUp() {
        as = new AscendingSequence();
    }

    @Order(1) // - порядок запуска тестов
    @RepeatedTest(50) // Сначала выполняется @Order(1)б после тест повторяется еще 50 раз
    @Test
    public void testAscendingSequenceHappyPathPositiveNumber() {
        // 0, 1, 2, 3, 4, 5
        int start = 0;
        int end = 5;    // 1ая А(arrange)-патерн отвечает за установку всех значений
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        //  Ascendingsequence(Тип данных) ascendingsequence(объект класса).
        //при static мы вызывали методы от класса, теперь мы вызываем от объекта класс
        // для этого создаем объект
        // AscendingSequence as = new AscendingSequence(); - ВЫНЕСЛИ В setUp() !
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step); // 2ая А(Act)-патерн, отвечает за действия (когда получаем актуальный результат)
//сначала ожидаемый результат потом актуальный ! в джейюнит ! в тест нджи наоборот !!
        Assertions.assertArrayEquals(expectedResult, actualResult); // 3я А(Assert)-патерн, сравнение ОР с ФР
    }


    @Order(2)
    @Test
    public void testAscendingSequenceHappyPathNegativeNumber() {
        // -10, -9, -8, -7, -6, -5
        int start = -10;
        int end = -5;    // 1ая А(arrange)-патерн отвечает за установку всех значений
        int step = 1;
        int[] expectedResult = {-10, -9, -8, -7, -6, -5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAscendingSequenceHappyPathNegativePositiveNumber() {
        // -10, -9, -8, -7, -6, -5
        int start = -5;
        int end = 5;    // 1ая А(arrange)-патерн отвечает за установку всех значений
        int step = 1;
        int[] expectedResult = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAscendingSequenceHappyPathStepTwo() {
        // -10, -9, -8, -7, -6, -5
        int start = 0;
        int end = 5;    // 1ая А(arrange)-патерн отвечает за установку всех значений
        int step = 2;
        int[] expectedResult = {0, 2, 4};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStartLargerThenEnd() {
        // -10, -9, -8, -7, -6, -5
        int start = 5;
        int end = 0;    // 1ая А(arrange)-патерн отвечает за установку всех значений
        int step = 2;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceNegativeStep() {
        // -10, -9, -8, -7, -6, -5
        int start = 0;
        int end = 5;    // 1ая А(arrange)-патерн отвечает за установку всех значений
        int step = -1;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStepIsZero() {
        // -10, -9, -8, -7, -6, -5
        int start = 0;
        int end = 5;    // 1ая А(arrange)-патерн отвечает за установку всех значений
        int step = 0;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


}
