package twoPointers_slidingWindow;

import java.util.*;

public class 최대매출 {
    public int solution(int n, int k, int[] arr) {
        int answer;

        // 이중for문
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            for (int j = 0; j < k; j++) {
//                if (i + j < n) {
//                    sum += arr[i + j];
//                    if (answer < sum) {
//                        answer = sum;
//                    }
//                } else break;
//            }
//        }


        // 슬라이딩 윈도우
        int sum = 0, j = k;
        for (int i = 0; i < k; i++) sum += arr[i];
        answer = sum;

        while (j < n) {
            answer = Math.max(answer, sum);
            sum += arr[j] - arr[j - k];
            j++;
        }

        return answer;
    }

    public static void main(String[] args) {
        최대매출 T = new 최대매출();
        Scanner kb = new Scanner(System.in);
        int n, k;
        int[] a = new int[2];
        for (int i = 0; i < 2; i++) {
            a[i] = kb.nextInt();
        }
        n = a[0];
        k = a[1];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}
