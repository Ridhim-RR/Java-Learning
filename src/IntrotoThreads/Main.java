package IntrotoThreads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//      helloWorld hw = new helloWorld();
////      hw.run();
//      System.out.println("Current Thread::  "+ Thread.currentThread().getName());
//      Thread t = new Thread(hw);
//      t.start();

//        ExecutorService es = Executors.newFixedThreadPool(20000);
        ExecutorService es = Executors.newCachedThreadPool();
      for(int i=0; i<=100000; i++){
          if(i == 80){
              System.out.println("HEY");
          }
            PrintNumber num = new PrintNumber(i);
//            Thread r = new Thread(num);
//            r.start();
          es.execute(num);
      }
    }

}
