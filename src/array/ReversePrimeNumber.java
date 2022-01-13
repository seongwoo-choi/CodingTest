package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversePrimeNumber {
    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(String[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> ch = new ArrayList<>();

        for (String x : arr) {
            String s = new StringBuilder(x).reverse().toString();
            ch.add(Integer.parseInt(s));
        }
        for (int num : ch) {
            if (isPrime(num)) answer.add(num);
        }

        return answer;
    }

    public static void main(String[] args) {
        ReversePrimeNumber T = new ReversePrimeNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.next();
        }
        for(int x : T.solution(arr)){
            System.out.print(x+" ");
        }
    }
}
