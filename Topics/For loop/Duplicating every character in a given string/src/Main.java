import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Scanner class
        Scanner scanner = new Scanner(System.in);

        // Read the input string from the user
        String input = scanner.nextLine();

        // Initialize a new string to store the result
        String result = "";

        // Your code here
        String[] words = input.split("", 0);

        for(String word : words){
            result += word + word;
        }

        // Print the result to the standard output
        System.out.println(result);
    }
}