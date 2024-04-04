package AdapterPattern;

public class PhonePe {
    Bank b;

    public PhonePe(){
        b = new IciciAdapter();
//        b = new yesbankAdapter();
    }

    int seeBalance(){
        return b.getBalance();
    }

}
