package lambda;
import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type, message;
    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Emergency", "Patient needs immediate attention!"),
            new Alert("Reminder", "Time for medication."),
            new Alert("Lab Report", "Blood test results available.")
        );

        Predicate<Alert> isEmergency = a -> a.type.equals("Emergency");

        System.out.println("Filtered Alerts:");
        alerts.stream()
              .filter(isEmergency)
              .forEach(System.out::println);
    }
}

