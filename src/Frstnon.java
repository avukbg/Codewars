public class Frstnon {
    public static void main(String[] args) {
        String t = "sTress";
        System.out.println(fst(t));
    }

    private static String fst(String s) {
        for (String str : s.split("")) {
            if (s.toUpperCase().indexOf(str.toUpperCase()) == s.toUpperCase().lastIndexOf(str.toUpperCase()))
                return str;
        }
        return "";
    }
}

