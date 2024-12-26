import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxTemperature = 0; // Initialize maximum temperature observed
        int temp = 1;
        // Add your while loop or do-while loop here to process input temperatures
        while(temp > 0){
            int inputNum = scanner.nextInt();
            if(inputNum > maxTemperature){
                if(inputNum < 99){
                    maxTemperature = inputNum;
                    temp = inputNum;
                } else {
                    temp = 0;
                }
            }
        }

        // After exiting the loop, print the highest temperature
        System.out.println(maxTemperature);

        scanner.close(); // Close the scanner
    }
}