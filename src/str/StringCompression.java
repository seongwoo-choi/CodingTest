package str;

import java.util.Scanner;

public class StringCompression {

    public String solution(String str) {
        String answer = "";
        // 문자열을 index 로 순회하면서 비교
        // cnt = 1, i, i+1 이 같으면 cnt++
        // i, i+1 이 같지 않으면 answer += string
        // 만약 i+1 이 str.length() 와 같으면 멈춘다.
        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 == str.length()) {
                answer += str.charAt(i);
                if (cnt != 1) answer += cnt;
                break;
            } else if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
                if (i + 1 == str.length()) answer += cnt;
            } else if (str.charAt(i) != str.charAt(i + 1)) {
                answer += str.charAt(i);
                if (cnt == 1) continue;
                answer += cnt;
                cnt = 1;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        StringCompression T = new StringCompression();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
