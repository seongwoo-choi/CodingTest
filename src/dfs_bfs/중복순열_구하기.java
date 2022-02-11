package dfs_bfs;

import java.util.Scanner;

public class 중복순열_구하기 {

    static int n, m;
    static int[] pm;

    public void DFS(int L) {
        if (L == m) {
            for(int x:pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for(int i=1; i<=n; i++) {
                pm[L] = i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        중복순열_구하기 T = new 중복순열_구하기();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];
        T.DFS(0);
    }
}
