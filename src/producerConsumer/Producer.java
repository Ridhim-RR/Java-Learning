package producerConsumer;

import java.util.concurrent.Semaphore;

public class Producer implements  Runnable {
    private final Store store;
    private Semaphore prod;
    private Semaphore cons;

    Producer(Store st, Semaphore prod, Semaphore cons) {
        this.store = st;
        this.prod = prod;
        this.cons = cons;
    }

    public void run() {
        while (true) {
            try {
                this.prod.acquire();
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
            this.cons.release();


        }
    }
}
