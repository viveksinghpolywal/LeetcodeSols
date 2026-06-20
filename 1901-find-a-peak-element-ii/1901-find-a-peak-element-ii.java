class Solution {

    public int[] findPeakGrid(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int low = 0;
        int high = m - 1;

        while (low <= high) {

            int mid =
                    low + (high - low) / 2;

            int maxRow =
                    getMaxRow(mat, mid);

            int left =
                    (mid - 1 >= 0)
                    ? mat[maxRow][mid - 1]
                    : -1;

            int right =
                    (mid + 1 < m)
                    ? mat[maxRow][mid + 1]
                    : -1;

            int current =
                    mat[maxRow][mid];

            if (current > left &&
                current > right) {

                return new int[]{
                        maxRow,
                        mid
                };
            }

            else if (left > current) {

                high = mid - 1;
            }

            else {

                low = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }

    private int getMaxRow(
            int[][] mat,
            int col) {

        int row = 0;

        for (int i = 1;
             i < mat.length;
             i++) {

            if (mat[i][col] >
                mat[row][col]) {

                row = i;
            }
        }

        return row;
    }
}