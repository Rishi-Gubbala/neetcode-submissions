class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean firstRowZero = false, firstColZero = false;

        // Does the first row / first column originally contain a zero?
        for (int j = 0; j < n; j++)
            if (matrix[0][j] == 0) firstRowZero = true;
        for (int i = 0; i < m; i++)
            if (matrix[i][0] == 0) firstColZero = true;

        // Use first row/column as markers for the rest of the matrix
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }

        // Zero the inner cells based on the markers
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;

        // Finally handle the first row and column themselves
        if (firstRowZero)
            for (int j = 0; j < n; j++) matrix[0][j] = 0;
        if (firstColZero)
            for (int i = 0; i < m; i++) matrix[i][0] = 0;
    }
}