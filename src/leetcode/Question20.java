package leetcode;

import java.util.Stack;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 9:37 2019/3/31
 */
public class Question20 {

    public static void main(String[] args) {
        System.out.println(isValid("(])"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] temp = s.toCharArray();

        if (temp.length == 0) {
            return true;
        }

        for (int i = 0; i < temp.length; i++) {

            if (stack.empty()) {
                if (temp[i] == ')' || temp[i] == ']' || temp[i] == '}') {
                    return false;
                }
            }

            if (temp[i] == '(' || temp[i] == '[' || temp[i] == '{'){
                stack.push(temp[i]);
            }
            if (temp[i] == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (temp[i] == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (temp[i] == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }

            }
        }
        return stack.empty();
    }
}
