package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10872 {
    public static void main(String[] args) throws IOException {
        boj_10872 T = new boj_10872();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int s = Integer.parseInt(st.nextToken());
        System.out.println(T.sol(s));
    }

    public int sol(int n) {
        if (n < 2) {
            return 1;
        }

        return n * sol(n - 1);
    }
}
