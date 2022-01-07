package str;

import java.util.*;

public class FlipTheWord {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            int lt = 0;
            int rt = x.length() - 1;
            // 문자 배열
            char[] s = x.toCharArray();
            while (lt < rt) {
                char tmp = s[rt];
                s[rt] = s[lt];
                s[lt] = tmp;
                lt++;
                rt--;
            }
            // valueOf => s 를 String 화 시켜준다.
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        FlipTheWord T = new FlipTheWord();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }

        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }
}
