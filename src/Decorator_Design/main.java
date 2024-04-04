package Decorator_Design;

import Decorator_Design.Addons.Milk;
import Decorator_Design.Addons.cream;

public class main {
    public static void main(String[] args) {
        Bevarage b = new Espresso();
           b = new Milk(b);
           b = new cream(b);
          System.out.println(b.getPrice());
    }
}
