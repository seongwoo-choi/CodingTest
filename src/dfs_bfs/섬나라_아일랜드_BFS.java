package dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 섬나라_아일랜드_BFS {

    private class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int n, answer = 0;
    static int[][] board;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    Queue<Point> queue = new LinkedList<>();

    public void BFS(int x, int y) {
        queue.add(new Point(x, y));
        while (!queue.isEmpty()) {
            Point pos = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    queue.add(new Point(nx, ny));
                }
            }
        }
    }

    public void solution() {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if(board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    BFS(i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        섬나라_아일랜드_BFS T = new 섬나라_아일랜드_BFS();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        board = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        T.solution();
        System.out.println(answer);
    }
}
