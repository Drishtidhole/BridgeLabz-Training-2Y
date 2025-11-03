public class BackgroundJob {
    public static void main(String[] args) {
        Runnable job = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(2000);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background job completed!");
        };

        Thread backgroundThread = new Thread(job);
        backgroundThread.start();

        System.out.println("Main thread continues running...");
    }
}

