package array;

import java.util.*;

public class TemporaryClassPresident {

    public static void main(String[] args) {
        TemporaryClassPresident T = new TemporaryClassPresident();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        // i 번 학생
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            // j 번 학생
            for (int j = 0; j < n; j++) {
                // 학년
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max) {
                max = cnt;
                answer = i;
            }
        }
        return answer+1;
    }

}
