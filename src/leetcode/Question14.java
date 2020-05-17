package leetcode;

/**
 * @Author: zhuda
 * @Description: longest Common Prefix
 * @Date: Create in 8:36 2019/3/30
 */
public class Question14 {

    public static void main(String[] args) {
        String[] input = {};
        System.out.println(longestCommonPrefix(input));
    }


    public static String longestCommonPrefix(String[] strs) {

        if(strs.length == 0){
            return "";
        }

        char[] result = strs[0].toCharArray();
        int end = 0;

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < result.length) {
                result = strs[i].toCharArray();
            }
        }

        for (int i = 0; i < result.length; i++) {//遍历最短字符串
            char temp = strs[0].toCharArray()[i];//以第一个字符串为标志位
            boolean isSame = true;
            for (String str : strs) {
                if (temp != str.toCharArray()[i]) {
                    isSame = false;
                    if (i == 0) {
                        return "";
                    }
                }
            }
            if (isSame) {
                end++;
            }
        }
        return String.valueOf(result).substring(0,end);
    }
}
