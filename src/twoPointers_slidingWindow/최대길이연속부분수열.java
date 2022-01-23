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

        int answer = 0, lt = 0, cnt = 0;
//        int rt = 0

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > k) {
                System.out.println("before " + lt + " " + rt);
                if (arr[lt++] == 0) cnt--;
            }
            System.out.println(rt - lt + 1);
            answer = Math.max(answer, rt - lt + 1);
        }

        System.out.println(answer);
    }
}
