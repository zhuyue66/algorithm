package leetcode;

/**
 * @Author: zhuda
 * @Description: invert an integer
 * @Date: Create in 20:51 2019/3/27
 */
public class Question7 {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(resulterse(563847412));
    }

    public static int resulterse(int x) {
        int result = 0;
        while (x != 0) {
            int temp = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && temp > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && temp < -8)) return 0;
            result = result * 10 + temp;
        }
        return result;
    }
}