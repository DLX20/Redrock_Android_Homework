public class LevelTwo5 {
    public static void main(String[] args) {
        final int a = -5, b = 5;
        for (double y = 5; y >= a; y -= 1) {
            for (double x = -5; x <= b; x += 0.5) {
                if (istrue(x, y) ||x==0||y==0) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static boolean istrue(double x, double y) {
        if (y-x*x*x>=0&&y-x*x*x<=1.4)
            return true;
        else
            return false;
    }
}
