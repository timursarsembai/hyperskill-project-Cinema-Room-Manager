import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.nextLine();
        String num = scanner.nextLine();
        String[] nums = num.split(" ");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]) + 1;
        String res = str.substring(a, b);
        System.out.print(res);
    }
}