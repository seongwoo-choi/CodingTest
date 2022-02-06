package dfs_bfs;

import java.util.ArrayList;
import java.util.Scanner;

public class 경로탐색_인접리스트 {

    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    static int n, m, answer = 0;

    public void DFS(int V) {
        if (V == n) answer++;
        else {
            // ArrayList 탐색할 떈 forEach 가 제일 빠르다.
            for (int nv : graph.get(V)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public void main(String[] args) {
        경로탐색_인접리스트 T = new 경로탐색_인접리스트();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // ArrayList 객체를 저장하는 ArrayList 객체를 생성
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            // n 개의 사이즈를 갖는 ArrayList 가 생성
            // i 는 정점을 저장하는 곳을 만든다.
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // get(a) 0~n 까지의 ArrayList
            // a 는 정점 번호
            // graph.get(3).add(5) => 3번 노드에 연결된 5번 노드를 추가해준다.
            graph.get(a).add(b);
        }
        T.DFS(1);
        System.out.println(answer);
    }
}
