package producerConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    public int maxShelf;
    private final ConcurrentLinkedQueue<Object> items;

    Store(int maxShelf){
        this.maxShelf = maxShelf;
        items = new ConcurrentLinkedQueue<>();
    }

    public int getMaxShelf() {
        return maxShelf;
    }

    public ConcurrentLinkedQueue<Object> getItems() {
        return items;
    }
    public void addItem(){
        System.out.println("Producer size is :"+ this.items.size());
        this.items.add(new Object());
    }

    public void removeItem(){
        System.out.println("Consumer size is :"+ this.items.size());
        this.items.remove();
    }
}
