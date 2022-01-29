package stact_queue;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        Stack<Character> stack = new Stack<>();
        StringBuilder answer = new StringBuilder();
//        for (char x : s.toCharArray()) {
//            if (x == '(') stack.push(x);
//            if (x == ')') {
//                stack.pop();
//            }
//            if (stack.isEmpty() && !(x == ')')) answer.append(x);
//        }

        for (char x : s.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(') {
                }
            } else stack.push(x);
        }
        for (char x : stack) answer.append(x);
        System.out.println(answer);
    }
}
