public class SumStringInt {
    public static void main(String[] args) {
        String a = "9";
        String b = "3";
        System.out.println(suma(a, b));
    }

    public static String suma(String a, String b) {

        return String.valueOf(Long.parseLong(a) + Long.parseLong(b));
    }
}
