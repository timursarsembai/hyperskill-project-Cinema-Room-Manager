import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        float a = scanner.nextInt();
        float b = scanner.nextInt();
        float sum = 0;
        float c = 0;
        for(a = a; a <= b; a++){
            if(a % 3 == 0){
                sum += a;
                c++;
            }
        }

        System.out.print(sum/c);
    }
}