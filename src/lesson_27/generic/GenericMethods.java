package lesson_27.generic;

import lesson_25.hW_25.MyList;

public class GenericMethods {

    // Ограничение сверху. Ограничиваем диапазон принимаемых данных.

    public static <T extends Number> int sum(T...elemets){
        int sum = 0;
        for (T value:elemets){
            sum+= value.intValue();
        }
        return sum;
    }

//    public static void printListSum(MyList<? extends Number> listNumber){
//        double sum =0;
//        for (int i = 0; i < listNumber.size();i++){
//
//        }
//
//    }

}
