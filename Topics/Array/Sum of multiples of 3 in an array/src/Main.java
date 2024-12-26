import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create scanner instance to read input
        Scanner scanner = new Scanner(System.in);

        // read the number of elements
        int n = scanner.nextInt();

        // create your array here
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        // use a loop to read the array elements
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 3 == 0){
                sum += arr[i];
            }
        }

        // use a loop to calculate the sum of elements that are multiples of 3
        System.out.print(sum);

        // close the scanner
        scanner.close();
    }
}