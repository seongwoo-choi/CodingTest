package str;

import java.util.Scanner;

public class ExtractionNum {
    public int solution(String str) {
        String a = "";
        int answer = 0;
        str = str.toLowerCase().replaceAll("[a-z]", "");
//        for(char x: str.toCharArray()) {
//            if(Character.isDigit(x)) a += x;
//        }
        answer = Integer.parseInt(str);
        return answer;
    }

    public static void main(String[] args) {
        ExtractionNum T = new ExtractionNum();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
