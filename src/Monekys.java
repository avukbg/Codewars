import java.util.Arrays;
import java.util.stream.IntStream;

public class Monekys {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(cntd(n)));
    }

    private static int[] cntd(int n) {
        return IntStream.rangeClosed(1, n).toArray();
    }
}
