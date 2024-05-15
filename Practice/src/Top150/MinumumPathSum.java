package Top150;

import java.util.Arrays;

public class MinumumPathSum {

    /**
     * 64. Mininum Path Sum
     * Given m x n grid filled with non-negative numbers
     * find path from top left to bottom right with smallest sum of numbers
     * can only move down or right
     * @param grid
     * @return
     */
    private static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] d = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    d[i][j] = grid[i][j];
                } else if (i == 0) {
                    d[i][j] = d[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    d[i][j] = d[i - 1][j] + grid[i][j];
                } else {
                    d[i][j] = Math.min(
                            d[i-1][j],
                            d[i][j-1]
                    ) + grid[i][j];
                }
            }
        }

        //solution will be in final spot in array
        System.out.println(Arrays.deepToString(d));
        return d[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] g = {{1,3,1}, {1,5,1}, {4,2,1}};
        int res = minPathSum(g);
        int exp = 7;
        System.out.println(res);

        int[][] g_2 = {{1,2,3}, {4,5,6}};
        int res_2 = minPathSum(g_2);
        int exp_2 = 12;
        System.out.println(res_2);
    }

}
