package producerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Store s = new Store(5);
        Semaphore prod = new Semaphore(5);
        Semaphore cons = new Semaphore(0);

        for(int i=0; i<8; i++){
            es.execute(new Producer(s,prod,cons));
        }
        for(int i=0; i<20; i++){
            es.execute(new Consumer(s,prod,cons));
        }
    }
}
