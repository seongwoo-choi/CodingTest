package programmers;

import java.util.*;

public class LottoLowHigh {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        ArrayList<Integer> tmpArr = new ArrayList<>();

        int cnt = 0;
        int tmp = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    cnt++;
                    tmp++;
                }
            }
            if (lottos[i] == 0) {
                cnt++;
            }
            if (lottos[0] == 0 && lottos[1] == 0 && lottos[2] == 0 && lottos[3] == 0 && lottos[4] == 0 && lottos[5] == 0) {
                tmp = 1;
            }
        }


        tmpArr.add(cnt);
        tmpArr.add(tmp);

        for (int i = 0; i < 2; i++) {
            if (tmpArr.get(i) == 1) {
                answer[i] = 6;
            }
            if (tmpArr.get(i) == 2) {
                answer[i] = 5;
            }
            if (tmpArr.get(i) == 3) {
                answer[i] = 4;
            }
            if (tmpArr.get(i) == 4) {
                answer[i] = 3;
            }
            if (tmpArr.get(i) == 5) {
                answer[i] = 2;
            }
            if (tmpArr.get(i) == 6) {
                answer[i] = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        LottoLowHigh T = new LottoLowHigh();
        Scanner kb = new Scanner(System.in);
        int[] lottos = new int[6];
        for (int i = 0; i < 6; i++) {
            lottos[i] = kb.nextInt();
        }
        int[] win_nums = new int[6];
        for (int i = 0; i < 6; i++) {
            win_nums[i] = kb.nextInt();
        }
        System.out.println(Arrays.toString(T.solution(lottos, win_nums)));
    }
}