package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintBigInt {

    public List<Integer> solution(int n, int[] m) {

        List<Integer> answer = new ArrayList<>();

        for (int i : m) {
            if (i >= n) {
                answer.add(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        PrintBigInt T = new PrintBigInt();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
