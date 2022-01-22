package twoPointers_slidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class 연속된자연수의합 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int answer = 0, sum = 0, lt = 0;
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == n) answer++;

            while (sum >= n) {
                if (rt == n - 1) break;
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }

        System.out.println(answer);
    }
}
