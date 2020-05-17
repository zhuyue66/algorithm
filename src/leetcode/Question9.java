package leetcode;

/**
 * @Author: zhuda
 * @Description: 回文数
 * @Date: Create in 21:11 2019/3/28
 */
public class Question9 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-123));
    }

    public static boolean isPalindrome(int x) {
        int pop;
        int result = 0;
        int temp = x;
        if (x < 0) {
            return false;
        } else {
            while (x != 0) {
                pop = x % 10;
                x /= 10;
                result = result * 10 + pop;
            }
            return result == temp;
        }
    }
}
