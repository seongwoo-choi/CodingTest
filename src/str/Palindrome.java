package str;

import java.util.*;

public class Palindrome {

    public String solution(String str) {
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) return "YES";
//        int n = str.length();

//        str = str.toUpperCase();

        // 방법 1
//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) == str.charAt(n - 1)) {
//                n--;
//            } else {
//                answer = "No";
//                break;
//            }
//        }

        // 방법 2
//        for (int i = 0; i < n / 2; i++) {
//            if (str.charAt(i) != str.charAt(n - i - 1)) return "NO";
//        }

        return answer;
    }

    public static void main(String[] args) {
        Palindrome T = new Palindrome();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
