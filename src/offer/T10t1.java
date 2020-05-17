package offer;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 20:22 2020/3/5
 */
public class T10t1 {

    public static void main(String[] args) {

        System.out.println(fib(1));

    }

    /*public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n < 0) {
            return 0;
        }else {
            return fib(n - 1) + fib(n-2);
        }
    }*/



    public static int fib(int n) {

        if (n == 0) {
            return 0;
        }

        int one = 0;
        int two = 1;
        int temp = 1;

        while (n-- > 1) {
            temp = one + two;
            one = two;
            two = temp;
        }
        return temp % 1000000007;
    }
}
