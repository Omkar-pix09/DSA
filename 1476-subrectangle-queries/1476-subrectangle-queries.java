class SubrectangleQueries {

    int[][] a;

    public SubrectangleQueries(int[][] rectangle) {
        a = rectangle;
    }

    public void updateSubrectangle(int r1, int c1, int r2, int c2, int val) {
        for (int i = r1; i <= r2; i++)
            for (int j = c1; j <= c2; j++)
                a[i][j] = val;
    }

    public int getValue(int row, int col) {
        return a[row][col];
    }
}