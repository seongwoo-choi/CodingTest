package array;

import java.util.*;
/*
현수네 반 선생님은 반 학생들의 수학점수를 향상시키기 위해 멘토링 시스템을 만들려고 합니다.

멘토링은 멘토(도와주는 학생)와 멘티(도움을 받는 학생)가 한 짝이 되어 멘토가 멘티의 수학공부를 도와주는 것입니다.

선생님은 M번의 수학테스트 등수를 가지고 멘토와 멘티를 정합니다.

만약 A학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면, A학생은 M번의 수학테스트에서 모두 B학생보다 등수가 앞서야 합니다.

M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇 가지 인지 출력하는 프로그램을 작성하세요.

첫 번째 줄에 반 학생 수 N(1<=N<=20)과 M(1<=M<=10)이 주어진다.

두 번째 줄부터 M개의 줄에 걸쳐 수학테스트 결과가 학생번호로 주어진다. 학생번호가 제일 앞에서부터 1등, 2등, ...N등 순으로 표현된다.

만약 한 줄에 N=4이고, 테스트 결과가 3 4 1 2로 입력되었다면 3번 학생이 1등, 4번 학생이 2등, 1번 학생이 3등, 2번 학생이 4등을 의미합니다.

입출력 결과

4 3
3 4 1 2
4 3 2 1     ->       3
3 1 4 2
*/

public class 멘토링 {

    public int solution(int n, int m, int[][] arr) {
        // (멘토, 멘티) 로 묶일 수 있는 확률(자기자신 포함) => 입력받은 학생 수 * 학생 수
        // n * n 번 돌기 위해 이중포문을 사용
        // (멘토:3, 멘티:1) 일 경우 멘토가 멘티보다 모든 케이스에서 등수가 높아야 한다.
        // 이중포문 안에 이중포문을 사용
        // (멘토:i, 멘티:j), if(arr[테스트케이스][등수] == i) pi=s, if(arr[테스트케이스][등수] == j) pj=s
        // pi<pj 일 때 cnt++ 모든 케이스에서 pi 가 pj 보다 작아야 하므로 cnt 의 갯수가 테스트 케이스의 갯수와 같아야 한다.
        // cnt 와 테스트 케이스의 숫자가 같으면 answer++
        // 총 answer 의 갯수를 리턴한다.

        int answer = 0;

        // i -> 멘토 학생 번호
        for (int i = 1; i <= n; i++) {
            // j -> 멘티 학생 번호
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                // k -> 테스트 케이스 번호
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    // s -> 학생 등수
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt == m) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        멘토링 T = new 멘토링();
        Scanner kb = new Scanner(System.in);
        int[] nmArr = new int[2];
        for (int i = 0; i < 2; i++) {
            nmArr[i] = kb.nextInt();
        }
        int[][] arr = new int[nmArr[1]][nmArr[0]];
        for (int i = 0; i < nmArr[1]; i++) {
            for (int j = 0; j < nmArr[0]; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(nmArr[0], nmArr[1], arr));
    }
}

