package multithreading.lesson12;

import java.util.Random;

public class Thread_Interruption_Example {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 100_000_000; i++) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Thread was interrupted");
                        break;
                    }
                    Math.sin(random.nextDouble());
                }
            }
        });
        System.out.println("Starting thread");

        thread1.start();

        Thread.sleep(1000);
        thread1.interrupt();

        thread1.join();



        System.out.println("Thread has finished");
    }
}
