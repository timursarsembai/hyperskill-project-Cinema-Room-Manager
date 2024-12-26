import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int i = 1;
        int start = scanner.nextInt();
        boolean hasNum = scanner.hasNextInt();
        int maxNum = 0;
        while(i <= start) {
            int userNum = scanner.nextInt();
            if(userNum % 4 == 0) {
                if(maxNum < userNum) {
                    maxNum = userNum;
                }
            }
            i++;
        }
        System.out.print(maxNum);
    }
}