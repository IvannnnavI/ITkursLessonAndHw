package lesson_25;

public class GenericsMethods {
    public static <T> void printBoxes(GenericsBox<T>[] boxes) {
        for (GenericsBox<T> box : boxes) {
            System.out.println(box + "; ");
        }
    }
}
