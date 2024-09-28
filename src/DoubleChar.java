import java.util.Arrays;
import java.util.stream.Collectors;

public class DoubleChar {
    public static void main(String[] args) {
        String t = "String";
        System.out.println(dbld(t));
    }

    private static String dbld(String t) {
        return t.replaceAll(".", "$0$0");
    }
}
