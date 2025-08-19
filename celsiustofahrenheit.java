public class celsiustofahrenheit{
    public static void main (string [] args){
        Scanner scanner = new Sacnner System.in  ;
        System.out.println ("Enter temperature in celsius");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.print("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);

    }
}