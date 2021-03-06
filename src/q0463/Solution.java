package q0463;

class Solution {
    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }

                if (i == 0) {
                    sum++;
                } else {
                    if (grid[i - 1][j] == 0) {
                        sum++;
                    }
                }
                if (j == 0) {
                    sum++;
                } else {
                    if (grid[i][j - 1] == 0) {
                        sum++;
                    }
                }
                if (i == grid.length - 1) {
                    sum++;
                } else {
                    if (grid[i + 1][j] == 0) {
                        sum++;
                    }
                }
                if (j == grid[i].length - 1) {
                    sum++;
                } else {
                    if (grid[i][j + 1] == 0) {
                        sum++;
                    }
                }
            }
        }

        return sum;
    }
}
