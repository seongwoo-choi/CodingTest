package stact_queue;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') stack.push('(');
            else {
                // 레이저
                stack.pop();
                if (str.charAt(i-1) == '(') answer += stack.size();
                // 쇠막대기
                else answer++;
            }
        }
        System.out.println(answer);
    }
}
