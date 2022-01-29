package hashMap_treeSet;

import java.util.*;

public class K번째_큰_수 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        int answer = -1;
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                for (int m=j+1; m<n; m++) {
                    set.add(arr[i]+arr[j]+arr[m]);
                }
            }
        }
        int cnt = 0;
        for (int x: set) {
            cnt++;
            if(cnt == k) {
                answer = x;
                break;
            }
        }

        System.out.println(answer);
    }

}
