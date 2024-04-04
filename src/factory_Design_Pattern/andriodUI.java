package factory_Design_Pattern;

import factory_Design_Pattern.components.button.andriodButton;
import factory_Design_Pattern.components.button.button;
import factory_Design_Pattern.menu.AndriodMenu;
import factory_Design_Pattern.menu.menu;

import java.awt.*;

public class andriodUI implements UIComponentFactory{
    public button createButton(){
        return  new andriodButton();
    }

    public menu createMenu(){
        return new AndriodMenu();
    }
}
