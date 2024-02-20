package lesson_25;

public class Wrappers {
    /*
    Byte - обертка для примитива Byte;
    Short  - для short;
    Integer - int.
    Long - long;
    Double - double
    Character - char
    Boolean  - boolean
     */
    public static void main(String[] args) {

        Integer integer;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("max" + maxValue);
        System.out.println("min" + Integer.MIN_VALUE);

        integer = null; // поддержка null

        Integer wrappedInt = 5; // авто упаковка примитива int в ссылочкый тип Integer
        int primitiveInt = wrappedInt; //  автораспаковка. из типа Integer автоматически преобразовало в int.

        // сравнение объектов. == сравнение по ссылке.
        //  - 128..127 - сравнение по ссылкам может работать не так как мы ожидаем.

        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);// true

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d);// false
        System.out.println(c.equals(d)); // true.


        // схожие методы для всех оберточных типов.
        // valueOf() - преобразует явным образом или строку вс оответствующую обертку
        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);
        System.out.println("valueOf == " + (e == f));

        Integer intStr = Integer.valueOf("123");
        System.out.println(intStr + 100);

        // parseXXX() - преобразует строку в соответствующий примитив.
        System.out.println(Integer.parseInt("456") + 100);
        System.out.println(Double.parseDouble("344.56") + 200.0);

        System.out.println(intStr.toString()+ " hello ");

        // equals - сравнивает по значению
        // compareTo - Сравнивает текущий объект с другим объектов.
        System.out.println(e.compareTo(f)); // 127 vs 127->0
        System.out.println(e.compareTo(d)); // 127 vs 128->minus

        // xxx.Value() - возвращает объект как соответствующий примитив
        Double d1 = Double.valueOf(125.67);
        double dPrimitive = d1.doubleValue();


        //===========================

        // все числовые обёртки над примитивами наследуються от абстракнтного класса Number.

        Number number = Integer.valueOf(125);

        /*Методы для приведения любого числового обёточного типа к примитиву.
        byteValue()
        shortValue()
        intValue()
        longValue()
        floatValue()
        doubleValue()
         */

        Integer integer1 = 31844;
        Double dValue = 345.78;

        System.out.println(integer1.doubleValue());

        int intFromDouble = dValue.intValue();
        System.out.println(intFromDouble);



    }
}
