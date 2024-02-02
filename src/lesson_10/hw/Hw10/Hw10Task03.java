package lesson_10.hw.Hw10;

public class Hw10Task03 {
    public static int findKelement(int[] arr1, int[] arr2, int k) {
        int num1 = 0, num2 = 0;
        k--;
        while (true) {
            if (num1 == arr1.length) {
                return arr2[num2 + k];
            }
            if (num2 == arr2.length) {
                return arr1[num1 + k];
            }
            if (k == 0) {
                return
                        Math.min(arr1[num1], arr2[num2]);
            }
            int half = (k - 1) / 2;
            int newnum1 = Math.min(num1 + half, arr1.length - 1);
            int newnum2 = Math.min(num2 + half, arr2.length - 1);

            if (arr1[newnum1] < arr2[newnum2]) {
                k -= (newnum1 - num1 + 1);
                num1 = newnum1 + 1;
            } else {
                k -= (newnum2 - num2 + 1);
                num2 = newnum2 + 1;
            }
        }
    }
    public static void main(String[]args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;

        int result = findKelement(arr1, arr2, k);
        System.out.println("Искомое число: " + result);
    }
}
