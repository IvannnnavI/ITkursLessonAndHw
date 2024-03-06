package lesson_36.hW_36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorHWTest {

    @BeforeEach
    void setUp() {
    }
    @Test
    void testMyComparator(){
        Integer[] actual = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
        Integer[] expected = {2, 4, 6, 8, 1, 3, 5, 7, 7, 9};
        Comparator<Integer> myComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if ((o1 % 2 == 0) && (o2 % 2 != 0)) {
                    return -1;
                } else if ((o1 % 2 != 0) && (o2 % 2 == 0)) {
                    return 1;
                } else {
                    return o1 - o2;
                }
            }
        };
        Arrays.sort(actual,myComparator);
        assertArrayEquals(expected,actual,"Мой Компаратор должен сортировать массив как ожидается. ");
    }
    @Test
    public void testMyComparator2() {
        Integer[] actual = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
        Integer[] expected = {2, 4, 6, 8, 9, 7, 7, 5, 3, 1};
        Comparator<Integer> myComparator2 = ((o1, o2) -> {
            if ((o1 % 2 == 0) && (o2 % 2 == 0)) {
                return o1 - o2;
            } else if ((o1 % 2 != 0) && (o2 % 2 != 0)) {
                return o2 - o1;
            } else if ((o1 % 2 == 0) && (o2 % 2 != 0)) {
                return -1;
            }else {
                return 1;
            }
        });
        Arrays.sort(actual,myComparator2);
        assertArrayEquals(expected,actual,"Мой Компаратор2 должен сортировать массив как ожидается.");

    }
}