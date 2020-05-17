package leetcode;

import java.util.Arrays;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 21:13 2019/3/26
 */
public class Question1 {


    public static void main(String[] args) {
        int[] input = {-2,-7,-11,-15};
        int target = -18;
        System.out.println(Arrays.toString(twoSum(input, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target && nums[i] < target) {

            } else {
                result[0] = i;
                for (int j = 0; j < nums.length; j++) {
                    if (i == j) {

                    } else {
                        if (nums[j] == target-nums[i]) {
                            result[1] = j;
                            return result;
                        }
                    }
                }
            }
        }
        return result;
    }
}
