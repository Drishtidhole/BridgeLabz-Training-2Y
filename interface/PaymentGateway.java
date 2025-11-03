interface PaymentProcessor {
    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed (default).");
    }
}

class Paytm implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Paytm.");
    }
}

class Razorpay implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Razorpay.");
    }

   
    public void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " issued through Razorpay.");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        PaymentProcessor p1 = new Paytm();
        PaymentProcessor p2 = new Razorpay();

        p1.pay(500);
        p1.refund(200);  

        p2.pay(1000);
        p2.refund(300);  
    }
}

