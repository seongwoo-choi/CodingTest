package str;

import java.util.*;

public class FlipSpecificText {
    public String solution(String str) {
        String answer = "";
        int lt = 0;
        int rt = str.length() - 1;
        char[] s = str.toCharArray();

//        while (lt < rt) {
//            boolean can = true;
//            if (!((s[lt] >= 65 && s[lt] <= 90) || (s[lt] >= 97 && s[lt] <= 122))) {
//                lt++;
//                can = false;
//            }
//            if (!((s[rt] >= 65 && s[rt] <= 90) || (s[rt] >= 97 && s[rt] <= 122))) {
//                rt--;
//                can = false;
//            }
//            if (!can) {
//                continue;
//            }
//            char tmp = s[lt];
//            s[lt] = s[rt];
//            s[rt] = tmp;
//            lt++;
//            rt--;
//            answer = String.valueOf(s);
//        }

        while (lt < rt) {
            boolean can = true;
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            }
            else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            }
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args) {
        FlipSpecificText T = new FlipSpecificText();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
