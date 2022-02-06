package dfs_bfs;

import java.util.*;

public class 경로탐색_인접행렬 {
    static int n, m, answer = 0;
    static int[] ch;
    static int[][] graph;

    public void DFS(int V) {
        if (V == m) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[V][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    // 백트랙킹 하는 부분
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        경로탐색_인접행렬 T = new 경로탐색_인접행렬();
        Scanner sc = new Scanner(System.in);
        // 노드의 갯수
        int n = sc.nextInt();
        // 간선의 갯수
        int m = sc.nextInt();
        // 행과 열은 정점번호를 의미한다
        graph = new int[n + 1][n + 1];
        // 해당 노드를 방문했는지 체크하는 배열
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // 방향 그래프
            graph[a][b] = 1;
        }
        // 출발점 노드 체크
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
