import java.util.Arrays;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.rangeClosed;

public class Powers2 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(Arrays.toString(skvrd(n)));
    }

    private static int[] skvrd(int n) {
        return rangeClosed(0, n).map(i -> (int) Math.pow(2, i)).toArray();
    }
}
