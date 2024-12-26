import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt(); // column count
        int row = sc.nextInt(); // row count

        if(col <= 100 && row <= 100) {
            int[][] arr = new int[col][row]; // array initialization

            for(int c = 0; c < arr.length; c++) {
                for(int r = 0; r < arr[c].length; r++) {
                    arr[c][r] = sc.nextInt(); // array fill
                }
            }

            int max = arr[0][0];
            int indexCol = 0;
            int indexRow = 0;

            for(int i = arr.length - 1; i >= 0; i--) {
                for(int j = arr[i].length - 1; j >= 0; j--) {
                    if(arr[i][j] >= max) {
                        max = arr[i][j];
                        indexCol = i;
                        indexRow = j;
                    }
                }
            }

            System.out.print(indexCol + " " + indexRow);
        }
    }
}