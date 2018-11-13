import java.util.Scanner;

public class LevelOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入m,n,s的值：");
        int m = scan.nextInt();
        int s = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][s];         //定义数组
        int[][] b = new int[s][n];
        int[][] c = new int[m][n];
        System.out.println("请输入数组a:");
        for (int i = 0; i < m; i++) {              //输入第一个数组
            for (int j = 0; j < s; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("请输入数组b:");
        for (int i = 0; i < s; i++) {           //输入第二个数组
            for (int j = 0; j < n; j++) {
                b[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {       //数组计算
            for (int j = 0; j < n; j++) {
                int num = 0;
                for (int k = 0; k < s; k++) {
                    num = a[i][k] * b[k][j] + num;
                }
                c[i][j] = num;
            }
        }
        System.out.println("数组c为：");
        for (int i = 0; i < m; i++) {       //输出数组
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
