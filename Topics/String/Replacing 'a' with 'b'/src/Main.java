import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.nextLine();
        String res = "";
        for(int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (letter == 'a') {
                res += 'b';
            } else {
                res += letter;
            }
        }
        System.out.println(res);
    }
}