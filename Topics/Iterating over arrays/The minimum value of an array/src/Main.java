import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];

        for(int i = 0; i < length; i++) { // fill Array
            int inputVal = scanner.nextInt();
            array[i] = inputVal;
        }

        int min = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] <= min) {
                min = array[i];
            }
        }


        System.out.print(min);
    }
}