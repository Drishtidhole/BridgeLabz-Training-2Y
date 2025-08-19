
    public class CourseFeeDiscount {
    public static void main(String[] args) {
        double originalFee = 125000; 
        double discountRate = 0.10;   

       
        double discountAmount = originalFee * discountRate;

       
        double discountedPrice = originalFee - discountAmount;

       
        System.out.println("Original Course Fee: INR " + originalFee);
        System.out.println("Discount Amount: INR " + discountAmount);
        System.out.println("Discounted Price: INR " + discountedPrice);
    }
}


