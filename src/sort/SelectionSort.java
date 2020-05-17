package sort;

import java.util.Scanner;

/**
 * zhuda
 * 2018/12/2
 * @author zhuda
 */
public class SelectionSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] a = s.toCharArray();
        char temp;
        int minIndex;

        for (int i = 0; i < a.length-1; i++) {
            minIndex = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
        System.out.println(a);
    }
}

/*

publi

 */