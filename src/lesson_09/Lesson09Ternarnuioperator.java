package lesson_09;

public class Lesson09Ternarnuioperator {
    public static void main(String[] args) {
        int number = 10;
        String result;

        if (number>=0){
            result = "polojitelnoe";              // result = (number >= 10) ? "polojitelnoe" : "otrizatelnoe";
        }else {                                    // эта строчка заменяет цикл!!
            result = "otrizatelnoe";
        }

        result = (number >= 10) ? "polojitelnoe" : "otrizatelnoe";
        System.out.println("nashe 4islo "  + result);
    }
}
