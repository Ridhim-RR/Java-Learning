package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<inter> participate = new ArrayList();
        Bats b = new Bats();
        Dog d = new Dog() ;
        participate.add(d);
        for(inter a: participate){
            a.run();
        }
    }
}
