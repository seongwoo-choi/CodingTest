package str;

import java.util.*;

public class FindStr {
    // Programmers 방식
    public int solution(String str, char t) {
        int answer = 0;
        // 대소문자 구분하지 않음
        str = str.toUpperCase();

        // 문자 -> Character 를 사용한다.
        t = Character.toUpperCase(t);

        // forEach 에서 두번째 자리에 올 것은
        // 배열이나 이터레이터(ArrayList, List)가 와야한다.
        // toCharArray() => 문자배열 생성
        for (char x : str.toCharArray()) {
            if (x == t) answer++;
        }

        return answer;
    }

    // 백준 방식
    public static void main(String[] args) {
        FindStr T = new FindStr();
        Scanner kb = new Scanner(System.in);

        // next() 문자열을 읽어들임
        String str = kb.next();

        // 문자열 읽고 해당 문자열의 0번째 자리 문자를 읽음
        char c = kb.next().charAt(0);

        System.out.println(T.solution(str, c));
    }
}
