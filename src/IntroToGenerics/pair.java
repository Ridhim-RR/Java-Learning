package IntroToGenerics;

public class pair <V,S>{
    V x;
    S y;

    public void setX(V x){
        this.x = x;
    }
    public  void  setY(S y){
        this.y = y;
    }
  public static <v,s> void doSomething(v x, s y){
    System.out.println("Hey");
    }

    public  <v,s> void something(v x, s y){
        System.out.println("Bye");
    }
 }
