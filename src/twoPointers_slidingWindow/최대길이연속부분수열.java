package twoPointers_slidingWindow;

import java.util.Scanner;

public class 최대길이연속부분수열 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] a = new int[2];
        for (int i = 0; i < 2; i++) {
            a[i] = kb.nextInt();
        }
        int n = a[0], k = a[1];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        int answer = 0, max = Integer.MIN_VALUE, rt = 0, lt = 0, cnt = 0;
        while (true) {
            if (cnt == k) {
                if (arr[rt] == 1) {
                    answer++;
                    rt++;
                    max = Math.max(max, answer);
                    continue;
                }
                if (arr[rt] == 0) {
                    answer = 0;
                    cnt = 0;
                    rt = lt++;
                    continue;
                }
            }
            if (cnt < k + 1) {
                if (arr[rt] == 1) {
                    answer++;
                    rt++;
                    max = Math.max(max, answer);
                }
                if (arr[rt] == 0) {
                    answer++;
                    cnt++;
                    rt++;
                    max = Math.max(max, answer);
                }
            }
            if (rt == n-1) break;
        }

        System.out.println(max);

    }
}
