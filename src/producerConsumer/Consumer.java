package producerConsumer;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private final Store store;
    private Semaphore prod;
    private Semaphore cons;

    Consumer(Store st, Semaphore prod, Semaphore cons){
        this.store = st;
        this.prod = prod;
        this.cons = cons;
    }

    @Override
    public void run() {

        while (true){
            try {
                this.cons.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            this.prod.release();
        }
    }



}
