package lesson_14.hw;
// Написать метод по поиску строки в массиве строк. На вход метод принимает массив строк, и строку для поиска.
public class Hw14Task03 {
    public static void main(String[] args) {
        String[] searchArray = {"Java", "PiJava", "Chto-je", "mne", "escho", "pridumat"};
        System.out.println(contains(searchArray, "Java"));


    }
    public static boolean contains (String[] array, String target){
        for (String element : array) {
            if (element != null && element.equals(target)) {
                return true;
            }
        }
        return false;
    }
}
