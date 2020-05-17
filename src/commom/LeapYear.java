package commom;

import java.util.Scanner;

/**
 * @Author: zhuda
 * @Description: judge a year is a leap year or not
 * @Date: Create in 15:18 2019/3/23
 *
 * 能被4整除且不能被100整除 或者 能被400整除
 *
 */
public class LeapYear {

    public static void main(String[] args) {
        System.out.println("input a year number：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int year = Integer.valueOf(s);
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }
    }

}
