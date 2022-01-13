package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ranking {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int cnt = 1;
            for(int j=0;j<n;j++) {
                if(arr[j] > arr[i]) cnt++;
            }
            answer.add(cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        Ranking T = new Ranking();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int m : T.solution(n, arr)) {
            System.out.print(m + " ");
        }
    }
}
