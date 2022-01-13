package array;

import java.util.Scanner;

public class TemporaryLeader {

    public int solution(int n, int[][] arr) {
        int answer = 0;


        return answer;
    }

    public static void main(String[] args) {
        TemporaryLeader T = new TemporaryLeader();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
