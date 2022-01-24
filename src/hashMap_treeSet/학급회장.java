package hashMap_treeSet;

import java.util.*;

public class 학급회장 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char answer = ' ';
        int max = Integer.MIN_VALUE;
        int n = kb.nextInt();
        String s = kb.next();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()) {
            // map.get(key) => key 의 밸류값을 가져온다.
            // map.getOrDefault(key)
            // => key 의 밸류값을 가져오는데 값이 존재하지 않으면 디폴트값을 가져온다.
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // map.keySey() => 해쉬맵의 키를 배열 형태로 만들어준다.
        // key 값으로 탐색
        for (char key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                answer=key;
            }
        }

        // HashMap 에 해당 key 가 존재하는지 확인
        // System.out.println(map.containsKey('A'));

        // HashMap 에 해당 value 가 존재하는지 확인
        // System.out.println(map.containsValue(3));

        // HashMap 의 키 갯수를 알려준다.
        // System.out.println(map.size());

        // HashMap 의 특정키를 삭제한다.
        // System.out.println(map.remove('A'));

        System.out.println(answer);
    }

}
