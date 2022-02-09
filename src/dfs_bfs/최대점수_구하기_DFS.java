package dfs_bfs;

import java.util.*;

public class 최대점수_구하기_DFS {

    static int n, m, answer = Integer.MIN_VALUE;

    public void DFS(int l, int sum, int time, int[] ps, int[] pt) {
        if (time > m) return;
        if (l == n) {
            answer = Math.max(answer, sum);
        } else {
            // sum -> 시간, score -> 점수
            DFS(l + 1, sum + ps[l], time + pt[l], ps, pt);
            DFS(l + 1, sum, time, ps, pt);
        }
    }


    public static void main(String[] args) {
        ArrayList<Long> ch = new ArrayList<>();
        최대점수_구하기_DFS T = new 최대점수_구하기_DFS();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        T.DFS(0, 0, 0, a, b);
        System.out.println(answer);
    }
}
