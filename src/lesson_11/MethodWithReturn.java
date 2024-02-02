package lesson_11;

public class MethodWithReturn {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        sumnumbers(x,y);

        int sum = sumNumbersWithReturn(x , y);
        System.out.println("sum " + sum);
        System.out.println(sumNumbersWithReturn(10, 45));

        int [] testArray = {11, 55, 34, 65, 43};
        int findMe = 65;

        boolean isExist = isDigitInArray(testArray,findMe);
        System.out.println("is digit in array - > " + isExist);




    }
    //  написать метод , который о
    //
    //
    public static boolean isDigitInArray( int[] numbers, int searchME) {
        // 1. Перебрать значения в массив
        // 2. Сравнить текущий элемент в искомым значением
        // 3. Если равны - вернуть из метода true
        // 4. А если ни одно из значений не равно, то вернуть false

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] == searchME) return true;
        }
        return false;
    }
    public static void sumnumbers(int i, int k) {
        int result = i + k;
        System.out.println(result);
    }

    public static int sumNumbersWithReturn(int i, int k) {
        int result = i + k;
        return result;
    }
}
