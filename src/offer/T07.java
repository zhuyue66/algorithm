package offer;

import java.util.Stack;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 20:21 2020/3/5
 */
public class T07 {
    public static void main(String[] args) {

    }

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int size;

    public T07() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
        size = 0;
    }

    public void appendTail(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        size++;
    }

    public int deleteHead() {
        if (size == 0) {
            return -1;
        }
        size--;
        return stack1.pop();
    }

}
