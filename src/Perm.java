import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Perm {
    public static void main(String[] args) {
        String t = "uu ka";
        System.out.println(singlePermutations(t));

    }

    public static List<String> singlePermutations(String s) {

        Set<String> set = new HashSet<>();
        if (s.length() == 1) {
            set.add(s);
        } else {
            for (int i = 0; i < s.length(); i++) {
                List<String> temp = singlePermutations(s.substring(0, i) + s.substring(i + 1));
                for (String string : temp) {
                    set.add(s.charAt(i) + string);
                }
            }
        }

        return new ArrayList<>(set);
    }
}
