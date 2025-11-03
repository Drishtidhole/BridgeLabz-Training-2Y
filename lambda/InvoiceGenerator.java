package lambda;

import java.util.*;
import java.util.stream.*;

class Invoice {
    String transactionId;
    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }
    public String toString() {
        return "Invoice generated for Transaction: " + transactionId;
    }
}

public class InvoiceGenerator {
    public static void main(String[] args) {
        List<String> transactions = Arrays.asList("T1001", "T1002", "T1003");

        List<Invoice> invoices = transactions.stream()
                                             .map(Invoice::new)
                                             .toList();

        invoices.forEach(System.out::println);
    }
}

