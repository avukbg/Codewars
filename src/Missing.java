import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Missing {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] y = {3, 2, 4, 6, 7, 8, 1, 9};
        System.out.println((findr(x, y)));
    }

    private static int findr(int[] x, int[] y) {

        return Arrays.stream(x)
                .filter(a -> Arrays.stream(y).noneMatch(b -> b == a))
                .findFirst()
                .orElse(-1);
    }
}
