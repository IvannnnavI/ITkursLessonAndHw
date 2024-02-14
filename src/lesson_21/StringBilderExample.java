package lesson_21;

public class StringBilderExample {
    public static void main(String[] args) {
        // StringBulder -  класс для работы с последовательностью символов
        // в отличии от Стринг объект СБ можно изменять после их создания
        // Полезен когда требуется много операций по изменению строки.


        StringBuilder sb = new StringBuilder();

        //append-  добавляет строковое представление любого типа данных к текущему объекту
        sb.append("Hello").append(" , ").append("World!");

        String result = sb.toString();
        System.out.println(result);

        // insert  - вставляет строку в указанную позицию текущего SB
        sb.insert(3,"Java");
        System.out.println(sb.toString());
        // delete, deleteCharAt - удаление диапазона по индексам ,удаление 1 символа по индексу
        sb.delete(3,6);
        System.out.println(sb.toString());
        sb.deleteCharAt(3);
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb.toString());

        System.out.println(sb.length());

        // setLength - устанавливает новую длину последовательности символов
        sb.reverse();
        System.out.println(sb.length());
        sb.setLength(11);


    }
}
