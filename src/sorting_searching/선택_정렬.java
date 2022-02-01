package sorting_searching;

import java.util.Arrays;
import java.util.Scanner;

public class 선택_정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            int idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[idx]) idx=j;
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        for (int x:arr) {
            System.out.print(x + " ");
        }
    }
}
