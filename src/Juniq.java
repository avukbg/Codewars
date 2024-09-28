import java.util.Arrays;
import java.util.HashSet;

import static java.lang.String.join;

public class Juniq {
    public static void main(String[] args) {
        String[] n1 = {"Wyza", "Emma", "Olivia"};
        String[] n2 = {"Olivia", "Sophia", "Emma"};
        juniq1(n1, n2);
        juniq2(n1, n2);
    }

    private static void juniq2(String[] n1, String[] n2) {
        String[] n3 = new String[n1.length + n2.length];
        System.arraycopy(n1, 0, n3, 0, n1.length);
        System.arraycopy(n2, 0, n3, n1.length, n2.length);
        System.out.println(Arrays.toString(Arrays.stream(n3).distinct().toArray()));

        HashSet<String> set = new HashSet<>();
        Arrays.stream(n1).forEach(set::add);
        Arrays.stream(n2).forEach(set::add);
        System.out.println(Arrays.toString(Arrays.stream(set.toArray(new String[0])).sorted().toArray()));

    }

    private static void juniq1(String[] n1, String[] n2) {
        System.out.println(Arrays.toString(
                Arrays.stream(n1).filter(x -> Arrays.stream(n2).anyMatch(y -> !y.equals(x))).toArray(String[]::new)
        ));
    }
}
