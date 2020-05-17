package sort;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2018/12/3
 * @author zhuda
 */

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] a = s.toCharArray();
        char temp;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    temp = a[j];
                    for (int k = j; k > i; k--) {
                        a[k] = a[k - 1];
                    }
                    a[i] = temp;
                }
            }
        }
        System.out.println(a);
    }
}


/*
for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    temp = a[j];
                    for (int k = j; k > i; k--) {
                        a[k] = a[k - 1];
                    }
                    a[i] = temp;
                }
            }
        }
*/