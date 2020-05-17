package offer;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 19:47 2020/2/16
 */
public class T03 {

    public static void main(String[] args) {
        int[] test = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,3};
        System.out.println(findRepeatNumber(test));
    }

    public static int findRepeatNumber(int[] nums) {
        int result = 0;
        int[] temp = new int[nums.length];
        for (int i = 0; i < temp.length; i++) {
            temp[nums[i]]++;
            if (temp[nums[i]] > 1) {
                result =  nums[i];
            }
        }
        return result;
    }


}
