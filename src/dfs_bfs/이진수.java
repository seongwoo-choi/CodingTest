package dfs_bfs;

public class 이진수 {
    public void DFS(int n) {
        if(n == 0) return;
        else {
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }

    public static void main(String[] args) {
        이진수 T = new 이진수();
        T.DFS(11);
    }
}
