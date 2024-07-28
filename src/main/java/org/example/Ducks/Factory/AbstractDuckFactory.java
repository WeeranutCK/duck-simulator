/*
    6510405806
    Weeranut Chayakul
*/

package main.java.org.example.Ducks.Factory;

import main.java.org.example.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
