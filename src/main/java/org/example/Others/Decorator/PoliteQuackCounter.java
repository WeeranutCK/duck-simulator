/*
    6510405806
    Weeranut Chayakul
*/

package main.java.org.example.Others.Decorator;

import main.java.org.example.Quackable;

public class PoliteQuackCounter extends QuackCounter {
    static int numberOfPoliteQuacks;

    public PoliteQuackCounter(Quackable duck) {
        super(duck);
    }

    @Override
    public void quack() {
        super.quack();
        numberOfPoliteQuacks++;
    }

    public static int getNumberOfPoliteQuacks() {
        return numberOfPoliteQuacks;
    }
}
