package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhuda
 * @Description: 罗马数字转为数值
 * @Date: Create in 16:12 2019/3/29
 *
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 *
 */
public class Question13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }

    public static int romanToInt(String s) {


        Map<Character, Integer> romanMap = new HashMap<>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result=0;
        char[] romanChar = s.toCharArray();
        for (int i = romanChar.length - 1; i >= 0; i--) {
            result += romanMap.getOrDefault(romanChar[i], 0);
            if (i!= 0) {
                if ((romanChar[i] == 'V'|| romanChar[i]=='X') && romanChar[i-1]=='I') {
                    result -= 1;
                    i--;
                }else if ((romanChar[i] == 'L'|| romanChar[i]=='C') && romanChar[i-1]=='X') {
                    result -= 10;
                    i--;
                }else if ((romanChar[i] == 'D'|| romanChar[i]=='M') && romanChar[i-1]=='C') {
                    result -= 100;
                    i--;
                }
            }
        }
        return result;
    }
}
