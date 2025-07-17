import java.util.Random;

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        char[][] grid = new char[m][n];

        Random random = new Random();
        int minesPlaced = 0;

        while (minesPlaced < k) {
            int row = random.nextInt(m);
            int col = random.nextInt(n);

            if (grid[row][col] != '*') {
                grid[row][col] = '*';
                minesPlaced++;
            }
        }

        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != '*') {
                    int count = 0;
                    for (int d = 0; d < 8; d++) {
                        int newRow = i + dr[d];
                        int newCol = j + dc[d];
                        if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && grid[newRow][newCol] == '*') {
                            count++;
                        }
                    }
                    if (count > 0) {
                        grid[i][j] = (char) ('0' + count);
                    } else {
                        grid[i][j] = '0';
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
