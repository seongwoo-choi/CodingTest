package dfs_bfs;

import java.util.*;

public class 조합_구하기 {

    static int n, m;
    static int[] ch, arr;
    static int[][] ch2;
    static ArrayList<Integer> b = new ArrayList<>();

    public int DFS(int L, int[] arr) {
        if(ch2[arr[0]][arr[1]] > 0) return ch2[arr[0]][arr[1]];
        if(L == m) {
            ch2[arr[0]][arr[1]] = 1;
            ch2[arr[1]][arr[0]] = 1;
            b.add(arr[0]);
            b.add(arr[1]);
        }
        else {
            for (int i=1; i<=n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    arr[L] = i;
                    DFS(L+1, arr);
                    arr[L] = 0;
                    ch[i] = 0;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        조합_구하기 T = new 조합_구하기();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        ch = new int[n + 1];
        arr = new int[m];
        ch2 = new int[35][35];
        T.DFS(0, arr);
        for (int i=0; i<b.size(); i+=2) {
            System.out.println(b.get(i) + " " + b.get(i+1));
        }
    }
}
