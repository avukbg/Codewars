import java.util.Arrays;
import java.util.stream.IntStream;

public class MinMAx {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(mathz(n)));
    }

    public static int[] mathz(int[] n) {
        return new int[]{Arrays.stream(n).min().getAsInt(), Arrays.stream(n).max().getAsInt()};

    }
}
