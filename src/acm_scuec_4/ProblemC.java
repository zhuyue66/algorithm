package acm_scuec_4;

import java.util.Scanner;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 13:37 2019/4/22
 */
public class ProblemC {
    static int[][] a = new int[51][20];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int N = scanner.nextInt();
            int c;
            int d = 0;
            a[0][0] = 1;
            a[1][0] = 1;

            for (int i=2;i<=N;i++){
                c=0;
                for (int j=0;j<=d;j++){
                    a[i][j] = a[i-1][j]+a[i-2][j]+c;
                    c = a[i][j]/10;
                    a[i][j]%=10;
                }

                while (c!=0){
                    a[i][++d]=c%10;
                    c/=10;
                }

            }

            for (int i=d;i>=0;i--){
                System.out.print(a[N][i]);
            }
        }

    }
}
