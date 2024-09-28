import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SheepCount {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sheep(n));
    }

    private static String sheep(int n) {
        return IntStream.rangeClosed(1, n)
                .mapToObj(i -> i + " sheep...")
                .collect(Collectors.joining());
    }
}
