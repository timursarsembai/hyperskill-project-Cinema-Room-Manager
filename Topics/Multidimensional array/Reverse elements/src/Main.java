import java.util.Arrays;

class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here

        for(int i = 0; i < twoDimArray.length; i++) {
            int k = twoDimArray[i].length - 1;
            int temp = 0;
            if(k >= 0) {
                int a = twoDimArray[i].length / 2;
                for(int j = 0; j < a; j++) {
                    temp = twoDimArray[i][j];
                    twoDimArray[i][j] = twoDimArray[i][k];
                    twoDimArray[i][k] = temp;
                    k--;
                }
            }

        }
    }
}