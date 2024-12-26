import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        int n = scanner.nextInt();

        // Start a loop from 1 to n (inclusive)
        for (int i = 1; i <= n; i++) {
            // Write your code here
            if(i == 5){
                continue;
            }
            if(i == 7){
                System.out.println(i + ": stopped");
                break;
            } else {
                System.out.println(i);
            }


        }
    }
}