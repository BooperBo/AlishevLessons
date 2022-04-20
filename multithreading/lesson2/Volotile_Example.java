package multithreading.lesson2;

import java.util.Scanner;

class Volotile_Example {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        mythread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        mythread.shutdown();
    }
}

class MyThread extends Thread {
    private volatile boolean running = true;
    @Override
    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
