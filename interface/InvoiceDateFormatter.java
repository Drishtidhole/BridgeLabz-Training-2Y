import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {
  
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class InvoiceDateFormatter {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Default Format: " + DateUtils.formatDate(today, "yyyy-MM-dd"));
        System.out.println("Invoice Format: " + DateUtils.formatDate(today, "dd/MM/yyyy"));
        System.out.println("US Format: " + DateUtils.formatDate(today, "MM-dd-yyyy"));
    }
}
