import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class Xoring {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int m = 10;
        System.out.println(xoring(x, m));
        System.out.println(bedder(x, m));
        System.out.println(xoring2(x, m));
    }

    private static int xoring2(int[] x, int m) {
        int xorResult = 0;

        for (int i = 1; i <= m; i++) {
            xorResult ^= i;
        }


        for (int num : x) {
            xorResult ^= num;
        }

        return xorResult;
    }

    private static int bedder(int[] x, int m) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.stream(x).forEach(set::add);
        return IntStream.rangeClosed(1, m)
                .filter(i -> !set.contains(i))
                .findFirst()
                .orElse(-1);

    }

    private static int xoring(int[] x, int m) {
        return IntStream.rangeClosed(1, m)
                .filter(t -> Arrays.stream(x).noneMatch(w -> w == t))
                .findFirst()
                .orElse(1);

    }
}
