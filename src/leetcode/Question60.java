package leetcode;

import java.util.Stack;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 15:23 2020/9/5
 */
public class Question60 {

    private static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        permutation(1, 3, 0, 3);
    }

    public static void permutation(int min, int max, int current, int maxNum) {
        if (current == maxNum) {
            System.out.println(stack);
            return;
        }
        for (int i = min; i <= max; i++) {
            stack.push(i);
            permutation(i, max, current+1, maxNum);
            stack.pop();
        }
    }
}
