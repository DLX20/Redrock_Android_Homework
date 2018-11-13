import java.util.Scanner;

public class LevelOne1 {
    public static void main(String[] args) {
        System.out.println("请输入等腰梯形的上底，下底和高");
        Scanner scan = new Scanner(System.in);
        float a = scan.nextInt();       //上底
        float b = scan.nextInt();       //下底
        float c = scan.nextInt();       //高
        float m = (b - a) / 2;
        float e = m;
        for (float i = 1; i <= c; i += (c / m)) {
            for (float j = e; j > 0; j--) {
                System.out.print(" ");
            }
            for (float k = 0; k < a; k++) {
                System.out.print("*");
            }
            System.out.println();
            a += 2;
            e--;
        }

    }
}
