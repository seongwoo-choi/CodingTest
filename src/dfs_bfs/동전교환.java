package dfs_bfs;

import java.util.*;

public class 동전교환 {

    static int n, m, answer = Integer.MAX_VALUE;

    public void DFS(int v, int sum, Integer[] arr) {

        if (v >= answer) return;
        if (sum > m) return;
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
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt();
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
