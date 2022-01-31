package stact_queue;

import java.util.*;

public class 공주구하기 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        int answer = 0;
        for (int i = 1; i <= n; i++) queue.offer(i);
        while (!queue.isEmpty()) {
            for (int i = 1; i < k; i++) queue.offer(queue.poll());
            queue.poll();
            if (queue.size() == 1) answer = queue.poll();
        }
        System.out.println(answer);
    }
}
