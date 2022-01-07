package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }

        // 방법 2
//        int a=1, b=1, c;
//        System.out.print(a+" "+b+" ");
//        for(int i=2;i<n;i++) {
//            c=a+b;
//            System.out.print(c+" ");
//            a=b;
//            b=c;
//        }

        return answer;
    }

    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for(int x: T.solution(n)) System.out.print(x+" ");
    }
}
