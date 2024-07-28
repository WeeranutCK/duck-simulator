/*
    6510405806
    Weeranut Chayakul
*/

package main.java.org.example.Others.Adapter;

import main.java.org.example.Others.Pigeon;
import main.java.org.example.Quackable;

public class PigeonAdapter implements Quackable {
    Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        pigeon.coo();
        System.out.print(" ");
        pigeon.coo();
    }
}
