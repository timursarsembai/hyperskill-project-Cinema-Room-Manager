import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                int num = Integer.parseInt(sc.next());
                matrix[i][j] = num;
            }
        }

        boolean isSymmetric = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false; // Найдено нарушение симметрии
                    break;
                }
            }
            if (!isSymmetric) break; // Прерываем внешний цикл
        }

        // Вывод результата
        System.out.println(isSymmetric ? "YES" : "NO");
    }
}
