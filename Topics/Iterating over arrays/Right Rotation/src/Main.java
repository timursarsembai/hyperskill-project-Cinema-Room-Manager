import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        int len = arr.length;
        steps = steps % len;

        // Выполняем реверсию всего массива
        reverse(arr, 0, len - 1);

        // Реверсия первых steps элементов
        reverse(arr, 0, steps - 1);

        // Реверсия оставшихся элементов
        reverse(arr, steps, len - 1);
    }

    // Метод для реверсии части массива
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}