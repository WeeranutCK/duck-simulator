/*
    6510405806
    Weeranut Chayakul
*/

package main.java.org.example.Others.Decorator;

import main.java.org.example.Quackable;

public class PoliteDuckDecorator implements Quackable {
    Quackable duck;

    public PoliteDuckDecorator(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        System.out.print(" ka");
    }
}
