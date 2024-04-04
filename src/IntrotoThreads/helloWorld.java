package IntrotoThreads;

public class helloWorld implements Runnable {
    public void doSomething(){
        System.out.println("Hello form do something::: " + Thread.currentThread().getName());
    }
   public void run(){
       System.out.println("Hello World form:: "+ Thread.currentThread().getName());
       doSomething();
   }
}
