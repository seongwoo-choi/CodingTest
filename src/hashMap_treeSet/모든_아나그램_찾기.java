package hashMap_treeSet;

import java.util.*;

public class 모든_아나그램_찾기 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String t = kb.nextLine();
        String s = kb.nextLine();
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> ch = new HashMap<>();
        char[] arr = t.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Character x : s.toCharArray()) {
            ch.put(x, ch.getOrDefault(x, 0)+1);
        }

        int lt = 0;

        for (int rt = s.length() - 1; rt < arr.length; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            if (ch.equals(map)) answer++;
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;
        }

        System.out.println(answer);
    }
}
