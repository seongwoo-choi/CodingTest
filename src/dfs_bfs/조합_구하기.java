package dfs_bfs;

import java.util.*;

public class 조합_구하기 {

    static int n, m;
    static int[] combi;

    public void DFS(int L, int s) {
        if (L == m) {
            for (int x:combi) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }


    public static void main(String[] args) {
        조합_구하기 T = new 조합_구하기();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];
        T.DFS(0, 1);
    }
}
