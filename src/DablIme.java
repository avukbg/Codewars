import java.util.Arrays;
import java.util.HashSet;

public class DablIme {
    public static void main(String[] args) {
        String[] a = {"Vuk", "Ana", "Vuk", "Vuk", "Miroslava", "Perica"};
        System.out.println(rtrnd(a));
    }

    private static int rtrnd(String[] a) {
        String t = "Vuk";
        //HashSet <String> set = new HashSet<>();
        int c = 0; //vec se jednom nalazi jer smo ga dodali u set
        for (String x : a) {
            if (!x.equals(t)) {
                c++;
            }
        }
        return c;

    }
}
