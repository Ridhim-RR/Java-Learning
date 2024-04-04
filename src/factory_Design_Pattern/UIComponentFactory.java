package factory_Design_Pattern;

import factory_Design_Pattern.components.button.button;
import factory_Design_Pattern.menu.menu;

import java.awt.*;

public interface UIComponentFactory {
    public button createButton();

    public menu createMenu();
}
