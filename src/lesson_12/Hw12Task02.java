package lesson_12;

//Написать метод, принимающий на вход массив целых чисел. Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве
//
//вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}

public class Hw12Task02 {
    public static void main(String[] args) {
        int[] numbers = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        System.out.print("Исходный массив: ");
        printArray(numbers);
        System.out.println("Простые числа исходного массива: ");
        printArray(findPrimes(numbers));
    }
    public static int [] findPrimes (int [] numbers) {
        int countPrimes = 0;
        for (int number : numbers) {
            if(isPrime(number)){
                countPrimes++;
            }
        }
        int[] primes = new int [countPrimes];
        int index = 0;
        for (int number : numbers) {
            if(isPrime(number)){
                primes[index++] = number;
            }
        }
        return primes;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        for (int i = 5; i < Math.sqrt(number); i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
        }
    }
}
