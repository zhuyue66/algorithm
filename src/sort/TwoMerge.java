package sort;

import java.util.Arrays;

/**
 * @Author: zhuda
 * @Description: 二路归并排序
 * @Date: Create in 20:49 2020/5/17
 */
public class TwoMerge {

    public static void main(String[] args) {
        int[] a = {4, 9, 2, 7, 1, 8, 9, 5, 3};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    public static void mergeSort(int[] a, int low, int high) {
        if (low < high) {//递归结束条件
            int mid = (low + high) / 2;
            mergeSort(a, low, mid);//左子表递归排列有序
            mergeSort(a, mid + 1, high);//右子表递归排列有序
            merge(a, low, mid, high);//将两有序子表合并
        }

    }


    public static void merge(int[] a, int low, int mid, int high) {//两有序子表合并方法

        //这里把要排序数组copy一份，用来比较，原来的数组用来保存比较后的信息
        int[] temp = new int[a.length];
        for (int i = low; i <= high; i++) {//注意这里copy时，下标是从low开始的，要是为了保证copy的数组下标与目标数组下标一致，这样是为了方便后面的比较的下标操作
            temp[i] = a[i];//当然copy的数组保存时也可以从0开始保存，但是这样就要注意后面的比较操作时，i就不是小于mid了，而是小于mid-low，j也不是小于high，j是小于high-low
        }

        int i = low, j = mid + 1, k = low;//把数组分为前后相同的两端进行比较。i指向前半段，j指向后半段，k指向要保存的位置
        for (; i <= mid && j <= high; k++) {//比较
            if (temp[i] < temp[j]) {
                a[k] = temp[i++];
            } else {
                a[k] = temp[j++];
            }

        }
        while (j <= high)//若第一个表没检测完，复制
            a[k++] = temp[j++];

        while (i <= mid)//若第二个表没检测完，复制
            a[k++] = temp[i++];
    }


}
