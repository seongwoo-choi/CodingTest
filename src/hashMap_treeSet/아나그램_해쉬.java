package hashMap_treeSet;

import java.util.Arrays;
import java.util.Scanner;

public class 아나그램_해쉬 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String a = kb.nextLine();
        String b = kb.nextLine();
        char[] aa = new char[a.toCharArray().length];
        char[] bb = new char[b.toCharArray().length];
        boolean check = false;

        for (int i=0; i<a.toCharArray().length; i++) {
            aa[i] = a.toCharArray()[i];
        }

        for (int i=0; i<b.toCharArray().length; i++) {
            bb[i] = b.toCharArray()[i];
        }

        Arrays.sort(aa);
        Arrays.sort(bb);

        for (int i=0; i<aa.length; i++) {
            if(aa[i] != bb[i]) {
                check = false;
                break;
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
