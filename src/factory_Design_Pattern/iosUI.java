package factory_Design_Pattern;

import factory_Design_Pattern.components.button.button;
import factory_Design_Pattern.components.button.iosButton;
import factory_Design_Pattern.menu.IosMenu;
import factory_Design_Pattern.menu.menu;

public class iosUI implements UIComponentFactory {

    public button createButton(){
        return  new iosButton();
    }
    public menu createMenu(){
        return  new IosMenu();
    }
}
