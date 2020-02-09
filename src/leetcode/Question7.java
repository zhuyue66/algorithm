package leetcode;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 20:51 2019/3/27
 */
public class Question2 {

    public static void main(String[] args) {
        System.out.println(reverse(102));
    }

    public static int reverse(int x) {
        int result = 0;
        int length = String.valueOf(x).length();
        boolean isNegative = false;

        if (x < 0) {
            isNegative = true;
            length -= 1;
            x = -x;
        }

        int[] temp = new int[length];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = x % 10;
            x /= 10;
        }

        for (int i = 0; i <=temp.length-1; i++) {
            if (temp[i] == 0) {
                result *= 10;
            } else {
                result = result + temp[i];
                if (i != temp.length-1) {
                    result *= 10;
                }
            }
        }

        if (isNegative) {
            return -result;
        }

        if (result > Integer.MAX_VALUE/10) {
            return 0;
        }
        return result;
    }
}