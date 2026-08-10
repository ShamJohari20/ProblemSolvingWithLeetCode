class Solution {

    public int[] kWeakestRows(int[][] mat, int k) {

        int m = mat.length;

        int[][] rows = new int[m][2];

        // Count soldiers in every row
        for (int i = 0; i < m; i++) {

            int soldiers = 0;

            for (int j = 0; j < mat[i].length; j++) {

                if (mat[i][j] == 1) {
                    soldiers++;
                }
            }

            rows[i][0] = soldiers;
            rows[i][1] = i;
        }

        // Sort by soldiers first, then row index
        Arrays.sort(rows, (a, b) -> {

            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }

            return Integer.compare(a[1], b[1]);
        });

        int[] answer = new int[k];

        for (int i = 0; i < k; i++) {
            answer[i] = rows[i][1];
        }

        return answer;
    }
}