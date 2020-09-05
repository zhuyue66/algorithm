package leetcode;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 19:49 2020/9/5
 */
public class Question26 {
    public static void main(String[] args) {
        int[] s = {0,0,1,1,1,2,2};
        System.out.println(removeDuplicates(s));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
