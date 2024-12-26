import java.util.Arrays;

class ArrayOperations {
    public static void printTheThirdRow(int[][] twoDimArray) {
        // write your code here
        for(int i = 0; i < twoDimArray.length; i++) {
            if(i == 2) {
                String s = "";
                for(int j = 0; j < twoDimArray[i].length; j++) {
                   s += twoDimArray[i][j] + " ";
                }
                System.out.println(s);
            } else {
                continue;
            }
        }
    }
}