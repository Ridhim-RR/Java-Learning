package IntroToSynchronization;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adders implements Callable<Void> {
    private final Value v;
    private final Lock l;
    Adders(Value v, Lock l){
        this.v = v;
        this.l = l;
    }
    public Void call(){
    for(int i=0; i<10; i++){
        l.lock();
        System.out.println("Lock in the adders" +i);
        this.v.val += 1;
        l.unlock();
    }
        return null;
    }
}
