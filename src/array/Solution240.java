package array;

public class Solution240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int x = 0;
        int y = n - 1;
        while (x < m && y >= 0){
            if (matrix[x][y] == target){
                return true;
            }
            if (target < matrix[x][y]){
                y--;
            }else {
                x++;
            }
        }

        return false;
    }
}
