package array;

import java.util.Scanner;

public class CalculateScore {

    public int solution(int n, int[] arr) {
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                if (i == 0) {
                    answer += cnt;
                    continue;
                }
                if (arr[i] == arr[i - 1]) {
                    answer += cnt;
                    continue;
                }
            } else {
                if (i == 0) {
                    answer += 0;
                    continue;
                }
                cnt = 0;
            }
            answer += cnt;
        }


//        for(int i=0; i<n; i++) {
//            if(arr[i] == 1) {
//                cnt++;
//                answer += cnt;
//            } else cnt = 0;
//        }

        return answer;
    }

    public static void main(String[] args) {
        CalculateScore T = new CalculateScore();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
