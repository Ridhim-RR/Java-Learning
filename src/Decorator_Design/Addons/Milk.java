package Decorator_Design.Addons;

import Decorator_Design.Bevarage;

public class Milk implements addon {
    Bevarage b;

    public Milk(Bevarage b){
        this.b = b;
    }
    public int getPrice(){
        return 30 + b.getPrice();
    }
}
