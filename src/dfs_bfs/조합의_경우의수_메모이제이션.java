package dfs_bfs;

import java.util.Scanner;

public class 조합의_경우의수_메모이제이션 {

    int[][] ch = new int[35][35];

    public int DFS(int n, int r) {
        if (ch[n][r] != 0) return ch[n][r];
        if (r == 0 || n == r) return 1;
        else return ch[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
    }

    public static void main(String[] args) {
        조합의_경우의수_메모이제이션 T = new 조합의_경우의수_메모이제이션();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        System.out.println(T.DFS(n, r));
    }
}
