package lambda;
git add"lambda"interface LightBehavior {
    void activate();
}

public class SmartHomeLighting {
    public static void main(String[] args) {

        LightBehavior motion = () -> System.out.println("Motion detected! Lights ON.");
        LightBehavior morning = () -> System.out.println("Morning mode: Warm lights ON.");
        LightBehavior night = () -> System.out.println("Night mode: Lights dimmed.");
        LightBehavior voice = () -> System.out.println("Voice: 'Turn off lights' → Lights OFF.");

        activate("Motion", motion);
        activate("Morning", morning);
        activate("Night", night);
        activate("Voice", voice);
    }

    static void activate(String trigger, LightBehavior behavior) {
        System.out.println("\nTrigger: " + trigger);
        behavior.activate();
    }
}

