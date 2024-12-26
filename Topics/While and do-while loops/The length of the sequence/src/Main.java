import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int i = -1;
        int num = 1;
        while(num != 0){
            num = scanner.nextInt();
            i++;
        }
        System.out.print(i);
    }
}