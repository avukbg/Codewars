public class DnaReplace {
    public static void main(String[] args) {
        String t = "GTAT";
        System.out.println(compl(t));
    }

    private static String compl(String t) {
        StringBuilder result = new StringBuilder();
        for (char c : t.toCharArray()) {
            if (c == 'A') result.append('T');
            else if (c == 'T') result.append('A');
            else if (c == 'G') result.append('C');
            else if (c == 'C') result.append('G');
            else result.append(c);
        }
        return result.toString();
    }
}
