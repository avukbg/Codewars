import java.util.Arrays;

public class SheepFalse {
    public static void main(String[] args) {
        boolean[] sheep = {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};
        System.out.println(cntr(sheep));
    }

    private static int cntr(boolean[] sheep) {
        int c = 0;
        for (boolean b : sheep) {
            if (b == true) {
                c++;
            }
        }
        return c;
    }
}
