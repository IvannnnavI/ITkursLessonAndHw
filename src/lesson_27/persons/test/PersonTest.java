package lesson_27.persons.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test // указывает что метод тестовый.
    public void testAddition() {
        int result = 2 + 2;
        Assertions.assertEquals(4, result);
        Assertions.assertNotEquals(5, result);
        assertTrue(4 == result);// checksIfTheConditionIsEqual.
        assertFalse(5==result); // проверяет что условие ложно.
        assertNull(null);// проверяет , что объект равен нулль
        assertNotNull("String");// не равен нулю.
    }

}