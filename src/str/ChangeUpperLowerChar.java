package str;

import java.util.Scanner;

public class ChangeUpperLowerChar {
    public String solution(String str) {
//        StringBuilder answer = new StringBuilder();
        String answer = "";

//        for (char x : str.toCharArray()) {
//            if (Character.isLowerCase(x)) answer.append(Character.toUpperCase(x));
//            else answer.append(Character.toLowerCase(x));
//        }

        for (char x : str.toCharArray()) {
            // 대문자
            if (x >= 65 && x <= 90) answer += (char) (x + 32);
            else if (x >= 97 && x <= 122) answer += (char) (x - 32);
        }

        return answer;
    }

    public static void main(String[] args) {
        ChangeUpperLowerChar T = new ChangeUpperLowerChar();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}