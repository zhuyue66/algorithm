package offer;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 18:57 2020/3/5
 */
public class T05 {

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }

    public static String replaceSpace(String s) {
        return s.replaceAll(" ", "%20");
    }

}
