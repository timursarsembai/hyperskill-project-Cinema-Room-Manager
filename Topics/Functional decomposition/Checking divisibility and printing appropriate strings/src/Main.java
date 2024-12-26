import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // function calls of isDivByThree, isDivByFive, isDivByThreeAndFive will be here
        if(num % 3 == 0 && num % 5 == 0) {
            isDivByThreeAndFive();
        } else if(num % 3 == 0) {
            isDivByThree();
        } else if(num % 5 == 0){
            isDivByFive();
        } else {
            System.out.print("None");
        }
    }
    // function isDivByThree will be here
    public static void isDivByThree(){
        System.out.print("Fizz");
    }

    // function isDivByFive will be here
    public static void isDivByFive(){
        System.out.print("Buzz");
    }

    // function isDivByThreeAndFive will be here
    public static void isDivByThreeAndFive(){
        System.out.print("FizzBuzz");
    }
}