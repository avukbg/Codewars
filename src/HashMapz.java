import java.util.HashMap;

public class HashMapz {
    public static void main(String[] args) {
        String t = "german";
        System.out.println(greet(t));
    }

    private static String greet(String t) {
        HashMap<String, String> greeting = new HashMap<>();
        greeting.put("english", "Welcome");
        greeting.put("german", "Willkommen");

        return greeting.getOrDefault(t, greeting.get("english"));

    }
}
