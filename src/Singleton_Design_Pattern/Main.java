package Singleton_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        Database d1 = Database.getInstance();
        Database d2 = Database.getInstance();
        System.out.println(d1);
    }
}
