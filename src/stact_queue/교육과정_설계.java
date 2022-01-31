package stact_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정_설계 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String a = kb.nextLine();
        String b = kb.nextLine();
        String answer = "YES";
        String rs = "";
        Queue<Character> queue = new LinkedList<>();
        for (char x : a.toCharArray()) queue.offer(x);
//     방법 1
//        for (char x : b.toCharArray()) {
//            if (queue.contains(x)) {
//                rs += String.valueOf(x);
//            }
//        }
//        if (a.equals(rs)) answer = "YES";
//        else answer = "NO";

//        방법 2
        for (char x : b.toCharArray()) {
            if (queue.contains(x)) {
                if (x != queue.poll()) answer = "NO";
            }
        }
        if (!queue.isEmpty()) answer = "NO";

        System.out.println(answer);
    }
}
