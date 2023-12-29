package swfm1121.team5.hw3;

public class NumberSort {
    public static int[] sortNumbers(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return numbers;
        }
        int n = numbers.length;
        int i = 1;
        while (i < n) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
            i = i + 1;
        }
        return numbers;
    }
}
