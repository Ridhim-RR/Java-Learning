package factory_Design_Pattern;

public class IOS extends platform {
    public  UIComponentFactory getFactory(){
        return new iosUI();
    }
}
