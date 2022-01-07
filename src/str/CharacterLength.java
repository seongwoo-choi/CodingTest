package str;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterLength {
    public void solution(String str, char s) {
        int[] answer = new int[str.length()];
        int p = 1000;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == s) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == s) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
//        for (int i = 0; i < answer.length; i++) {
//            System.out.print(answer[i] + " ");
//        }

        System.out.println(Arrays.toString(answer));
    }

    public static void main(String[] args) {
        CharacterLength T = new CharacterLength();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char s = kb.next().charAt(0);
        T.solution(str, s);
    }
}
