package twoPointers_slidingWindow;

import java.util.*;

public class 연속부분수열 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] a = new int[2];
        for (int i = 0; i < 2; i++) {
            a[i] = kb.nextInt();
        }
        int n = a[0], m = a[1];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

//        int p = 0, i = p + 1, sum = arr[p], cnt = 0;
//        while (true) {
//            if (sum < m) {
//                sum += arr[i];
//                if (sum == m) {
//                    cnt++;
//                }
//                if (i == n - 1) {
//                    break;
//                }
//                i++;
//            } else {
//                p++;
//                i = p + 1;
//                sum = arr[p];
//            }
//        }
//        System.out.println(cnt);

        // lt, rt 로 풀기
        int answer = 0, sum = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) answer++;
            while (sum >= m) {
                sum -= arr[lt++];
                if(sum == m) answer++;
            }
        }
        System.out.println(answer);
    }
}
