package lesson_27.persons.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @BeforeEach
    public void setUp() {
        System.out.println("BeforEach");
    }
    // @BeforAll - метод запускается один раз перед выполнением первого теста
    //@AfterEarch - выполняется после каждого тестового метода
    //@afterAll - вывполняется один раз после всех тестовых методов
    //@Disambled - указывает что тест или группа тестовых выполняться не будет
    //@Nested - позволяет создавать вложенный текстовый класс.


    @Test // указывает что метод тестовый.
    public void testAddition() {
        int result = 2 + 2;
        Assertions.assertEquals(4, result);
        Assertions.assertNotEquals(5, result);
        assertTrue(4 == result);// checksIfTheConditionIsEqual.
        assertFalse(5 == result); // проверяет что условие ложно.
        assertNull(null);// проверяет , что объект равен нулль
        assertNotNull("String");// не равен нулю.
    }

    @ParameterizedTest
    @EnumSource(EnumTest.class)
    void testEnums(EnumTest value) {
        assertNotNull(value);
    }

    // В качестве источника данных может быть статический метод
    @ParameterizedTest
    @MethodSource("stringProvider")
    public void testFruitsMethod(String aargument) {
        System.out.println("Current stream arg: " + aargument);
        Assertions.assertTrue(aargument.length() > 0);

    }

    static Stream<String> stringProvider() {
        return Stream.of("apple", "banana", "fig", "orange");
    }

    @ParameterizedTest
    @CsvSource({"apple, 1, true", "Banana, 2, false", "Cherry, 3, true"})
    public void testWithCsvSource(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + flag);
        assertNotNull(fruit);
        assertTrue(rank > 0);

    }

    @ParameterizedTest
    @MethodSource("squareTestData")
    public void testSquare(int input, int expected, boolean isEqual) {
        int result = input * input;
        Assertions.assertEquals(expected, result);
        assertEquals(isEqual, result == expected);
    }
    static Stream<Arguments> squareTestData(){
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7})
    public void testInts(int value) {
        System.out.println(value);
        Assertions.assertTrue(value > 0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "Cherry", "fig"})

    public void testFruits(String fruit) {
        System.out.println("current value: " + fruit);
        Assertions.assertTrue(fruit.length() > 3);

    }

    @Disabled
    @Test
    public void testMethod() {
        System.out.println("TEST");
    }

}