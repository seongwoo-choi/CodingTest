package so;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RegularPolyhedron {

    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int n = arr[0];
        int m = arr[1];
        int[] cntArr = new int[n + m + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                cntArr[i + j] += 1;
            }
        }

        int max = Arrays.stream(cntArr).max().getAsInt();
        for (int i = 0; i < cntArr.length; i++) {
            if (max == cntArr[i]) {
                answer.add(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        RegularPolyhedron T = new RegularPolyhedron();
        Scanner kb = new Scanner(System.in);
        int[] arr = new int[2];
        for (int i = 0; i < 2; i++) {
            arr[i] = kb.nextInt();
        }
        for (int n : T.solution(arr)) {
            System.out.print(n + " ");
        }
    }
}
