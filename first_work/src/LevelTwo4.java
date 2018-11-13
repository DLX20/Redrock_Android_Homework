public class LevelTwo4 {
    public static void main(String[] args) {
        final int a = -1, b = 1;
        for (double y = 1; y >= a; y -= 0.25) {
            for (double x = -1; x <= b; x += 0.05) {
                if (istrue(x, y)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static boolean istrue(double x, double y) {
        if (x * x + y * y - 1 <= 0.00001)
            return true;
        else
            return false;
    }
}
