package sort;

import java.util.Scanner;

/**
 * zhuda
 * 2018/12/2
 * @author zhuda
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] a = s.toCharArray();
        char temp;

        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j] > a[j+1]) {
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a);
    }
}
