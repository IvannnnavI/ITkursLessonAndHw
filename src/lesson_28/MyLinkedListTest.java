package lesson_28;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.MyLinkedList;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    private MyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new MyLinkedList<>();
    }

    @Test
    void addLast() {
        list.addLast(10);
        assertEquals(Integer.valueOf(10), list.getLast(), "Последний элемент должен быть 10 после addLast");
    }

    @Test
    void addFirst() {
        list.addFirst(20);
        assertEquals(Integer.valueOf(20), list.getFirst(), "Первый элемент должнен быть 20 после addFirst");
    }

    @Test
    void remove() {
        list.add(30);
        list.remove();
        assertTrue(list.isEmpty(), "Список должен быть пустым после удаления");
    }

    @Test
    void removeLast() {
        list.add(40);
        list.add(50);
        assertEquals(Integer.valueOf(50), list.removeLast(), "removeLast должен вернуть последний элемент");
    }

    @Test
    void add() {
        list.add(60);
        assertEquals(1, list.size(), "Размер списка должен быть равен 1 после добавления элемента.");
    }

    @Test
    void addAll() {
        list.addAll(70, 80 , 90);
        assertEquals(3, list.size(), "Размер списка должен быть 3 после добавления 3 элементов");
    }

    @Test
    void size() {
        list.add(100);
        list.add(110);
        assertEquals(2, list.size(), "Размер списка должен стать 2 после добавления 2 элементов");
    }

    @Test
    void indexOf() {
        list.add(120);
        list.add(130);
        list.add(140);
        list.add(150);
        assertEquals(3, list.indexOf(150), "Индекс значения 150 должен быть 3");

    }

    @Test
     void lastIndexOf() {
        list.addAll(160, 170, 180, 190);
        assertEquals(3, list.lastIndexOf(190), "Последний индекс элемента 190 должен быть 3");
    }

    @Test
     void toArray() {
        list.add(200);
        list.add(210);
        Object[] array = list.toArray();
        assertArrayEquals(new Integer[]{200, 210}, array, "Массив должен содержать [200, 210]");

    }

    @Test
    void contains() {
        list.add(220);
        assertTrue(list.contains(220), "Список должен содержать 220");
    }

    @Test
    void testRemove() {
        list.add(230);
        list.remove(Integer.valueOf(230));
        assertFalse(list.contains(230),"Список не должен содержать элемента 230 после Remove");
    }

    @Test
    void testRemove1() {
        list.add(240);
        list.add(250);
        list.remove(0);
        assertFalse(list.contains(240),"Cписок не должен содержать 240 после удаления по индексу.");
    }

    @Test
    void isEmpty() {
        assertTrue(list.isEmpty(),"Новый список должен быть пуст.");
    }

    @Test
    void get() {
        list.add(260);
        assertEquals(Integer.valueOf(260),list.get(0),"Элемент с индексом 0 должен быть 260");
    }

    @Test
    void set() {
        list.add(270);
        list.set(0,280);
        assertEquals(Integer.valueOf(280),list.get(0),"Элемент с индексом 0 должен получить значение 280");
    }

    @Test
    void testToString() {
        list.add(290);
        list.add(300);
        assertEquals("[290, 300]",list.toString(),"toString должен вернуть '[290, 300]' ");

    }

    @Test
    void getFirst() {
        list.add(310);
        assertEquals(Integer.valueOf(310),list.getFirst(),"Первый элемент должен быть 310");
    }

    @Test
    void getLast() {
        list.add(320);
        list.add(330);
        assertEquals(Integer.valueOf(330),list.getLast(),"Последний элемент должен быть 330");
    }

    @Test
    void removeFirst() {
        list.add(340);
        list.add(350);
        assertEquals(Integer.valueOf(340),list.removeFirst(),"removeFirst должен вернуть первый элемент");
    }
}