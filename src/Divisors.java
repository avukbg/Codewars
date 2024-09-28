import java.util.stream.IntStream;

public class Divisors {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(divisors(n));
    }

    private static int divisors(int n) {
        return (int) IntStream.rangeClosed(1, (n / 2)).filter(i -> n % i == 0).count() + 1;
    }
}
