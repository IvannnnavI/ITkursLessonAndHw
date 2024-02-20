package lesson_25.hW_25;

public class GenericRubberArMain {
    public static void main(String[] args) {
        // Создаем экземпляр RubberArrayHw для хранения Integer
        RubberArrayHw<Integer> rubberArrayHw = new RubberArrayHw<>();

        // Добавляем элементы
        rubberArrayHw.add(1);
        rubberArrayHw.add(2);
        rubberArrayHw.add(3);
        System.out.println("После добавления элементов: " + rubberArrayHw);

        // Добавляем несколько элементов одновременно
        rubberArrayHw.addAll(4, 5, 6);
        System.out.println("После добавления нескольких элементов: " + rubberArrayHw);

        // Проверяем размер
        System.out.println("Размер: " + rubberArrayHw.size());

        // Получаем элемент по индексу
        System.out.println("Элемент с индексом 2: " + rubberArrayHw.get(2));

        // Устанавливаем значение элемента по индексу
        rubberArrayHw.set(2, 10);
        System.out.println("После установки элемента с индексом 2 на 10: " + rubberArrayHw);

        // Проверяем наличие элемента
        System.out.println("Содержит ли 10: " + rubberArrayHw.contains(10));
        System.out.println("Содержит ли 3: " + rubberArrayHw.contains(3));

        // Поиск индекса элемента
        System.out.println("Индекс элемента 10: " + rubberArrayHw.indexOf(10));
        System.out.println("Последний индекс элемента 10: " + rubberArrayHw.lastIndexOf(10));

        // Удаление элемента по значению и по индексу
        rubberArrayHw.remove(Integer.valueOf(10));
        System.out.println("После удаления элемента 10: " + rubberArrayHw);
        rubberArrayHw.remove(1); // Удаляем элемент на позиции 1 (второй элемент)
        System.out.println("После удаления элемента с индексом 1: " + rubberArrayHw);

        // Проверяем, пустой ли массив
        System.out.println("Пустой ли массив: " + rubberArrayHw.isEmpty());

        // Преобразуем в массив
        Integer[] array = rubberArrayHw.toArray();
        System.out.println("Преобразование в массив: " + java.util.Arrays.toString(array));
    }


}
