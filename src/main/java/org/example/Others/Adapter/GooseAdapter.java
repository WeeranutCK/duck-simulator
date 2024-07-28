/*
    6510405806
    Weeranut Chayakul
*/

package main.java.org.example.Others.Adapter;

import main.java.org.example.Others.Goose;
import main.java.org.example.Quackable;

public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
