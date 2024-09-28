public class AlternatingCase {
    public static void main(String[] args) {
        String t = "ErMaHGeRD";
        System.out.println(altd(t));
    }

    private static String altd(String string) {
        String result = "";
        for (char c : string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;
    }
}
