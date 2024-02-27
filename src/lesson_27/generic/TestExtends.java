package lesson_27.generic;

import util.MyList;
import lesson_25.hW_25.RubberArrayHw;

public class TestExtends {
    public static void main(String[] args) {
        System.out.println(GenericMethods.sum(Long.valueOf(1500)));

        System.out.println(GenericMethods.sum(Double.valueOf(5.76),5.33,8.46));

        MyList<? super Integer> list = new RubberArrayHw<Number>();
    }


}
