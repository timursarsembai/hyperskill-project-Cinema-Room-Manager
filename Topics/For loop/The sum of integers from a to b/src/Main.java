import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        for(a = a; a <= b; a++){
            sum += a;
        }

        System.out.print(sum);
    }
}