package dfs_bfs;

import java.util.Scanner;

public class 섬나라_아일랜드 {

    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] board, ch;
    static int m, answer = 0;

    public void solution(int[][] board) {
        for (int i = 0; i < m; i++) {
            for (int j=0; j<m; j++) {
                if(board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    DFS(i, j, board);
                }
            }
        }
    }

    public void DFS(int x, int y, int[][] board) {
            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < m && ny >= 0 && ny < m && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    DFS(nx, ny, board);
                }
        }
    }

    public static void main(String[] args) {
        섬나라_아일랜드 T = new 섬나라_아일랜드();
        Scanner kb = new Scanner(System.in);
        m = kb.nextInt();
        board = new int[m][m];
        ch = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) board[i][j] = kb.nextInt();
        }
        T.solution(board);
        T.DFS(0, 0, board);
        System.out.println(answer);
    }
}

