package lesson_16.hW_16;

public class MainRubberArrayHw {
    public static void main(String[] args) {
        //Добавление элемента:
        RubberArrayHw ra = new RubberArrayHw();
        ra.add(10);
        System.out.println("После добавления элемента 10: " + ra);

        ra.add(20);
        ra.add(25);
        System.out.println("После добавления элементов: " + ra);
        System.out.println("=============================================>\n");

        //Поиск элемента по значению
        int valueToFind = 20;
        int index = ra.indexOf(valueToFind);
        System.out.println("Индекс элемента со значением " + valueToFind + ": " + index);
        int valueToFind1 = 87;
        int index1 = ra.indexOf(valueToFind1);
        System.out.println("Индекс элемента со значением " + valueToFind1 + ": " + index1);
        System.out.println("=============================================>\n");

        //Возвращение значения по индексу
        int valueAtIndex = ra.get(1);
        System.out.println("Значение в массиве с индексом 1: " + valueAtIndex);
        int valueAtIndex2 = ra.get(5);
        System.out.println("Значение в массиве с индексом 5: " + valueAtIndex2);
        System.out.println("=============================================>\n");


        //Текущее количество элементов в массиве
        System.out.println("Колличество элементов в массиве: " + ra + " = " + ra.size());
        System.out.println("=============================================>\n");

        //Удаление элемента по индексу
        ra.minusAt(1);
        System.out.println("После удаления элемента с индексом 1: " + ra);
        ra.minusAt(8);


        //Добавление нескольких элементов (в качестве аргументов передает последовательность значений)
        ra.add(-13, 56, 18, 1955, 33, 0, 77);
        System.out.println("=============================================>\n");
        System.out.println("Массив после добавки нескольких элементов: " + ra);
        System.out.println("=============================================>\n");

        //Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями

        int[] initialValues = {78, 86, 96};
        RubberArrayHw ra2 = new RubberArrayHw(initialValues);
        System.out.println("Новый RuberArray с другими значениями" + ra2);
        System.out.println("=============================================>\n");

        //Удаление элемента по значению
        ra2.minusValue(78);
        System.out.println("Массив 2 после удаления значения 80: " + ra2);
        System.out.println("=============================================>\n");

        // Замена значения по индексу (есть индекс и новое значение)
        ra2.replaceAt(0, 100);
        System.out.println("Массив после замены по значению: " + ra2);
        ra.replaceAt(10, 900);
        System.out.println("=============================================>\n");

        //Замена значения по значению (есть старое и новое значение)
        ra2.replace(100, 110);
        System.out.println("Массив после замены всех элементов со значением 100 на значение 110: " + ra2);


    }

}
