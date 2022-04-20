package multithreading.lesson3;

class SynchronizedExample {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        SynchronizedExample example = new SynchronizedExample();
        example.doWork();

    }

    public synchronized void increment() { //неявный объект синхронизации
        counter++;
    }

    public void doWork() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        thread.start();
        thread.join();

        thread1.start();
        thread1.join();

        System.out.println(counter);
    }
}


