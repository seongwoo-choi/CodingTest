package dfs_bfs;

import java.util.*;

public class 섬나라_아일랜드 {

    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] board;
    static int m, answer = 0;

    public void DFS(int x, int y) {
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < m && ny >= 0 && ny < m && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                DFS(nx, ny);
            }
        }
    }

    public void solution() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    DFS(i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        섬나라_아일랜드 T = new 섬나라_아일랜드();
        Scanner kb = new Scanner(System.in);
        m = kb.nextInt();
        board = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) board[i][j] = kb.nextInt();
        }
        T.solution();
        System.out.println(answer);
    }
}

