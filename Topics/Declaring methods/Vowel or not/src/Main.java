import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        char[] letters = {
                    'a', 'e', 'i', 'o', 'u'
        };

        boolean flag = false;

        for(int i = 0; i < letters.length; i++) {
            if(Character.toLowerCase(ch) == letters[i]) {
                flag = true;
            }
        }
        return flag;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}