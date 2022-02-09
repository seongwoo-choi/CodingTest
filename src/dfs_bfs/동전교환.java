package dfs_bfs;

import java.util.Scanner;

public class 동전교환 {

    static int n, m, answer = Integer.MAX_VALUE;

    public void DFS(int v, int sum, int[] arr) {

        if(sum>m) return;
        if (sum == m) {
            answer = Math.min(answer, v);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(v + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        동전교환 T = new 동전교환();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        m = sc.nextInt();
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
