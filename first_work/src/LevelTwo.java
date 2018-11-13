import java.util.Scanner;

import static java.lang.Math.pow;

public class LevelTwo {
    public static void main(String[] args) {
        System.out.println("1.y=x;  2.y=x^2;  3.x=y^2");
        System.out.println("4.圆；  5.y=x^x^x;  6.心形");
        Scanner scan = new Scanner(System.in);
        while (true) {
            int num = scan.nextInt();
            if (num == 1)
                one();
            else if (num == 2)
                two();
            else if (num == 3)
                three();
            else if (num == 4)
                four();
            else if (num == 5)
                five();
            else
                six();
        }
    }

    private static void one() {
        final int a = -5, b = 5;
        for (double y = 5; y >= a; y -= 1) {
            for (double x = -5; x <= b; x += 1) {
                if (IstrueOne(x, y) || y == 0 || x == 0) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }


    private static boolean IstrueOne(double x, double y) {
        if (y == x)
            return true;
        else
            return false;
    }

    private static void two() {
        final int a = -5, b = 5;
        for (double y = 5; y >= a; y -= 1) {
            for (double x = -5; x <= b; x += 0.5) {
                if (IstrueTwo(x, y) || x == 0 || y == 0) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static boolean IstrueTwo(double x, double y) {
        if (y - x * x >= -0.7 && y - x * x <= 0.7)
            return true;
        else
            return false;
    }

    private static void three() {
        final int a = -5, b = 4;
        for (double y = 5; y >= a; y -= 1) {
            for (double x = -4; x <= b; x += 0.5) {
                if (IstrueThree(x, y) || x == 0 || y == 0) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static boolean IstrueThree(double x, double y) {
        if (y * y - x == 0)
            return true;
        else
            return false;
    }

    private static void four() {
        final int a = -1, b = 1;
        for (double y = 1; y >= a; y -= 0.25) {
            for (double x = -1; x <= b; x += 0.05) {
                if (IstrueFour(x, y)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static boolean IstrueFour(double x, double y) {
        if (x * x + y * y - 1 <= 0.00001)
            return true;
        else
            return false;
    }

    private static void five() {
        final int a = -5, b = 5;
        for (double y = 5; y >= a; y -= 1) {
            for (double x = -5; x <= b; x += 0.5) {
                if (IstrueFive(x, y) || x == 0 || y == 0) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static boolean IstrueFive(double x, double y) {
        if (y - x * x * x >= 0 && y - x * x * x <= 1.4)
            return true;
        else
            return false;
    }

    private static void six() {
        final double a = -1.5, b = 1.5;
        for (double y = 1.5; y >= a; y -= 0.1) {
            for (double x = -1.5; x <= b; x += 0.05) {
                if (IstrueSix(x, y) || x == 0 || y == 0) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static boolean IstrueSix(double x, double y) {
        if (pow((x * x + y * y - 1), 3) - (x * x * y * y * y) <= 0.0001)
            return true;
        else
            return false;
    }
}





