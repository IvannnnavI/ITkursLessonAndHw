package lesson_11.lesson11hw;
// Написать метод принимающий целое число и проверяющий является ли число простым.
// Если является, метод должен вернуть true, не является - false
//Написать метод, принимающий массив целых чисел. Метод должен вернуть количество простых чисел в массиве.
// Для проверки на "простоту" числа рекомендуется использовать метод из Task 1
//
public class Hw11Task01Task02 {
    public static void main(String[] args) {
        int testNumber = 17;
        boolean primeresult = isPrime(testNumber);
        System.out.println("Является ли простым число? " + testNumber + " - " + primeresult);

        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        int countPrimes = countPrimes(array);
        System.out.println("Количество простых чисел в массиве: " + countPrimes);

    }
    public static boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 ==0 ){
            return false;
        }
        for (int i = 3; i * i <= number; i+=2) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int countPrimes(int[]array){
        int count = 0;
        for (int number : array) {
            if (isPrime(number)) {
                count++;
            }
        }
        return count;
    }
}
