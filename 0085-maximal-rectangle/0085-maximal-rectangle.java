class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;

        int m = matrix.length, n = matrix[0].length;
        int[] height = new int[n];
        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                height[j] = matrix[i][j] == '1' ? height[j] + 1 : 0;
            }

            int[] stack = new int[n + 1];
            int top = -1;

            for (int j = 0; j <= n; j++) {
                int h = j == n ? 0 : height[j];

                while (top >= 0 && height[stack[top]] > h) {
                    int ht = height[stack[top--]];
                    int width = top < 0 ? j : j - stack[top] - 1;
                    max = Math.max(max, ht * width);
                }

                stack[++top] = j;
            }
        }

        return max;
    }
}