package lesson_25;

import lesson_16.Cat;

public class GenericsApp {
    public static void main(String[] args) {
        GenericsBox<String> boxstr = new GenericsBox<>("Hello!");
        System.out.println(boxstr);

        String strValue = boxstr.getValue();


        GenericsBox<Cat> catBoxes = new GenericsBox<>(new Cat());
        System.out.println(catBoxes);
        //catBoxes.setValue("Cat"); // тоже ошибка компиляции .

        //GenericsBox<int> не работают с примитивными типами данных. только со ссылочными типами.

        GenericsBox<Integer> integerBox = new GenericsBox<>(100);
        GenericsBox<Integer>[] boxes = new GenericsBox[3];
        boxes[0]= new GenericsBox<>(150);
        boxes[1]= new GenericsBox<>(170);
        boxes[2]= new GenericsBox<>(-150);

        int sum = 0;
        for (GenericsBox<Integer> val : boxes) {
            sum += val.getValue();

        }

        System.out.println(sum);
        GenericsMethods.printBoxes(boxes);
    }
}
