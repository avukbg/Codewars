import java.util.Arrays;
import java.util.stream.IntStream;

public class Dblother {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(Arrays.toString(dbled(a)));
    }

    private static int[] dbled(int[] a) {
        return IntStream.range(0, a.length)
                .map(i -> i % 2 == 1 ? 2 * a[i] : a[i]).toArray();
    }
}
