// Don't delete scanner import
import java.util.Scanner;

class Name {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // use this program as a source of inspiration for your method

        String firstName = scanner.next();
        String lastName = scanner.next();
        String res = createFullName(firstName, lastName);
        System.out.println(res);

    }

    //implement your method here
    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}