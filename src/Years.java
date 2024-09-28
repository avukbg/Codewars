import java.util.Arrays;
import java.util.stream.IntStream;

public class Years {
    public static void main(String[] args) {
        int x = 12;
        System.out.println(Arrays.toString(yrs(x)));
    }

    private static int[] yrs(int y) {
        return new int[]{y, y == 1 ? 15 : 16 + 4 * y, y == 1 ? 15 : 14 + 5 * y};
    }

}
