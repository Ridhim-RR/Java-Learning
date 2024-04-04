package AdapterPattern;
import AdapterPattern.thirdparty.yesBank;

public class yesbankAdapter implements Bank {
    yesBank i = new yesBank();
    @Override
    public int getBalance(){
        return i.enquireBalance();
    }


}
