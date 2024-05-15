package Top150;

import java.util.Arrays;

public class UniquePaths {

    /**
     * 63. Unique Paths II (Medium)
     * m x n grid where 1's are obstacles, 0's clear
     * you can only move right or down
     * return number of possible paths to the bottom right (m-1, n-1) point
     * @param grid
     * @return
     */
    private static int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] d = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {
                    d[i][j] = 0;
                } else if (j == 0 &&  i == 0) {
                    d[i][j] = 1;
                } else if (i == 0) {
                   d[i][j] = d[i][j-1];
                }
                else if (j == 0) {
                    d[i][j] = d[i-1][j];
                }
                else {
                    d[i][j] = d[i-1][j] + d[i][j-1];
                }
            }
        }

        System.out.println(Arrays.deepToString(d));
        return d[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] g = {{0,0,0}, {0,1,0}, {0,0,0}};
        int res = uniquePathsWithObstacles(g);
        int exp = 2;
        System.out.println(res);

        int[][] g_2 = {{0,1}, {0,0}};
        int res_2 = uniquePathsWithObstacles(g_2);
        int exp_2 = 1;
        System.out.println(res_2);

        int[][] g_3 = {{1, 0}};
        int exp_3 = 0;
        int res_3 = uniquePathsWithObstacles(g_3);
        System.out.println(res_3);
    }


}
