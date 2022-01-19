package twoPointers_slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class 두배열합치기 {
    public static void main(String[] args) {
        두배열합치기 T = new 두배열합치기();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = kb.nextInt();

        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) b[i] = kb.nextInt();

        System.out.println(T.solution(n, m, a, b));
    }

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            // p1++ -> p1 이 answer 에 입력되고 p1 의 값이 증가한다.
            if (a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while (p1 < n) answer.add(a[p1++]);
        while (p2 < m) answer.add(b[p2++]);
        return answer;
    }
}
