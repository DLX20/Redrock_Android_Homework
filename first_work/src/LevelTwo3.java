public class LevelTwo3 {
    public static void main(String[] args) {
        final int a = -5, b = 4;
        for (double y = 5; y >= a; y -= 1) {
            for (double x = -4; x <= b; x += 0.5) {
                if (istrue(x, y) || x == 0 || y == 0) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static boolean istrue(double x, double y) {
        if (y * y - x == 0)
            return true;
        else
            return false;
    }
}
