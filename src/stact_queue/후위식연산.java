package stact_queue;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {
    private static char s;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        Stack<String> stack = new Stack<>();
        int answer = 0;
        for (char s : str.toCharArray()) {
            if (Character.isDigit(s)) stack.push(String.valueOf(s));
            else {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                if (s == '+') answer = a + b;
                if (s == '*') answer = a * b;
                if (s == '-') answer = b - a;
                if (s == '/') answer = b / a;
                stack.push(String.valueOf(answer));
            }
        }
        System.out.println(stack.get(0));
    }
}
