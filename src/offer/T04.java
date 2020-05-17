package offer;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 15:59 2020/2/17
 */
public class T04 {
    public static void main(String[] args) {
        int[][] test = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        System.out.println(findNumberIn2DArray(test, 50));

    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {

        if (matrix.length == 0) {
            return false;
        }

        int line = matrix.length;
        int column = matrix[0].length;
        boolean flag = false;
        for (int i = 0; i < line; i++) {
            if (binarySearch(matrix[i], 0, column - 1, target) != -1) {
                flag = true;
                break;
            } else {
            }
        }
        return flag;
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
