package search;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 15:29 2020/2/18
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] test = {11,21,31,41,51,61,71,81,91};
        System.out.println(binarySearch(test, 0, test.length, 91));
    }


    public static int binarySearch(int[] input, int low, int high, int target) {
        if (low <= high) {
            int middle = (low + high) / 2;
            if (input[middle] > target) {
                return binarySearch(input, low, middle - 1, target);
            } else if (input[middle] < target) {
                return binarySearch(input, middle + 1, high, target);
            } else{
                return middle;
            }
        } else {
            return -1;
        }
    }

}
