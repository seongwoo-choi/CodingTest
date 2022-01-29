package stact_queue;

import java.util.Scanner;
import java.util.Stack;

public class 올바른_괄호 {
    public String solution(String str){
        String answer="YES";
        Stack<Character> stack=new Stack<>();
        for(char x : str.toCharArray()){
            // 여는 괄호가 오면 stack 에 값을 입력
            if(x=='(') stack.push(x);
            else{
                // 닫는 괄호가 올 때 스택이 비었으면 올바른 괄호가 아님
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        // 스택이 비어있지 않으면(여는 괄호가 남아있음) 올바른 괄호가 아님
        if(!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args){
        올바른_괄호 T = new 올바른_괄호();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}
