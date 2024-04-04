package inheritance;

public class Students extends  User implements Running{
    int rollNo;

    void doSomething(){
        rollNo = 21;
        email = "ridhim@123";
        age = 10;
        user_id= rollNo;
        setPassword("123Pass");
    }
public void run(){
        System.out.println("Running");
  }


}
