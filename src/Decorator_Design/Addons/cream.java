package Decorator_Design.Addons;

import Decorator_Design.Bevarage;

public class cream implements addon{
    Bevarage b;

    public cream(Bevarage b){
        this.b = b;
    }
    public int getPrice(){
        return 50 + b.getPrice();
    }
}
