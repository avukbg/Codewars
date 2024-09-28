import java.util.Arrays;

public class oddOne {
    public static void main(String[] args) {
        int n[] = {17, 17, 3, 17, 17, 17, 17};
        System.out.println(oddr(n));
    }

    private static int oddr(int[] n) {
        return Arrays.stream(n).reduce((x, y) -> x ^ y).getAsInt();
    }
}
