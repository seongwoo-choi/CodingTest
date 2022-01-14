package so;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SumOfDigits {

    public int solution(int n, int[] arr) {
        int answer, sum = 0, max;
        ArrayList<Integer> res = new ArrayList<>();
        String newStr = Arrays.toString(arr);
        for (char s : newStr.toCharArray()) {
            if (Character.isDigit(s)) {
                sum += Integer.parseInt(String.valueOf(s));
            } else {
                if (sum == 0) {
                    continue;
                }
                res.add(sum);
                sum = 0;
            }
        }
        max = Collections.max(res);
        answer = arr[res.indexOf(max)];

        return answer;
    }

    public static void main(String[] args) {
        SumOfDigits T = new SumOfDigits();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
