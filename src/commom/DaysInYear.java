package commom;

import java.util.Scanner;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 15:31 2019/3/23
 */
public class DaysInYear {
    public static void main(String[] args) {
        int year, mouth, day, days=0;
        boolean isLeapYear;
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        mouth = scanner.nextInt();
        day = scanner.nextInt();
        isLeapYear = isLeapYear(year);
        if (isLeapYear) {
            for (int i = 1; i <= mouth-1; i++) {
                switch (i) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        days += 31;
                        break;
                    case 2:
                        days += 29;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        days += 30;
                        break;
                }
            }
        } else {
            for (int i = 1; i <= mouth-1; i++) {
                switch (i) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        days += 31;
                        break;
                    case 2:
                        days += 28;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        days += 30;
                        break;
                }
            }
        }
        System.out.println(days + day);
    }


    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
