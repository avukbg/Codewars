import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 8, 9};
        int t = 17;
        System.out.println(Arrays.toString(twoo(a, t)));
    }

    private static int[] twoo(int[] a, int t) {
        HashMap<Integer, Integer> map = new HashMap<>();
        IntStream.range(0, a.length).forEach(i -> map.put(a[i], i));
        for (int i = 0; i < a.length; i++) {
            int complement = t - a[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
            map.put(a[i], i);
        }
        return null;

    }
}
