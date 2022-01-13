package array;

import java.util.*;

public class RockPaperScissors {

    public String solution(int n, int[] a, int[] b) {
        String answer = "";


        // 방법 1

        String[][] arr = new String[4][n];

        for (int i = 0; i < n; i++) {
            arr[0][i] = String.valueOf(i + 1);
            arr[1][i] = String.valueOf(a[i]);
            arr[2][i] = String.valueOf(b[i]);
        }

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(arr[1][i]) - Integer.parseInt(arr[2][i]) == 1 || Integer.parseInt(arr[1][i]) - Integer.parseInt(arr[2][i]) == -2) {
                arr[3][i] = "A";
            } else if (Integer.parseInt(arr[1][i]) - Integer.parseInt(arr[2][i]) == -1 || Integer.parseInt(arr[1][i]) - Integer.parseInt(arr[2][i]) == 2) {
                arr[3][i] = "B";
            } else if (Integer.parseInt(arr[1][i]) - Integer.parseInt(arr[2][i]) == 0) {
                arr[3][i] = "D";
            }

            answer += arr[3][i];
        }

//        for (int i = 1; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }


        // 방법 2
//        for (int i = 0; i < n; i++) {
//            if (a[i] == b[i]) answer += "D";
//            else if (a[i] == 1 && b[i] == 3) answer += "A";
//            else if (a[i] == 2 && b[i] == 1) answer += "A";
//            else if (a[i] == 3 && b[i] == 2) answer += "A";
//            else answer += "B";
//        }

        return answer;
    }

    public static void main(String[] args) {
        RockPaperScissors T = new RockPaperScissors();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = kb.nextInt();
        }

        for (char x : T.solution(n, a, b).toCharArray()) {
            System.out.println(x + " ");
        }
    }
}
