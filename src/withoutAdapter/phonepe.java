package withoutAdapter;

public class phonepe {
    yesBank y;

    phonepe(){
        this.y = new yesBank();
    }

    public int checkBalance(){
        return y.getBalance();
    }
}
