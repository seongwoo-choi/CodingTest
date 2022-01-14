package so;

import java.util.*;

/*
N명의 학생들의 평균(소수 첫째자리 반올림)을 구하고
N명의 학생 중 평균에 가장 가까운 학생은 몇 번째 학생인지

평균과 가장 가까운 점수가 여러개일 경우
먼저 점수가 높은 학생의 번호를 답으로 하고

높은 점수를 가진 학생이 여러 명일 경우 학생번호가
빠른 학생의 번호를 답으로 한다.

입력
첫줄에 자연수 N(5<=N<=100)이 주어지고,
두 번째 줄에는 각 학생의 수학점수인 N개의 자연 수가 주어집니다.
학생의 번호는 앞에서부터 1로 시작해서 N까지이다.
10
45 73 66 87 92 67 75 79 75 80

출력
첫줄에 평균과 평균에 가장 가까운 학생의 번호를 출력한다.
평균은 소수 첫째 자리에서 반올림합니다.
74 7
*/

public class TempRes {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[2];
        int sum = 0, tmp, min = 99999999, score = 0, res = 0;
        double avg;
        for (int i : arr) {
            sum += i;
        }
        avg = Math.round((double) sum / n);

        for (int i = 0; i < arr.length; i++) {
            tmp = (int) Math.abs(arr[i] - avg);
            if (min > tmp) {
                min = tmp;
                score = arr[i];
                res = i + 1;
            } else if (min == tmp) {
                if (arr[i] > score) {
                    score = arr[i];
                    res = i + 1;
                }
            }
        }

        answer[0] = (int) avg;
        answer[1] = res;

        return answer;
    }

    public static void main(String[] args) {
        TempRes T = new TempRes();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int i: T.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }
}
