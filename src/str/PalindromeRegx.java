package str;

import java.util.Scanner;

public class PalindromeRegx {

    public String solution(String str) {
        String answer ="NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) return "YES";

        return answer;
    }

    public static void main(String[] args) {
        PalindromeRegx T = new PalindromeRegx();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
