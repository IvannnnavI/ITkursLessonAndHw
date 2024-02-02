package lesson_03;

public class TypeCasting {
    public static void main(String[] args) {
        // Приведение типов(преобразование типов из одного в другой)


        // неявное преобразование: когда меньший преобразуется в больший
        // например byte-> short; int -> long
        byte byteV = 123;
        int intV;
        intV = byteV;
        System.out.println(intV);
        double doubleV;
        doubleV = intV;
        System.out.println(doubleV);

        // явное преобразование когда мы больший тип пытаемся преобразовать в меньший;

        doubleV = 125.65;
        intV = (int)doubleV; // явное преобразование
        System.out.println("intV: " + intV);

        System.out.println("================");
        int x = 20;
        int y = 7 ;
        double result;
        result =  x / (double) y; // Когда в выражении присутствует один дабл, операция происходит как с типом дабл
        System.out.println(result);

    }
}
