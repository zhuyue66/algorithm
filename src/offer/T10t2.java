package offer;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 14:28 2020/3/22
 */
public class T10t2 {
    public static void main(String[] args) {
        //System.out.println(numWays(11));
        System.out.println(permutation(4,3));
    }

    public static int numWays(int n) {
        int count = 0;
        if (n % 2 == 0) {

        }
        return 1%1000000007;
    }


    public static int permutation(int n, int m) {
        int temp1 = 1;
        int temp2 = 1;

        for (int i = 1; i <= m; i++) {
            temp1 *= i;
        }

        while (m-- > 0) {
            temp2 *= n--;
        }

        return temp2 / temp1;
    }

}
