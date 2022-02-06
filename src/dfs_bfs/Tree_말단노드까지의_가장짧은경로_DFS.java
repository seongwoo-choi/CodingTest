package dfs_bfs;

import java.util.*;

public class Tree_말단노드까지의_가장짧은경로_DFS {

    static String answer = "NO";
    static int n, total = 0;

    public void DFS(int L, int sum, int[] arr) {
        if(L == n) {
            // 백트랙킹 멈춰야 한다.
            if((total - sum) == sum) {
                answer = "YES";
                return;
            }
        } else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }


    public static void main(String[] args) {
        Tree_말단노드까지의_가장짧은경로_DFS T = new Tree_말단노드까지의_가장짧은경로_DFS();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
