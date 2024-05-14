package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Easy {

    public static void main(String[] args) {
        tribonacci(4);
    }

    /**
     * 1768. (Easy) Merge Strings Alternately
     * "abc" + "pqr" = "apbqcr"
     * @param word1
     * @param word2
     * @return
     */
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i));
            i++;
            sb.append(word2.charAt(j));
            j++;
        }

        while (i < word1.length()) {
            sb.append(word1.charAt(i));
            i++;
        }

        while (j < word2.length()) {
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
    }

    public static int tribonacci(int n) {
        int[] d = new int[n+1];

        for (int j = 1; j <= n; j++) {
            if (j == 1 || j == 2) {
                d[j] = 1;
            } else if (j == 3) {
                d[j] = 2;
            } else {
                System.out.println(Arrays.toString(d));
                d[j] = d[j-1] + d[j-2] + d[j-3];
                System.out.println(Arrays.toString(d));
            }
        }

        return d[n-1];
    }

    public static int minCostClimbingStairs(int[] cost) {
        int[] d = new int[cost.length+1];
        int n = cost.length;

        for (int i = 0; i < n-1; i++) {
            d[i] = Math.min(cost[i], cost[i+1]);
        }



        return d[n];
    }
}
