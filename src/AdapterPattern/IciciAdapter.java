package AdapterPattern;

import AdapterPattern.thirdparty.Icici;

public class IciciAdapter implements Bank{
    Icici i = new Icici();

    public int getBalance(){
        return i.balanceCheck();
    }

}
