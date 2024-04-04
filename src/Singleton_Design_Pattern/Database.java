package Singleton_Design_Pattern;

public class Database {
    private static Database instance = null;

    private Database(){

    }
    public static Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        System.out.println("instance");
        return  instance;
    }
}
