package str;

import java.util.*;

public class Crypt {
    public String solution(String str, int num) {
//        String answer = "";
//        int n = str.length() / num;
//        int[] an = new int[num];
//        str = str.replace("#", "1").replace("*", "0");
//        for (int i = 0; i < num; i++) {
//            an[i] = Integer.parseInt(str.substring(i * n, (i + 1) * n), 2);
//            answer += Character.toString(an[i]);
//        }
//
//        return answer;

        String answer = "";
        int n = str.length() / num;
        for (int i = 0; i < num; i++) {
            String tmp = str.substring(i * n, (i + 1) * n).replace("#", "1").replace("*", "0");
            int m = Integer.parseInt(tmp, 2);
            answer += (char) m;
        }

        return answer;
    }

    public static void main(String[] args) {
        Crypt T = new Crypt();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(str, num));
    }
}
