package array;

import java.util.*;

public class VisibleStudent {

    public int solution(int n, int[] arr) {
        int answer = 1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                answer += 1;
                max = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        VisibleStudent T = new VisibleStudent();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
