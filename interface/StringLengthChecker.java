import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        int limit = 20;
        String message = "This is a long message!";

        Function<String, Integer> getLength = str -> str.length();

        int length = getLength.apply(message);

        if (length > limit) {
            System.out.println("⚠️ Message exceeds character limit (" + limit + ").");
        } else {
            System.out.println("✅ Message is within the limit.");
        }
    }
}

