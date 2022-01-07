package array;

import java.util.Scanner;

public class Peak {

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }

        // 방법 1
//        int[][] arr2 = new int[n + 2][n + 2];
//
//        for (int i = 1; i < arr2.length - 1; i++) {
//            for (int j = 1; j < arr2.length - 1; j++) {
//                arr2[i][j] = arr[i - 1][j - 1];
//            }
//        }
//
//        for (int i = 1; i < n + 1; i++) {
//            for (int j = 1; j < n + 1; j++) {
//                int a = arr2[i][j];
//                if(a>arr2[i-1][j] && a>arr2[i+1][j] && a>arr2[i][j-1] && a>arr2[i][j+1]) {
//                    answer++;
//                }
//            }
//        }

        return answer;
    }

    public static void main(String[] args) {
        Peak T = new Peak();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
