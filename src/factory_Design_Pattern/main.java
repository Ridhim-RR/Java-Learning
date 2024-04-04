package factory_Design_Pattern;

import factory_Design_Pattern.components.button.button;

import java.awt.*;

public class main {
    public static void main(String[] args) {
//        platform p  = new Android();
        platform p = new IOS();
        UIComponentFactory f = p.getFactory();
        button b = f.createButton();
        b.click();
    }
}
