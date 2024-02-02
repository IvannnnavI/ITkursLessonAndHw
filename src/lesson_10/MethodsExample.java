package lesson_10;

public class MethodsExample {
    public static void main(String[] args) {
        sayHello();
        // кусок кода(метод), который умеет выводить на экран код символа в десятичной системе счисления

        char ch = 'A';
        char ch1 = 'G';
        char ch2 = 't';

        printDecimalCode('V');
        printDecimalCode(ch);
        printDecimalCode(ch1);

        int[] array = {1, 45, 76, 37, 90, 5432, 397, 0, 45};
        System.out.println(array);

        printArray(array);

        array[4] = 4565;
        array[7] = array[4]*10;

        int var = 10;
        changeVar(var);


        System.out.println("Var from main: " + var);

        System.out.println("=======================\n");
        printArray(array);

        changeArrayElement(array);
        System.out.println("array[0] from main: " + array[0]);



    }// methods area
    public static void changeArrayElement(int[] numbers){
        numbers[0] = 1000;
        System.out.println("numbers[0] from meetod: " + numbers[0]);
        numbers = new int[4];
        numbers[0]= 2000;
        System.out.println(numbers[0]);
    }
    public static void changeVar (int number) {
        number = number +15;
        System.out.println("number from method" + number);
    }
    public static void printArray (int[]array ){
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + ((i < array.length -1) ? ", " : "]\n"));
        }

    }
    public static void printDecimalCode(char ch1) {
        System.out.println("Приняли в метод значение:" + ch1);
        System.out.println((int) ch1);
    }
    public static void sayHello () {
        int x=5;
        int y  = 10;
        int z = x + y;
        System.out.println("Hello");
        System.out.println(z);

    }
}
