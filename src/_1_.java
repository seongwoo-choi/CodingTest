import java.util.*;

public class _1_ {
    public static void main(String[] args) {
        Long n = 1234L;
        int answer = 0;
        List<Long> list = new ArrayList<>();
        long nn = n;
        while(n>0) {
            long temp = n%10;
            if(!list.contains(temp)&&temp!=0) {
                list.add(temp);
                if(nn%temp==0) {
                    answer++;
                }
            }
            n/=10;
        }
        System.out.println(answer);
    }
}