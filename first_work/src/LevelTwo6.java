import static java.lang.Math.pow;

public class LevelTwo6 {
    public static void main(String[] args) {
        final double a = -1.5, b = 1.5;
        for (double y = 1.5; y >= a; y -= 0.1) {
            for (double x = -1.5; x <= b; x += 0.05) {
                if (istrue(x, y) || x == 0 || y == 0) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static boolean istrue(double x, double y) {
        if (pow((x * x + y * y - 1), 3) - (x * x * y * y * y) <= 0.0001)
            return true;
        else
            return false;
    }
}
