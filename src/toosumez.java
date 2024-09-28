import java.util.Arrays;
import java.util.stream.IntStream;

public class toosumez {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {3, 4, 5};
        System.out.println(Arrays.toString(toos(a, b)));
    }

    private static int[] toos(int[] a, int[] b) {
        return IntStream.range(0, a.length)
                .map(i -> a[i] + b[i])
                .toArray();
    }
}
