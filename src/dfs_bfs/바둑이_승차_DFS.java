package dfs_bfs;

import java.util.Scanner;

public class 바둑이_승차_DFS {
    static int answer = Integer.MIN_VALUE;
    static int c, n;
    static int[] arr;

    public void DFS(int l, int sum, int[] arr) {
        if (sum > c) return;
        if (l == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(l + 1, sum + arr[l], arr);
            DFS(l + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        바둑이_승차_DFS T = new 바둑이_승차_DFS();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
