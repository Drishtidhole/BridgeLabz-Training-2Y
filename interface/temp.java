import java.util.function.Predicate;

public class temp  {
    public static void main(String[] args) {
        double threshold = 40.0;
        double currentTemp = 42.5;

        Predicate<Double> isHighTemp = temp -> temp > threshold;

        if (isHighTemp.test(currentTemp)) {
            System.out.println(" Alert: Temperature crossed the threshold!");
        } else {
            System.out.println(" Temperature is normal.");
        }
    }
}

