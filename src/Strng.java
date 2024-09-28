import java.util.Arrays;

public class Strng {
    public static void main(String[] args) {
        String[] a1 = {"arp", "live", "strong"};
        String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};
        System.out.println(Arrays.toString(tested(a1, a2)));
    }

    private static String[] tested(String[] a1, String[] a2) {
        return Arrays.stream(a1)
                .filter(x -> Arrays.stream(a2).anyMatch(y -> y.contains(x)))
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }
}
