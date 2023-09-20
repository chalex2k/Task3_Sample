import java.util.Locale;
import java.util.Scanner;

// Соответствуют первому варианту задачи
public class Program {
    public static final Line L1 = new Line(-1, 6, 5.0 / 2);
    public static final HorizontalParabola P1 = new HorizontalParabola(2, 2, 1);

    public static SimpleColor getColor(double x, double y) {
        if (P1.isPointRightOfParabola(x, y)) {
            return SimpleColor.ORANGE;
        }
        if (y < -2 && L1.isPointAboveLine(x, y)) {
            return SimpleColor.GREEN;
        }
        if (y < -2 && !L1.isPointAboveLine(x, y)) {
            return SimpleColor.YELLOW;
        }
        return SimpleColor.GRAY;
    }

    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%s, %s) -> %s\n", x, y, getColor(x, y));
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        printColorForPoint(-7, 5);
        printColorForPoint(-1, -1);
        printColorForPoint(7, 5);
        printColorForPoint(3.5, 2.2);
        printColorForPoint(-9, 0);
        printColorForPoint(-8, -1.1);
        printColorForPoint(-8, -4);
        printColorForPoint(0, -5);

        System.out.print("Input x: ");
        double x = scanner.nextDouble();
        System.out.print("Input y: ");
        double y = scanner.nextDouble();
        printColorForPoint(x, y);
    }
}