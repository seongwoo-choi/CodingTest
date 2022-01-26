package hashMap_treeSet;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램_해쉬 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s1 = kb.nextLine();
        String s2 = kb.nextLine();

        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x : s2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                answer = "NO";
                break;
            }
            map.put(x, map.get(x) - 1);
        }

        System.out.println(answer);
    }
}
